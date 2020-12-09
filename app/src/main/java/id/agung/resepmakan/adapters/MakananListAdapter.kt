package id.agung.resepmakan.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.agung.resepmakan.databinding.ItemMakananListBinding
import id.agung.resepmakan.models.MakananListModel
import id.agung.resepmakan.ui.MakananDetailActivity

class MakananListAdapter(private val list: List<MakananListModel>) :
        RecyclerView.Adapter<MakananListAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val itemBinding =
                ItemMakananListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val paymentBean: MakananListModel = list[position]
        holder.bind(paymentBean)
    }

    override fun getItemCount(): Int = list.size

    inner class MyHolder(private val itemBinding: ItemMakananListBinding) :
            RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: MakananListModel) {
            Glide.with(itemView.context)
                .load(item.image)
                .into(itemBinding.makananImg);

            itemBinding.makananTitle.text = item.title;

            itemBinding.root.setOnClickListener {
                val intent = Intent(itemView.context, MakananDetailActivity::class.java)
                intent.putExtra("food", item)
                itemView.context.startActivity(intent)
            }

        }
    }
}