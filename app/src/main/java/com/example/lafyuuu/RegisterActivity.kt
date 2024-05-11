package com.example.lafyuuu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        var button1 = findViewById<Button>(R.id.buttonReg)
        button1.setOnClickListener({
            val intent1 = Intent(this,MainActivity::class.java)
            startActivity(intent1)
        })
    }
}