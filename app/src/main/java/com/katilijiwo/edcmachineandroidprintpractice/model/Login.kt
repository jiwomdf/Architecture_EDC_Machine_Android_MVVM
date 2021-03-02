package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Login(

    @field:SerializedName("msg")
    val msg: String? = null,

    @field:SerializedName("store_id")
    val storeId: String? = null,

    @field:SerializedName("code")
    val code: Int? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("token")
    val token: String? = null,

    @field:SerializedName("store_name")
    val storeName: String? = null,

    @field:SerializedName("user_name")
    val userName: String? = null
) : Parcelable
