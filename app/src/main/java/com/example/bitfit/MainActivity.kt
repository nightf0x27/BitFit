package com.example.bitfit

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bitfit.data.DisplayFood
import com.example.bitfit.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var foodRecyclerView: RecyclerView
    private lateinit var binding: ActivityMainBinding
    private val foods = mutableListOf<DisplayFood>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val foodAdapter = FoodAdapter(this, foods)
        binding = ActivityMainBinding.inflate (layoutInflater)
        val view = binding.root
        setContentView(view)
        foodRecyclerView = findViewById(R.id.foods)
        foodRecyclerView.adapter = foodAdapter
        foodRecyclerView.layoutManager = LinearLayoutManager(this).also {
            val dividerItemDecoration = DividerItemDecoration(this, it.orientation)
            foodRecyclerView.addItemDecoration(dividerItemDecoration)
        }


        }

    }
}