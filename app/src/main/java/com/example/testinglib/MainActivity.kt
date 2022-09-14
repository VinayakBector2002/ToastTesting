package com.example.testinglib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastlibrary.SomethingSpecial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: android.widget.Button = findViewById(R.id.button)
        button.setOnClickListener {
            SomethingSpecial.show(this,"This was easy!")
        }

        val secondButton: android.widget.Button = findViewById(R.id.TrvButton)
        secondButton.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}