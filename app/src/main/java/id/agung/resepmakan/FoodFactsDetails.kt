package id.agung.resepmakan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import id.agung.resepmakan.databinding.ActivityFoodFactsDetailsBinding
import id.agung.resepmakan.databinding.ActivityMainBinding
import id.agung.resepmakan.models.FoodFact

class FoodFactsDetails : AppCompatActivity() {

    private lateinit var binding: ActivityFoodFactsDetailsBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodFactsDetailsBinding.inflate(layoutInflater);

        val foodFact = intent.getSerializableExtra("item") as? FoodFact

        val view = binding.root;

        Glide.with(this@FoodFactsDetails)
            .load(foodFact?.icon)
            .into(binding.foodFactImg);

        binding.foodFactTitle.text = foodFact?.title;
        binding.foodFactShortDesc.text = foodFact?.short_desc;
        binding.foodFactLongDesc.text = foodFact?.long_description;

        val actionbar = supportActionBar
        actionbar!!.title = "Detail"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        setContentView(view);
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}