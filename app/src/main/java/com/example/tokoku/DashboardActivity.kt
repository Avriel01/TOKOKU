package com.example.tokoku


import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val imageButton: ImageButton = this.findViewById(R.id.profile)
        imageButton.setOnClickListener{ viewDetail ()}
    }
    private fun viewDetail () {
        val intent = Intent(this, halamanakunActivity::class.java)
        startActivity(intent)
    }
    }