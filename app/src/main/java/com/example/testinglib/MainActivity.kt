package com.example.testinglib

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
    }
}