package com.example.ApiFetcher

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val items: List<DataModel>) :
    RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    // ViewHolder to hold and bind item views
    class DataViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name)
        val listId: TextView = view.findViewById(R.id.listid)
        val id: TextView = view.findViewById(R.id.id)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val item = items[position]
        holder.name.text = "${item.name ?: "No Name"}"
        holder.listId.text = "List ID: ${item.listId}"
        holder.id.text = "ID: ${item.id}"
    }

    override fun getItemCount(): Int = items.size
}
