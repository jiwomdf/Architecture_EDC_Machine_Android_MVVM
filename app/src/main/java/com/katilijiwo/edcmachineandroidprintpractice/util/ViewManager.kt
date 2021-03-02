package com.katilijiwo.edcmachineandroidprintpractice.util

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.katilijiwo.edcmachineandroidprintpractice.R
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*


fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun ImageView.imageViewGlide(context: Context, url: String?) {
    val requestOptions = RequestOptions()
    requestOptions.placeholder(R.drawable.emptyimage)
    Glide.with(context).load(url).apply(requestOptions).into(this)
}

fun TextView.currencyFormat(price: String?) {
    val locale = Locale("in", "ID")
    val numberFormat: NumberFormat = NumberFormat.getCurrencyInstance(locale)
    text = numberFormat.format(price?.toDouble())
}

@SuppressLint("SimpleDateFormat")
fun TextView.getTime(date:String?):String{
    val newFormat = SimpleDateFormat("E, MMM dd yyyy HH:mm")
    return  newFormat.format(date)
}



