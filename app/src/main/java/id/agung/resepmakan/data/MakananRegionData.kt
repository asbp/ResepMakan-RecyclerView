package id.agung.resepmakan.data

import com.google.gson.Gson
import id.agung.resepmakan.R
import id.agung.resepmakan.models.MakananListModel
import id.agung.resepmakan.models.MakananRegion

object MakananRegionData {
    val listData = ArrayList<MakananRegion>();
    val gson = Gson()

    fun get(): ArrayList<MakananRegion> {
        val list = arrayListOf<MakananRegion>();

        val makananIndo = arrayListOf<MakananListModel>();
        val makananLuar = arrayListOf<MakananListModel>();

        makananIndo.add(MakananListModel(
                title = "Cireng",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Bahan",
                langkah = "Buat")
        )

        makananLuar.add(MakananListModel(
                title = "Cireng",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Bahan",
                langkah = "Buat")
        )

        list.add(MakananRegion("Makanan Indonesia", R.drawable.ic_calorie, gson.toJson(makananIndo)))
        list.add(MakananRegion("Makanan Luar Negeri", R.drawable.ic_calorie, gson.toJson(makananLuar)))

        return list;
    }
}