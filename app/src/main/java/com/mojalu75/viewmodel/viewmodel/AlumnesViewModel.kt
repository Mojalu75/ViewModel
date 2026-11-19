package com.mojalu75.viewmodel.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mojalu75.viewmodel.model.AlumnesModel
import com.mojalu75.viewmodel.model.AlumnesProvider

class AlumnesViewModel : ViewModel() {
    val alumnesModel = MutableLiveData<AlumnesModel>()

    fun randomAlumne(){
        val currentAlumne = AlumnesProvider.random()
        alumnesModel.postValue(currentAlumne)
    }
}