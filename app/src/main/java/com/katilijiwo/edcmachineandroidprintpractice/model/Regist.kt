package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Regist(

	@field:SerializedName("pos_mobile_id")
	val posMobileId: String? = null,

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("firstname")
	val firstname: String? = null,

	@field:SerializedName("mobile_no")
	val mobileNo: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("username")
	val username: String? = null,

	@field:SerializedName("lastname")
	val lastname: String? = null
) : Parcelable
