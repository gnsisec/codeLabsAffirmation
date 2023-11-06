package com.example.codelabsaffirmation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.codelabsaffirmation.R
import com.example.codelabsaffirmation.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val data: List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item, parent, false
        )
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = context.resources.getString(item.resourceId)
        holder.imageView.setImageResource(item.imageResource)
    }

}