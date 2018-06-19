package de.feamer.login

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()
}