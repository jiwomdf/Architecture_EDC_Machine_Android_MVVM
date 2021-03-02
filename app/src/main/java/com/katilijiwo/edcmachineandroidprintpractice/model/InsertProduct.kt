package com.katilijiwo.edcmachineandroidprintpractice.model

import com.google.gson.annotations.SerializedName

data class InsertProduct(

	@field:SerializedName("id_product")
	val id_product: Int? = null,

	@field:SerializedName("store_id")
	val storeId: String? = null,

	@field:SerializedName("product_price")
	val productPrice: Int? = null,

	@field:SerializedName("category")
	val category: String? = null,

	@field:SerializedName("product_name")
	val productName: String? = null,

	@field:SerializedName("product_base_price")
	val productBasePrice: Int? = null,

	@field:SerializedName("tags")
	val tags: String? = null,

	@field:SerializedName("product_img_url")
	val productImgUrl: String? = null
)
