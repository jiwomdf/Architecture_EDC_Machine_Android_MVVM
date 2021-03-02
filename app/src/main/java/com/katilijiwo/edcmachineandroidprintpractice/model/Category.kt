package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Category(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<CategoryDataItem?>
) : Parcelable

@Parcelize
data class CategoryDataItem(

	@field:SerializedName("category_name")
	val categoryName: String? = null,

	@field:SerializedName("id")
	val id: String? = null
) : Parcelable{
	override fun toString(): String {
		return categoryName.toString()
	}
}
