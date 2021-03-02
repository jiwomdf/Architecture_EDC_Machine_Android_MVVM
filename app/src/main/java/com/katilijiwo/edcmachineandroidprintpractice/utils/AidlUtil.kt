package com.katilijiwo.edcmachineandroidprintpractice.utils

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.graphics.Bitmap
import android.os.IBinder
import android.os.RemoteException
import android.widget.Toast
import com.katilijiwo.edcmachineandroidprintpractice.model.InsertTransaction
import com.katilijiwo.edcmachineandroidprintpractice.model.ProductDatabase
import com.katilijiwo.edcmachineandroidprintpractice.util.Util
import woyou.aidlservice.jiuiv5.IWoyouService

class AidlUtil private constructor() {
    private val SERVICE_PACKAGE = "woyou.aidlservice.jiuiv5"
    private val SERVICE_ACTION = "woyou.aidlservice.jiuiv5.IWoyouService"
    companion object {
        val instance = AidlUtil()
    }
    private var woyouService: IWoyouService? = null
    private var context: Context? = null
    fun connectPrinterService(context: Context) {
        this.context = context.applicationContext
        val intent = Intent()
        intent.setPackage(SERVICE_PACKAGE)
        intent.setAction(SERVICE_ACTION)
        context.applicationContext.startService(intent)
        context.applicationContext
            .bindService(intent, connService, Context.BIND_AUTO_CREATE)
    }

    private val connService: ServiceConnection = object : ServiceConnection {
        override fun onServiceDisconnected(name: ComponentName) {
            woyouService = null
        }

        override fun onServiceConnected(name: ComponentName, service: IBinder) {
            woyouService = IWoyouService.Stub.asInterface(service)
        }
    }

    fun initPrinter() {
        if (woyouService == null) {
            Toast.makeText(context, "System Belum Siap", Toast.LENGTH_LONG).show()
            return
        }
        try {
            woyouService!!.printerInit(null)
        } catch (e: RemoteException) {
            e.printStackTrace()
        }
    }

    fun printText(
        data: InsertTransaction?,
        data_list : List<ProductDatabase?>
    ) {
        if (woyouService == null) {
            return
        }
        try {

            woyouService!!.sendRAWData(ESCUtil.boldOn(), null)
            woyouService!!.setAlignment(1, null)
            woyouService!!.printTextWithFont("PCS Indonesia\n Jakarta", null, 20f, null)
            woyouService!!.lineWrap(2, null)
            woyouService!!.setAlignment(0, null)
            woyouService!!.sendRAWData(ESCUtil.boldOff(), null)
            woyouService!!.printTextWithFont("No. Trx : #${data?.id} \n", null, 20f, null)
            woyouService!!.printTextWithFont("Date : ${data?.created_date} \n", null, 20f, null)
            woyouService!!.printTextWithFont("No. Ref : ${data?.traceNumber} \n", null, 20f, null)
            woyouService!!.printText("-----------------------------\n", null)
            for (item in data_list){
                woyouService!!.printTextWithFont(item?.productName + "\n", null, 20f, null)
                woyouService!!.printTextWithFont(Util.rowItemPrint(item?.qty.toString(),item?.productPrice,item?.subTotal.toString()), null, 20f, null)
            }

            if (data_list != null) {
                woyouService!!.printText("-----------------------------\n", null)
                woyouService!!.setAlignment(1, null)
                woyouService!!.sendRAWData(ESCUtil.boldOn(), null)
                woyouService!!.sendRAWData(ESCUtil.alignCenter(), null)

                woyouService!!.printTextWithFont("Sub Total: ${Util.numberCur(data?.totalTrx.toString())}\n", null, 20f, null)
                woyouService!!.printTextWithFont("Pajak: Not Set \n", null, 20f, null)
                woyouService!!.printTextWithFont("Total: ${Util.numberCur(data?.totalTrx.toString())}\n", null, 20f, null)
                woyouService!!.sendRAWData(ESCUtil.boldOff(), null)
            }
            woyouService!!.setAlignment(1, null)
            woyouService!!.printText("-----------------------------\n", null)
            woyouService!!.sendRAWData(ESCUtil.boldOff(), null)
            woyouService!!.printTextWithFont("*NO SIQNATURE REQUIRED*\n", null,20f,null)
             woyouService!!.printTextWithFont("TERIMA KASIH" + "\n", null,20f,null)
        } catch (e: RemoteException) {
            e.printStackTrace()
        }
    }

    fun printTextDummy(
        data: InsertTransaction?
    ) {
        if (woyouService == null) {
            return
        }
        try {

            woyouService!!.sendRAWData(ESCUtil.boldOn(), null)
            woyouService!!.setAlignment(1, null)
            woyouService!!.printTextWithFont("PCS Indonesia\n Jakarta", null, 20f, null)
            woyouService!!.lineWrap(2, null)
            woyouService!!.setAlignment(0, null)
            woyouService!!.sendRAWData(ESCUtil.boldOff(), null)
            woyouService!!.printTextWithFont("No. Trx : #${data?.id} \n", null, 20f, null)
            woyouService!!.printTextWithFont("Date : ${data?.created_date} \n", null, 20f, null)
            woyouService!!.printTextWithFont("No. Ref : ${data?.traceNumber} \n", null, 20f, null)
            woyouService!!.printText("-----------------------------\n", null)
//            for (item in data_list){
//                woyouService!!.printTextWithFont(item?.productName + "\n", null, 20f, null)
//                woyouService!!.printTextWithFont(Util.rowItemPrint(item?.qty.toString(),item?.productPrice,item?.subTotal.toString()), null, 20f, null)
//            }

//            if (data_list != null) {
//                woyouService!!.printText("-----------------------------\n", null)
//                woyouService!!.setAlignment(1, null)
//                woyouService!!.sendRAWData(ESCUtil.boldOn(), null)
//                woyouService!!.sendRAWData(ESCUtil.alignCenter(), null)
//
//                woyouService!!.printTextWithFont("Sub Total: ${Util.numberCur(data?.totalTrx.toString())}\n", null, 20f, null)
//                woyouService!!.printTextWithFont("Pajak: Not Set \n", null, 20f, null)
//                woyouService!!.printTextWithFont("Total: ${Util.numberCur(data?.totalTrx.toString())}\n", null, 20f, null)
//                woyouService!!.sendRAWData(ESCUtil.boldOff(), null)
//            }
            woyouService!!.setAlignment(1, null)
            woyouService!!.printText("-----------------------------\n", null)
            woyouService!!.sendRAWData(ESCUtil.boldOff(), null)
            woyouService!!.printTextWithFont("*NO SIQNATURE REQUIRED*\n", null,20f,null)
            woyouService!!.printTextWithFont("TERIMA KASIH" + "\n", null,20f,null)
        } catch (e: RemoteException) {
            e.printStackTrace()
        }
    }

    fun printBitmap(bitmap: Bitmap?) {
        if (woyouService == null) {
            Toast.makeText(context, "System Belum Siap", Toast.LENGTH_LONG).show()
            return
        }
        try {
            woyouService!!.setAlignment(1, null)
            woyouService!!.printBitmap(bitmap, null)
            woyouService!!.lineWrap(1, null)
        } catch (e: RemoteException) {
            e.printStackTrace()
        }
    }

    fun print5Line() {
        if (woyouService == null) {
            Toast.makeText(context, "System belum siap",Toast.LENGTH_LONG).show()
            return
        }
        try {
            woyouService!!.lineWrap(5, null)
        } catch (e: RemoteException) {
            e.printStackTrace()
        }
    }

}