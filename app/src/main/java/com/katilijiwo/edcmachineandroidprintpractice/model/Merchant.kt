package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Merchant(

	@field:SerializedName("merchant_is_duplicate")
	val merchantIsDuplicate: String? = null,

	@field:SerializedName("merchant_code")
	val merchantCode: String? = null,

	@field:SerializedName("merchant_is_enter")
	val merchantIsEnter: String? = null,

	@field:SerializedName("profile_code")
	val profileCode: String? = null,

	@field:SerializedName("merchant_logo")
	val merchantLogo: String? = null,

	@field:SerializedName("merchant_name")
	val merchantName: String? = null,

	@field:SerializedName("merchant_settlement_notify")
	val merchantSettlementNotify: String? = null,

	@field:SerializedName("version")
	val version: String? = null,

	@field:SerializedName("merchant_main_page")
	val merchantMainPage: String? = null,

	@field:SerializedName("merchant_void_password")
	val merchantVoidPassword: String? = null,

	@field:SerializedName("merchant_is_print")
	val merchantIsPrint: String? = null,

	@field:SerializedName("company_name")
	val companyName: String? = null,

	@field:SerializedName("merchant_pic")
	val merchantPic: String? = null,

	@field:SerializedName("merchant_telephone")
	val merchantTelephone: String? = null,

	@field:SerializedName("merchant_settlement_max")
	val merchantSettlementMax: String? = null,

	@field:SerializedName("merchant_criteria")
	val merchantCriteria: String? = null,

	@field:SerializedName("company_code")
	val companyCode: String? = null,

	@field:SerializedName("merchant_address")
	val merchantAddress: String? = null,

	@field:SerializedName("merchant_sales_logo")
	val merchantSalesLogo: String? = null,

	@field:SerializedName("merchant_settlement_password")
	val merchantSettlementPassword: String? = null,

	@field:SerializedName("client_code")
	val clientCode: String? = null
) : Parcelable
