package com.katilijiwo.edcmachineandroidprintpractice.features.main

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import com.katilijiwo.edcmachineandroidprintpractice.R
import com.katilijiwo.edcmachineandroidprintpractice.base.BaseActivity
import com.katilijiwo.edcmachineandroidprintpractice.databinding.ActivityMainBinding
import com.katilijiwo.edcmachineandroidprintpractice.model.InsertTransaction
import com.katilijiwo.edcmachineandroidprintpractice.util.Util
import com.katilijiwo.edcmachineandroidprintpractice.utils.AidlUtil.Companion.instance
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

@AndroidEntryPoint
class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>(
    R.layout.activity_main,
    MainViewModel::class.java
), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        instance.connectPrinterService(this)
    }

    override fun setListener() {
        super.setListener()

        binding.btnDetailPrint.setOnClickListener(this)

        viewModel.sunmiP1Data.observe(this, {
            printSunmiP1(it)
        })

        viewModel.sunmiP1BRI.observe(this, {
            printSunmiBRI(it)
        })
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_detail_print -> {
                val model = Build.MODEL
                Log.e("Cek Model", model)
                when (model) {
                    Util.DEVICE_SUNMI_P1 -> viewModel.getDataSunmiP1()
                    Util.DEVICE_SUNMI_BRI-> viewModel.getDataSunmiBRI()
                    else -> toast("Perangkat tidak mendukung print struk")
                }
            }
        }
    }

    private fun printSunmiP1(insertTransaction: InsertTransaction) {
        try {
            val logo = BitmapFactory.decodeResource(this@MainActivity.resources, R.drawable.struk)
            Log.d("Test", logo.width.toString())
            instance.initPrinter()
            instance.printBitmap(Bitmap.createScaledBitmap(logo, 200, 200, false))
            instance.printTextDummy(insertTransaction)
            instance.print5Line()
        } catch (error: Error) {
            toast(error.message.toString())
        }
    }

    private fun printSunmiBRI(insertTransaction: InsertTransaction) {
        try {
            val logo = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.struk)
            instance.initPrinter()
            instance.printBitmap(Bitmap.createScaledBitmap(logo, 200, 200, false))
            instance.printTextDummy(insertTransaction)
            instance.print5Line()
        } catch (error: Error) {
            toast(error.message.toString())
        }
    }

}