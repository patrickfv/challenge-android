package com.patrickfv.lodjinha.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val title = "A Lodjinha"
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val getTitle = title
    val text: LiveData<String> = _text
}