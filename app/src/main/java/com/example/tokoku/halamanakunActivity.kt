package com.example.tokoku

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class halamanakunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamanakun)
        val intentButton: Button = findViewById(R.id.button_catatan)
        intentButton.setOnClickListener{ viewDetail ()}
    }
    private fun viewDetail () {
        val intent = Intent(this, catatanActivity::class.java)
        startActivity(intent)
    }
}