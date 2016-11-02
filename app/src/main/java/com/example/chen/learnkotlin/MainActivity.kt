package com.example.chen.learnkotlin

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "Hello Kotlin!"
        message.setTextColor(Color.RED)
        message.setOnClickListener { Log.d("tag","dddd") }
    }
}
