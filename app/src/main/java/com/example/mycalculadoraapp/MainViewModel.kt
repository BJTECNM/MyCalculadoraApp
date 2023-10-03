package com.example.mycalculadoraapp

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    //var num1 = 0
    //var num2 = 0
    var resultado = 0

    fun suma(num1: Int, num2: Int){
        resultado = num1+num2
    }

    fun resta(num1: Int, num2: Int){
        resultado = num1-num2
    }

    fun multiplicacion(num1: Int, num2: Int){
        resultado = num1*num2
    }

    fun division(num1: Int, num2: Int){
        resultado = num1/num2
    }
}