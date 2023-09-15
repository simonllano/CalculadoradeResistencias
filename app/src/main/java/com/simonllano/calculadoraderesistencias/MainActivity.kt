package com.simonllano.calculadoraderesistencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.simonllano.calculadoraderesistencias.databinding.ActivityMainBinding

//Guardando features en practica2

class MainActivity : AppCompatActivity() {

    private lateinit var resistorBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        resistorBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = resistorBinding.root
        setContentView(view)


        resistorBinding.start.setOnClickListener {
            var valorResistencia1=""
            var valorResistencia2=""
            var valorResistencia3=""
            var valorResistencia4=""

            val banda1= resistorBinding.banda1Spinner.selectedItem.toString()
            val banda2= resistorBinding.banda2Spinner.selectedItem.toString()
            val banda3= resistorBinding.banda3Spinner.selectedItem.toString()
            val banda4= resistorBinding.banda4Spinner.selectedItem.toString()

           when (banda1) {
               "Cafe" -> {
                   valorResistencia1 = "1"
               }

               "Rojo" -> {
                   valorResistencia1 = "2"
               }

               "Naranja" -> {
                   valorResistencia1 = "3"
               }

               "Amarillo" -> {
                   valorResistencia1 = "4"
               }

               "Verde" -> {
                   valorResistencia1 = "5"
               }

               "Azul" -> {
                   valorResistencia1 = "6"
               }

               "Violeta" -> {
                   valorResistencia1 = "7"
               }

               "Gris" -> {
                   valorResistencia1 = "8"
               }

               "Blanco" -> {
                   valorResistencia1 = "9"
               }
           }
           when(banda2) {
               "Negro" -> {
                   valorResistencia2 =  "0"
               }

               "Cafe" -> {
                   valorResistencia2 =  "1"
               }

               "Rojo" -> {
                   valorResistencia2 =  "2"
               }

               "Naranja" -> {
                   valorResistencia2 = "3"
               }

               "Amarillo" -> {
                   valorResistencia2 = "4"
               }

               "Verde" -> {
                   valorResistencia2 = "5"
               }

               "Azul" -> {
                   valorResistencia2 =  "6"
               }

               "Violeta" -> {
                   valorResistencia2 =  "7"
               }

               "Gris" -> {
                   valorResistencia2 =  "8"
               }

               "Blanco" -> {
                   valorResistencia2 =  "9"
               }
           }

            when(banda3) {
                "Negro" -> {
                    valorResistencia3 = ""
                }

                "Cafe" -> {
                    valorResistencia3 =  "0"
                }

                "Rojo" -> {
                    valorResistencia3 =  "00"
                }

                "Naranja" -> {
                    valorResistencia3 =  "K"
                }

                "Amarillo" -> {
                    valorResistencia3 =  "0K"
                }

                "Verde" -> {
                    valorResistencia3 =  "00K"
                }

                "Azul" -> {
                    valorResistencia3 =  "M"
                }

                "Violeta" -> {
                    valorResistencia3 = "0M"
                }

                "Gris" -> {
                    valorResistencia3 = "00M"
                }

                "Blanco" -> {
                    valorResistencia3 = "G"
                }
            }

            when(banda4) {
                "Cafe" -> {
                    valorResistencia4 = "1%"
                }

                "Rojo" -> {
                    valorResistencia4 = "2%"
                }

                "Dorado" -> {
                    valorResistencia4 = "5%"
                }

                "Plata" -> {
                    valorResistencia4 = "10%"
                }
            }


            resistorBinding.resistorTextView.text = valorResistencia1 + valorResistencia2 + valorResistencia3 + " " + "Tolerancia de " + valorResistencia4

           }


        }

    }

