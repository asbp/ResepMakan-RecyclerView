package id.agung.resepmakan.data

import id.agung.resepmakan.R
import id.agung.resepmakan.models.FoodFact

object FoodFactsData {
    val listData = ArrayList<FoodFact>();

    fun get(): ArrayList<FoodFact> {
        val list = arrayListOf<FoodFact>();

        list.add(FoodFact("Kalori", R.drawable.ic_calorie, "293 Kkal", "Kalori dibutuhkan sebagai bahan bakar tubuh dengan diolah menjadi energi yang digunakan untuk aktivitas sehari-hari."));
        list.add(FoodFact("Protein", R.drawable.ic_protein, "23 gram", "Dibutuhkan untuk pembentukan organ-organ penting"));
        list.add(FoodFact("Karbohidrat", R.drawable.ic_karbo, "4 gram", "Sebagai komponen sumber energi selain kalori."));
        list.add(FoodFact("Lemak", R.drawable.ic_lemak, "20 gram", "Membantu menjaga suhu tubuh."));
        list.add(FoodFact("Serat", R.drawable.ic_serat, "1 gram", "Membantu menurunkan kadar kolesterol."));

        return list;
    }
}