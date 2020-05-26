package com.example.mytsetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val bundle:Bundle? = intent.extras

        val username = bundle?.get("username")
        val password = bundle?.get("password")

        val username_et = findViewById<EditText>(R.id.username_et).text
        val password_et = findViewById<EditText>(R.id.password_et).text



        val signinButton = findViewById<Button>(R.id.signinbtn)
        signinButton.setOnClickListener {
            if(username_et === username && password_et === password) {
                val loginIntent = Intent(this@loginActivity, HomeActivity::class.java)
                startActivity(loginIntent)
            }

            else{
                Toast.makeText(this, "username and passeord doesn't match", Toast.LENGTH_LONG).show()
            }
        }

    }
}
