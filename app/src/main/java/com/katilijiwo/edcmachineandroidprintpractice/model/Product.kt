package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseProduct(
    @field:SerializedName("msg")
    val msg: String? = null,

    @field:SerializedName("code")
    val code: Int? = null,

    @field:SerializedName("data")
    val data: List<Product?>
) : Parcelable

@Parcelize
data class Product(

    @field:SerializedName("store_id")
    val storeId: String? = null,

    @field:SerializedName("id_product")
    val idProduct: String? = null,

    @field:SerializedName("product_code")
    val productCode: String? = null,

    @field:SerializedName("product_price")
    val productPrice: String? = null,

    @field:SerializedName("created_date")
    val createdDate: String? = null,

    @field:SerializedName("product_name")
    val productName: String? = null,

    @field:SerializedName("product_base_price")
    val productBasePrice: String? = null,

    @field:SerializedName("category_id")
    val productCategory: String? = null,

    @field:SerializedName("product_tag")
    val productTag: String? = null,

    @field:SerializedName("product_img_url")
    val productImgUrl: String? = null,

    @field:SerializedName("category_name")
    val category_name: String? = null,

    @field:SerializedName("is_detail")
    val is_detail: Int? = null,

    @field:SerializedName("is_inquiry")
    val is_inquiry: Int? = null,
    @field:SerializedName("is_topup")
    val is_topup: Int? = null,
    @field:SerializedName("class_name")
    val class_name: String = "",

    @field:SerializedName("package_name")
    val package_name: String = "",

    var qty: Int? = null

) : Parcelable {
    companion object {
        const val TABLE_CART: String = "TABLE_CART"
        const val ID: String = "ID"
        const val ID_PRODUCT: String = "ID_PRODUCT"
        const val PRODUCT_CODE: String = "PRODUCT_CODE"
        const val PRODUCT_NAME: String = "PRODUCT_NAME"
        const val PRODUCT_PRICE: String = "PRODUCT_PRICE"
        const val PRODUCT_IMAGE: String = "PRODUCT_IMAGE"
        const val QTY: String = "QTY"
        const val IS_INQUIRY: String = "IS_INQUIRY"
        const val IS_TOPUP: String = "IS_TOPUP"
        const val SUB_TOTAL: String = "SUB_TOTAL"
    }
}
