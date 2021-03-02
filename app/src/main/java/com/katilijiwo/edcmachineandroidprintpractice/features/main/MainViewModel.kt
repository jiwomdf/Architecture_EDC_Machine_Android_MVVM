package com.katilijiwo.edcmachineandroidprintpractice.features.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.katilijiwo.edcmachineandroidprintpractice.base.BaseViewModel
import com.katilijiwo.edcmachineandroidprintpractice.data.Repository
import com.katilijiwo.edcmachineandroidprintpractice.model.InsertTransaction
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(private val repository: Repository): BaseViewModel() {

    private var _sunmiP1Data = MutableLiveData<InsertTransaction>()
    val sunmiP1Data: LiveData<InsertTransaction> = _sunmiP1Data
    fun getDataSunmiP1(){
        viewModelScope.launch {
            val response = repository.getDataSunmiP1().await()
            if(response != null){
                _sunmiP1Data.postValue(response)
            }
        }
    }

    private var _sunmiP1BRI = MutableLiveData<InsertTransaction>()
    val sunmiP1BRI: LiveData<InsertTransaction> = _sunmiP1Data
    fun getDataSunmiBRI(){
        viewModelScope.launch {
            val response = repository.getDataSunmiBRI().await()
            if(response != null){
                _sunmiP1BRI.postValue(response)
            }
        }
    }
}