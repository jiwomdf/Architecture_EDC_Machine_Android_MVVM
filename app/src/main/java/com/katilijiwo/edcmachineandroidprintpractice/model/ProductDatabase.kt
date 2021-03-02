package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductDatabase(
    val id: Long? = null,

    @field:SerializedName("id_product")
    val idProduct: String? = null,
    @field:SerializedName("product_code")
    val productCode: String? = null,
    @field:SerializedName("productName")
    val productName: String? = null,

    @field:SerializedName("productPrice")
    val productPrice: String? = null,

    @field:SerializedName("productImage")
    val productImage: String? = null,

    @field:SerializedName("qty")
    val qty: Int? = null,

    @field:SerializedName("is_inquiry")
    val isInquiry: Int? = null,

    @field:SerializedName("is_topup")
    val is_topup: Int? = null,
    @field:SerializedName("sub_total")
    val subTotal: Long? = null
) : Parcelable
