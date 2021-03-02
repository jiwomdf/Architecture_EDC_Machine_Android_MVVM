package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class InsertTransaction(
    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("total_trx")
    val totalTrx: Int? = null,

    @field:SerializedName("trace_number")
    val traceNumber: String? = null,

    @field:SerializedName("id_user")
    val idUser: Int? = null,

    @field:SerializedName("pay_method")
    val payMethod: String? = null,

    @field:SerializedName("detail_trx")
    val detail: String? = "",

    @field:SerializedName("id_store")
    val idStore: String? = null,

    @field:SerializedName("item_list")
    val itemList: String? = null,

    @field:SerializedName("created_date")
    val created_date: String? = null,

    @field:SerializedName("ref_num")
    val refNumber: String? = null,

    @field:SerializedName("id_trx")
    val idTrx: String? = null
) : Parcelable

@Parcelize
data class TransactionResponse(
    @field:SerializedName("msg")
    val msg: String? = null,

    @field:SerializedName("code")
    val code: Int? = null,

    @field:SerializedName("total")
    val total: String? = null,

    @field:SerializedName("data")
    val data: List<InsertTransaction?>,

    @field:SerializedName("top")
    val top: List<Top?>
) : Parcelable
