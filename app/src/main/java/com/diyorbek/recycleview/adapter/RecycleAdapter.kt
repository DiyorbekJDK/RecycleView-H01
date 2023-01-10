package com.diyorbek.recycleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleview.R
import com.diyorbek.recycleview.R.*

class RecycleAdapter(
    private val stringList: List<String>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layout.item_layout, parent, false)
        return RvViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RvViewHolder).bind(stringList[position])
    }

    override fun getItemCount(): Int {
        return stringList.size
    }

    inner class RvViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(text: String) {
            val textView: TextView = view.findViewById(R.id.textView)
            textView.text = text
        }
    }
}