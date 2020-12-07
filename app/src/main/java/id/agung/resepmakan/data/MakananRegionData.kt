package id.agung.resepmakan.data

import id.agung.resepmakan.R
import id.agung.resepmakan.models.MakananRegion

object MakananRegionData {
    val listData = ArrayList<MakananRegion>();

    fun get(): ArrayList<MakananRegion> {
        val list = arrayListOf<MakananRegion>();

        list.add(MakananRegion("Makanan Indonesia", R.drawable.ic_calorie))
        list.add(MakananRegion("Makanan Luar Negeri", R.drawable.ic_calorie))

        return list;
    }
}