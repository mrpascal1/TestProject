package shahid.raza.testproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import shahid.raza.testproject.data.ListItem
import shahid.raza.testproject.databinding.ItemListBinding

class ListItemAdapter(
    private val items: List<ListItem>
) : RecyclerView.Adapter<ListItemAdapter.ListItemViewHolder>() {

    inner class ListItemViewHolder(val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        
        fun bind(item: ListItem) {
            binding.tvTitle.text = item.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = ItemListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ListItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}