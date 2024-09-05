package com.haura.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListView : AppCompatActivity() {
    private lateinit var lv_item : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        lv_item = findViewById(R.id.lv_Hewan)
        //listview
        //listview widget --> Adapter --> Data Source (Array List)

        //ArrayList
        val namaHewan = listOf("Gajah","ular","Beruang","Panda","Ikan","Sapi","Kambing")
        //Memasukkan data array ke adapter
        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namaHewan)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}