package com.simonllano.calculadoraderesistencias

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel //Libreria del view model

class MainViewModel : ViewModel() { //herencia del viewmdodel

    val resultado: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }

    val _errorMsg: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }

    val colores = listOf<String>("Cafe","Rojo","Naranja","Amarillo","Verde","Azul","Violeta","Gris","Blanco")

    var banda1 = ""
    var banda2 = ""
    var multiplicador = ""
    var tolerancia = ""
    var total=""


    fun codigoColores1(color1: String,banda: String) {
        if (color1=="Seleciona") {
            Log.d("error", "Hay empty")
            _errorMsg.value = "Debe digitar los dos numeros"
        }

        else{

                when {
                    color1 =="Cafe" && banda =="1"-> banda1="1"
                    color1 =="Rojo" && banda =="1"->banda1= "2"
                    color1 =="Naranja" && banda =="1"->banda1= "3"
                    color1 =="Amarillo" && banda =="1"->banda1= "4"
                    color1 =="Verde" && banda =="1"->banda1= "5"
                    color1 =="Azul" && banda =="1"->banda1= "6"
                    color1 =="Violeta" && banda =="1"->banda1= "7"
                    color1 =="Gris" && banda =="1"->banda1= "8"
                    color1 =="Blanco" && banda =="1"->banda1= "9"

                }

                when{
                    color1 =="Negro" && banda =="2"-> banda2="0"
                    color1 =="Cafe" && banda =="2"-> banda2="1"
                    color1 =="Rojo" && banda =="2"->banda2= "2"
                    color1 =="Naranja" && banda =="2"->banda2= "3"
                    color1 =="Amarillo" && banda =="2"->banda2= "4"
                    color1 =="Verde" && banda =="2"->banda2= "5"
                    color1 =="Azul" && banda =="2"->banda2= "6"
                    color1 =="Violeta" && banda =="2"->banda2= "7"
                    color1 =="Gris" && banda =="2"->banda2= "8"
                    color1 =="Blanco" && banda =="2"->banda2= "9"
                }

                when{
                    color1 =="Negro" && banda =="3"-> multiplicador=""
                    color1 =="Cafe" && banda =="3"-> multiplicador="0"
                    color1 =="Rojo" && banda =="3"->multiplicador= "00"
                    color1 =="Naranja" && banda =="3"->multiplicador= "K"
                    color1 =="Amarillo" && banda =="3"->multiplicador= "0K"
                    color1 =="Verde" && banda =="3"->multiplicador= "00K"
                    color1 =="Azul" && banda =="3"->multiplicador= "M"
                    color1 =="Violeta" && banda =="3"->multiplicador= "0M"
                    color1 =="Gris" && banda =="3"->multiplicador= "00M"
                    color1 =="Blanco" && banda =="3"->multiplicador= "G"
                }

                when{
                    color1 =="Cafe" && banda =="4"-> tolerancia="1%"
                    color1 =="Rojo" && banda =="4"-> tolerancia="2%"
                    color1 =="Dorado" && banda =="4"->tolerancia= "5%"
                    color1 =="Plata" && banda =="4"->tolerancia= "10%"
                }


        }
        resultado.value= (banda1 + banda2 + multiplicador + " Tolerancia de: "  +  tolerancia)

    }


}



