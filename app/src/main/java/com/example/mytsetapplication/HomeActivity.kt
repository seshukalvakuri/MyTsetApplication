package com.example.mytsetapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class HomeActivity : AppCompatActivity() {
    private lateinit var listview: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listview = findViewById<ListView>(R.id.placeslist)

    }

    fun getList():ArrayList<>

}
