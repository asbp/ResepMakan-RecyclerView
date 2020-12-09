package id.agung.resepmakan.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.JsonParser
import id.agung.resepmakan.adapters.MakananListAdapter
import id.agung.resepmakan.databinding.ActivityMakananListBinding
import id.agung.resepmakan.models.MakananListModel

class MakananListActivity : AppCompatActivity() {
    private var myList: ArrayList<MakananListModel> = arrayListOf();

    private lateinit var myAdapter: MakananListAdapter;
    private lateinit var binding: ActivityMakananListBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val foodList = intent.getStringExtra("food_list")

        val foodArrays = JsonParser.parseString(foodList).asJsonArray;

        foodArrays.forEach {
            val event = Gson().fromJson(it.asJsonObject, MakananListModel::class.java)
            System.out.println("FOOD-ARRAY")
            myList.add(event)
        }

        binding = ActivityMakananListBinding.inflate(layoutInflater)

        myAdapter = MakananListAdapter(myList);

        binding.rvMakananList.apply {
            layoutManager = LinearLayoutManager(this@MakananListActivity);
            adapter = myAdapter;
            setHasFixedSize(true);
        }

        title = "Daftar Makanan"

        val view = binding.root;
        setContentView(view);
    }
}
