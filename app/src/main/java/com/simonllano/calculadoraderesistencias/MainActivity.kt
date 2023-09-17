package com.simonllano.calculadoraderesistencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar

import com.simonllano.calculadoraderesistencias.databinding.ActivityMainBinding

//Guardando features en practica2

class MainActivity : AppCompatActivity() {

    private lateinit var resistorBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel //se declara el view model
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        resistorBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = resistorBinding.root
        setContentView(view)

        mainViewModel= ViewModelProvider(this)[MainViewModel::class.java]


        resistorBinding.start.setOnClickListener {
            mainViewModel.codigoColores1(resistorBinding.banda1Spinner.selectedItem.toString(), "1")
            mainViewModel.codigoColores1(resistorBinding.banda2Spinner.selectedItem.toString(), "2")
            mainViewModel.codigoColores1(resistorBinding.banda3Spinner.selectedItem.toString(), "3")
            mainViewModel.codigoColores1(resistorBinding.banda4Spinner.selectedItem.toString(), "4")
        }

        val resultadoObserver = Observer<String> {resultado->  //Se crea el objeto observer
            resistorBinding.resistorTextView.setText(resultado.toString())
        }

        val errorMsgObserver = Observer<String> {_errorMsg ->
            Snackbar.make(view, _errorMsg, Snackbar.LENGTH_INDEFINITE).setAction( "Aceptar"){}.show()
        }

        mainViewModel.resultado.observe(this, resultadoObserver) //Se conecta el view model con ...


    }


}



