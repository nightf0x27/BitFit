package com.example.bitfit

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bitfit.data.DisplayFood

class FoodAdapter (private val context: Context, private val foods: List<DisplayFood>):
RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_detail, parent, false)
        return RecyclerView.ViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val food = foods[position]
        holder.bind(food)
    }
    override fun getItemCount() = foods.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        private val foodView = itemView.findViewById<TextView>(R.id.food)
        private val caloriesView = itemView.findViewById<TextView>(R.id.calories)

        init {
            itemView.setOnClickListener(this)
        }

        fun bind (food: DisplayFood){
            foodView.text = food.title
            caloriesView.text = food.calories
        }
    }


}