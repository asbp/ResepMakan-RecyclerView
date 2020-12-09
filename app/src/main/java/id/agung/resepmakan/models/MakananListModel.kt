package id.agung.resepmakan.models

import java.io.Serializable

data class MakananListModel(val title: String, val image: Int, val estimasiWaktu: Double, val bahan: String, val langkah: String) : Serializable