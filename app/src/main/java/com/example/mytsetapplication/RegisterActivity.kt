package com.example.mytsetapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val username_et = findViewById<EditText>(R.id.username_et)
        val firstname_et = findViewById<EditText>(R.id.firstname_et)
        val lastname_et = findViewById<EditText>(R.id.lastname_et)
        val password_et = findViewById<EditText>(R.id.password_et)
        val confirmpass_et = findViewById<EditText>(R.id.confirmpass_et)
        val register_btn = findViewById<Button>(R.id.register_btn)

        val passwrd_txt = password_et.text
        val confirmpass_txt = confirmpass_et.text

        register_btn.setOnClickListener {

                val registerIntent = Intent(this@RegisterActivity, loginActivity::class.java)
                registerIntent.putExtra("username", username_et.text)
                registerIntent.putExtra("password", password_et.text)
            if(passwrd_txt === confirmpass_txt) {
                startActivity(registerIntent)
            }
            else{
                Toast.makeText(this, "password and confirm password dosn't match", Toast.LENGTH_LONG).show()
            }
        }
    }
}
