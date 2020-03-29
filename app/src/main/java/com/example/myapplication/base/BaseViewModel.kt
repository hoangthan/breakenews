package com.example.myapplication.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BaseViewModel : ViewModel() {
    private var isLoading = MutableLiveData<Boolean>()

    fun setLoading(isLoading: Boolean) {
        this.isLoading.value = isLoading
    }

}