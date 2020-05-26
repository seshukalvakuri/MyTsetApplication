package com.example.mytsetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.loginbtn)
        loginButton.setOnClickListener {
            val loginIntent = Intent(this@MainActivity, loginActivity::class.java)
            startActivity(loginIntent)
        }

        val registerButton = findViewById<Button>(R.id.registerbtn)
        registerButton.setOnClickListener {
            val registerIntent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(registerIntent)
        }




    }
}
