package com.haura.listview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {
    private lateinit var etUsername : EditText
    private lateinit var etPassword : EditText
    private lateinit var loginButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener(){
            var intent = Intent(this@LoginPage, Welcome::class.java)
            val nUsername = etUsername.text.toString()
            val nPassword = etPassword.text.toString()

            intent.putExtra("username", nUsername)
            intent.putExtra("password", nPassword)

            Log.d("username", nUsername)
            Log.d("password", nPassword)

            print("Username :  " +nUsername)
            print("Password :  " +nPassword)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}