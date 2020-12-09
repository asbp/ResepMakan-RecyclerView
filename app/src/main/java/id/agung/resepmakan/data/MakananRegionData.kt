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
        val minumanIndo = arrayListOf<MakananListModel>();
        val makananLuar = arrayListOf<MakananListModel>();

        makananIndo.add(MakananListModel(
                title = "Soto Kudus",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )
        makananIndo.add(MakananListModel(
                title = "Tude Bakar Manado",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )
        makananIndo.add(MakananListModel(
                title = "Soto Kudus",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )
        makananIndo.add(MakananListModel(
                title = "Asinan Betawi",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )
        makananIndo.add(MakananListModel(
                title = "Kerak Telor - Jakarta",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )

        minumanIndo.add(MakananListModel(
                title = "Es Cendol",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )
        minumanIndo.add(MakananListModel(
                title = "Bajigur",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )
        minumanIndo.add(MakananListModel(
                title = "Bir Pletok",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )
        minumanIndo.add(MakananListModel(
                title = "Sekoteng",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )
        minumanIndo.add(MakananListModel(
                title = "Lahang",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Lorem ipsum di sini",
                langkah = "Lorem ipsum di sini")
        )

        makananLuar.add(MakananListModel(
                title = "Macaron",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Bahan",
                langkah = "Buat")
        )
        makananLuar.add(MakananListModel(
                title = "Pizza",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Bahan",
                langkah = "Buat")
        )
        makananLuar.add(MakananListModel(
                title = "Hamburger",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Bahan",
                langkah = "Buat")
        )
        makananLuar.add(MakananListModel(
                title = "Tacos",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Bahan",
                langkah = "Buat")
        )
        makananLuar.add(MakananListModel(
                title = "Sushi",
                image = R.drawable.ic_calorie,
                estimasiWaktu = 1.5,
                bahan = "Bahan",
                langkah = "Buat")
        )

        list.add(MakananRegion("Makanan Indonesia", R.drawable.ic_calorie, gson.toJson(makananIndo)))
        list.add(MakananRegion("Minuman Indonesia", R.drawable.ic_calorie, gson.toJson(makananLuar)))
        list.add(MakananRegion("Makanan Luar Negeri", R.drawable.ic_calorie, gson.toJson(makananLuar)))

        return list;
    }
}