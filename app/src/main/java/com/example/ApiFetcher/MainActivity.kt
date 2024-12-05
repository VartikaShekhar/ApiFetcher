package com.example.ApiFetcher

import RetrofitApi
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.list)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Fetch data and populate RecyclerView
        fetchData()
    }

    private fun fetchData() {
        val dataApi = RetrofitHelper.getInstance().create(RetrofitApi::class.java)

        lifecycleScope.launch {
            try {
                Log.d("MainActivity", "Calling API")
                val data: List<DataModel> = dataApi.getData()
                    .filter { !it.name.isNullOrBlank() } // Remove items with blank or null name
                    .sortedWith(compareBy({ it.listId }, { it.name })) // Sort by listId and name

                // Set the adapter
                recyclerView.adapter = MainAdapter(data)
                Log.d("MainActivity", "Data loaded successfully")
            } catch (e: Exception) {
                Log.e("MainActivity", "Exception: ${e.message}")
            }
        }
    }
}
