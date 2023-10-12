package com.example.mycalculadoraapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _resultado = MutableLiveData<Float>()

    val resultado: LiveData<Float>
        get() = _resultado

    /*
    private val _num1 = MutableLiveData<Float>()

    val num1: LiveData<Float>
        get() = _num1

    private val _num2 = MutableLiveData<Float>()

    val num2: LiveData<Float>
        get() = _num2

    fun resetNums() {
        _num1.value = null
        _num2.value = null
    }
     */

    fun suma(num1: Float, num2: Float){
        _resultado.value = num1+num2
    }

    fun resta(num1: Float, num2: Float){
        _resultado.value = num1-num2
    }

    fun multiplicacion(num1: Float, num2: Float){
        _resultado.value = num1*num2
    }

    fun division(num1: Float, num2: Float){
        _resultado.value = num1/num2
    }
}