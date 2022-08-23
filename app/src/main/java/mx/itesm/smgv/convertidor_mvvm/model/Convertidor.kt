package mx.itesm.smgv.convertidor_mvvm.model

class Convertidor {

    fun convertirKmMi(km: Double): Double {
        val millas = km / 1.6
        return millas
    }

    fun convertirMiKm(mi: Double): Double {
        return mi * 1.6

    }
}