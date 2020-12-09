package id.agung.resepmakan.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.agung.resepmakan.databinding.ItemMakananRegionBinding
import id.agung.resepmakan.models.MakananRegion
import id.agung.resepmakan.ui.MakananListActivity
import java.util.*

class MakananRegionAdapter(private val list: ArrayList<MakananRegion>) :
        RecyclerView.Adapter<MakananRegionAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val itemBinding =
                ItemMakananRegionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val paymentBean: MakananRegion = list[position]
        holder.bind(paymentBean)
    }

    override fun getItemCount(): Int = list.size

    inner class MyHolder(private val itemBinding: ItemMakananRegionBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: MakananRegion) {
            Glide.with(itemView.context)
                    .load(item.image)
                    .into(itemBinding.regionImg);

            itemBinding.regionTitle.text = item.title;

            itemBinding.root.setOnClickListener {
                val intent = Intent(itemView.context, MakananListActivity::class.java)
                intent.putExtra("food_list", item.makanan)
                itemView.context.startActivity(intent)
            }
        }
    }
}