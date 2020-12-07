package id.agung.resepmakan.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import id.agung.resepmakan.adapters.MakananRegionAdapter
import id.agung.resepmakan.data.MakananRegionData
import id.agung.resepmakan.databinding.ActivityHomeBinding
import id.agung.resepmakan.models.MakananRegion

class HomeActivity : AppCompatActivity() {
    private var list: ArrayList<MakananRegion> = arrayListOf();

    private lateinit var myAdapter: MakananRegionAdapter;
    private lateinit var binding: ActivityHomeBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        list.addAll(MakananRegionData.get());

        myAdapter = MakananRegionAdapter(list);

        binding = ActivityHomeBinding.inflate(layoutInflater);

        binding.rvMakananRegion.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity);
            adapter = myAdapter;
            setHasFixedSize(true);
        }

        title = "Resep Makanan"

        val view = binding.root;
        setContentView(view);
    }
}