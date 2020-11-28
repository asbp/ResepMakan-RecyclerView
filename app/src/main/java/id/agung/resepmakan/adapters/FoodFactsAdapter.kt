package id.agung.resepmakan.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.agung.resepmakan.FoodFactsDetails
import id.agung.resepmakan.databinding.FoodfactsItemBinding
import id.agung.resepmakan.models.FoodFact

class FoodFactsAdapter(private val foodFactList: List<FoodFact>) : RecyclerView.Adapter<FoodFactsAdapter.FoodFactsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodFactsHolder {
        val itemBinding = FoodfactsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodFactsHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: FoodFactsHolder, position: Int) {
        val paymentBean: FoodFact = foodFactList[position]
        holder.bind(paymentBean)
    }

    override fun getItemCount(): Int = foodFactList.size

    inner class FoodFactsHolder(private val itemBinding: FoodfactsItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: FoodFact) {
            Glide.with(itemView.context)
                    .load(item.icon)
                    .into(itemBinding.foodFactImg);

            itemBinding.foodFactTitle.text = item.title;
            itemBinding.foodFactDesc.text = item.short_desc;

            itemBinding.root.setOnClickListener {
                val intent = Intent(itemView.context, FoodFactsDetails::class.java)
                intent.putExtra("item", item)
                itemView.context.startActivity(intent)
            }
        }
    }
}