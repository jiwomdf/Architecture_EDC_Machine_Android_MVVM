package com.katilijiwo.edcmachineandroidprintpractice.model

import com.google.gson.annotations.SerializedName

data class Deco (
    @field:SerializedName("merchant")
    val merchant: String? = null,

    @field:SerializedName("store")
    val store: String? = null,

    @field:SerializedName("terminal")
    val terminal: String? = null,

    @field:SerializedName("acquiring")
    val acquiring: String? = null
)