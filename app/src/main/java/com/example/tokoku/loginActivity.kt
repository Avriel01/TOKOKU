package com.example.tokoku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val intentButton: Button = findViewById(R.id.buttonLogin)
        intentButton.setOnClickListener{ viewDetail ()}
    }
    private fun viewDetail () {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
    }
}