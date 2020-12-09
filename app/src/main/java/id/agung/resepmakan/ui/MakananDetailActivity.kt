package id.agung.resepmakan.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import id.agung.resepmakan.databinding.ActivityMakananDetailBinding
import id.agung.resepmakan.models.MakananListModel

class MakananDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMakananDetailBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val food = intent.getSerializableExtra("food") as MakananListModel

        binding = ActivityMakananDetailBinding.inflate(layoutInflater)

        title = "Daftar Makanan"

        Glide.with(this@MakananDetailActivity)
            .load(food.image)
            .into(binding.makananImg)

        binding.makananWaktu.text = "${food.estimasiWaktu}  menit"
        binding.makananBahan.text = food.bahan
        binding.makananCaraMasak.text = food.langkah

        val actionbar = supportActionBar;

        actionbar!!.setDisplayHomeAsUpEnabled(true)
        title = food.title

        val view = binding.root;
        setContentView(view);
    }
}