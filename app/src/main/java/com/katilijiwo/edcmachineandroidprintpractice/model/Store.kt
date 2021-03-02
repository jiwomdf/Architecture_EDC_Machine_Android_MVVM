package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Store(

	@field:SerializedName("store_code")
	val storeCode: String? = null,

	@field:SerializedName("merchant_code")
	val merchantCode: String? = null,

	@field:SerializedName("store_telephone")
	val storeTelephone: String? = null,

	@field:SerializedName("store_address2")
	val storeAddress2: String? = null,

	@field:SerializedName("area_code")
	val areaCode: String? = null,

	@field:SerializedName("store_version")
	val storeVersion: String? = null,

	@field:SerializedName("profile_code")
	val profileCode: String? = null,

	@field:SerializedName("store_address")
	val storeAddress: String? = null,

	@field:SerializedName("kanwil_code")
	val kanwilCode: String? = null,

	@field:SerializedName("store_pic")
	val storePic: String? = null,

	@field:SerializedName("store_name")
	val storeName: String? = null,

	@field:SerializedName("kcp_code")
	val kcpCode: String? = null,

	@field:SerializedName("postal_code")
	val postalCode: String? = null,

	@field:SerializedName("list_mid")
	val listMid: List<ListMidItem?>
) : Parcelable

@Parcelize
data class ListMidItem(

	@field:SerializedName("store_code")
	val storeCode: String? = null,

	@field:SerializedName("mid")
	val mid: String? = null,

	@field:SerializedName("acquiring_code")
	val acquiringCode: String? = null
) : Parcelable
