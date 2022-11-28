package com.example.odinhome.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odinhome.R
import com.example.odinhome.databinding.CardInfoBinding
import com.example.odinhome.room.InfoCardData

class InfoCardListAdapter : RecyclerView.Adapter<InfoCardListAdapter.ViewHolder>() {

    var items: List<InfoCardData> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    private var itemClick: (InfoCardData) -> Unit = {}
    fun itemClick(listener: (InfoCardData) -> Unit) {
        itemClick = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_info, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.inderInfoCard = items[position]
        holder.itemView.setOnClickListener {
            itemClick(items[position])
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var binding = CardInfoBinding.bind(view)
    }

}