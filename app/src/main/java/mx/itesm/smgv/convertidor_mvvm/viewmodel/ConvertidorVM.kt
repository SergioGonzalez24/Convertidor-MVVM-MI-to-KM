package mx.itesm.smgv.convertidor_mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mx.itesm.smgv.convertidor_mvvm.model.Convertidor

//El ViewModel de la Vista
class ConvertidorVM : ViewModel() {

    //Modelo
    private val modelo = Convertidor()
    //Variables --> conectan el modelo y la vista
    //Las variables deben de ser tipo livedata para que funcionen

    val millas = MutableLiveData<Double>(0.0)

    //Interface

    fun convertir(km : Double) {
        millas.value = modelo.convertirKmMi(km)
    }

}