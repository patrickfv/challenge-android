package com.patrickfv.lodjinha.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {
    private val title = "Sobre"
    private val _text = MutableLiveData<String>().apply {
        value = "This is About"
    }
    val getTitle: String = title
    val text: LiveData<String> = _text
}