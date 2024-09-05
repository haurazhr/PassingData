package com.haura.listview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    private lateinit var btnListView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        btnListView = findViewById(R.id.btnListView)

        btnLogin.setOnClickListener() {
            var intent = Intent(this@MainActivity, LoginPage::class.java)
            startActivity(intent)

            btnListView.setOnClickListener() {
                var intent = Intent(this@MainActivity, ListView::class.java)
                startActivity(intent)
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}