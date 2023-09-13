package com.example.assignment1_notesapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvAppName:TextView
    lateinit var btnStart:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvAppName = findViewById(R.id.tvAppName)
        btnStart = findViewById(R.id.btnStart)


    }
}