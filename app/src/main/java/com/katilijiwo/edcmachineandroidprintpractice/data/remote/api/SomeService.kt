package com.katilijiwo.edcmachineandroidprintpractice.data.remote.api

import com.katilijiwo.edcmachineandroidprintpractice.data.remote.remoteentity.SomeResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface SomeService {

    @FormUrlEncoded
    @POST("/someBranchOfTheApi")
    fun doLogin(@Field("username") username : String, @Field("password") password : String) : Call<SomeResponse>

}