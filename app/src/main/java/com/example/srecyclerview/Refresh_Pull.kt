package com.example.srecyclerview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import kotlinx.coroutines.delay

class Refresh_Pull : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refresh_pull)

        val swipetorefresh : SwipeRefreshLayout = findViewById(R.id.swipetorefresh)
        val textView : TextView = findViewById(R.id.textview)
        val image : ImageView = findViewById(R.id.imageswipe)

        swipetorefresh.setOnRefreshListener {
            textView.text = "Refreshed"
           image.setImageResource(R.drawable.img_3)

            val intent  = Intent(this,MainActivity::class.java)
            startActivity(intent)
            swipetorefresh.isRefreshing  = false
        }
    }
}