package com.diyorbek.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleview.adapter.RecycleAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerViewAdapter = RecycleAdapter(football())
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = recyclerViewAdapter
        }
    }
    private fun football(): MutableList<String>{
        return mutableListOf(
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Java",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
            "Kotlin",
        )
    }
}