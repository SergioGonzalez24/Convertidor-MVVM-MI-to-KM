package mx.itesm.smgv.convertidor_mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import mx.itesm.smgv.convertidor_mvvm.databinding.ActivityMainBinding
import mx.itesm.smgv.convertidor_mvvm.viewmodel.ConvertidorVM

class MainActivity : AppCompatActivity() {

    //Viewbinding
    private lateinit var binding: ActivityMainBinding

    //  Referencia al ViewModel
    private val convertidorVM: ConvertidorVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Configuraciones
        registrarObservadores() //  Suscribirse a los cambios
        registrarEventos() //  Atender el Click del Boton
    }

    private fun registrarEventos() {
        binding.btnConvertir.setOnClickListener {
            val km = binding.etKilometros.text.toString().toDouble()
            convertidorVM.convertir(km)
        }
    }

    private fun registrarObservadores() {
        //  Suscribir a los cambio
        convertidorVM.millas.observe(this) {
            binding.etMillas.setText(it.toString())
        }
    }

}