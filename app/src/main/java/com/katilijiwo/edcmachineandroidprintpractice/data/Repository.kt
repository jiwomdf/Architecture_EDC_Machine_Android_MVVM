package com.katilijiwo.edcmachineandroidprintpractice.data

import com.katilijiwo.edcmachineandroidprintpractice.base.BaseResponse
import com.katilijiwo.edcmachineandroidprintpractice.base.BaseService.Companion.execute
import com.katilijiwo.edcmachineandroidprintpractice.data.remote.api.SomeService
import com.katilijiwo.edcmachineandroidprintpractice.model.InsertTransaction
import kotlinx.coroutines.*
import javax.inject.Inject

class Repository @Inject constructor(private val someService: SomeService): BaseResponse() {
    fun getDataSunmiP1(): Deferred<InsertTransaction> {
        return CoroutineScope(Dispatchers.IO).async {
            /* execute(someService.doLogin(
                username = user.username,
                password = user.password
            )) */

            val response = InsertTransaction(
                "Test",
                1,
                "Test",
                1,
                "Test",
                "Test",
                "Test",
                "Test",
                "Test",
                "Test",
                "Test",
            )
            response
        }
    }

    fun getDataSunmiBRI(): Deferred<InsertTransaction> {
        return CoroutineScope(Dispatchers.IO).async {
            /* execute(someService.doLogin(
                username = user.username,
                password = user.password
            )) */

            val response = InsertTransaction(
                "Test",
                1,
                "Test",
                1,
                "Test",
                "Test",
                "Test",
                "Test",
                "Test",
                "Test",
                "Test",
            )
            response
        }
    }
}