package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Payment(

    @field:SerializedName("trace_number")
    val trace_number: String? = null,

    @field:SerializedName("reference_number")
    val reference_number: String? = null,

    @field:SerializedName("amount")
    val amount: String? = null,

    @field:SerializedName("payment_type")
    val paymentType: String? = null,

    @field:SerializedName("app_trx_id")
    val idTrx: String? = null,

    @field:SerializedName("id_trx")
    val idTrx2: String? = null
) : Parcelable