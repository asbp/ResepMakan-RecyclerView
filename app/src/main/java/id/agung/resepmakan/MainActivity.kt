package id.agung.resepmakan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import id.agung.resepmakan.adapters.FoodFactsAdapter
import id.agung.resepmakan.data.FoodFactsData
import id.agung.resepmakan.databinding.ActivityMainBinding
import id.agung.resepmakan.models.FoodFact

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<FoodFact> = arrayListOf();

    private lateinit var foodFactsAdapter: FoodFactsAdapter;
    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        list.addAll(FoodFactsData.get());
        foodFactsAdapter = FoodFactsAdapter(list);

        binding = ActivityMainBinding.inflate(layoutInflater);
        val view = binding.root;

        binding.rvFoodFacts.apply {
            layoutManager = LinearLayoutManager(this@MainActivity);
            adapter = foodFactsAdapter;
            setHasFixedSize(true);
        }

        setContentView(view);
    }
}