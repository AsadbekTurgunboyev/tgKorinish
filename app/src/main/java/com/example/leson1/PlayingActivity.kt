package com.example.leson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PlayingActivity : AppCompatActivity() {

    lateinit var txt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        txt = findViewById(R.id.txt)
        val olgan_xabarimiz = intent.getStringExtra("xabarimiz")
        txt.text = olgan_xabarimiz
    }


}