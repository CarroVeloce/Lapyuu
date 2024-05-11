package com.example.lafyuuu

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var button1 = findViewById<Button>(R.id.buttonReg)
        button1.setOnClickListener({
            val intent1 = Intent(this,RegisterActivity::class.java)
            startActivity(intent1)
        })
    }
}