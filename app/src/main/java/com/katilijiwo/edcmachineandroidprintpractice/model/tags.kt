package com.katilijiwo.edcmachineandroidprintpractice.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TagsDataItem(

	@field:SerializedName("tag_name")
	val tagName: String? = null,

	@field:SerializedName("id")
	val id: String? = null
) : Parcelable{
	override fun toString(): String {
		return tagName.toString()
	}
}

@Parcelize
data class Tags(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<TagsDataItem?>
) : Parcelable
