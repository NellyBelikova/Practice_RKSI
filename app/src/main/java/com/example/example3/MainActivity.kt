package com.example.example3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addButton = findViewById<Button>(R.id.button)
        val linear = findViewById<LinearLayout>(R.id.linear)
        addButton.setOnClickListener {
            counter++
            val marker = findViewById<EditText>(R.id.marker)
            linear.addView(marker)
            marker.tag = "Marker$counter"
            marker.hint = "Marker$counter"
        }


    }

}

