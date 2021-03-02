package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Top (
    @field:SerializedName("qty")
    val qty: String? = null,

    @field:SerializedName("product_name")
    val product_name: String? = null
):Parcelable