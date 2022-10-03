package com.example.leson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {

   lateinit var  xabar : EditText
    lateinit var voice: ImageView
    lateinit var skripka: ImageView
    lateinit var send: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        xabar = findViewById(R.id.xabar)
        voice = findViewById(R.id.voice)
        skripka = findViewById(R.id.skripka)
        send = findViewById(R.id.send)


        send.setOnClickListener {
            val intent = Intent(this,PlayingActivity::class.java)
            intent.putExtra("xabarimiz",xabar.text.toString())
            startActivity(intent)
        }
        xabar.addTextChangedListener {
            voice.visibility = View.INVISIBLE
            skripka.visibility = View.INVISIBLE
            send.visibility = View.VISIBLE

            if (it != null){
                if (it.length == 0){
                    voice.visibility = View.VISIBLE
                    skripka.visibility = View.VISIBLE
                    send.visibility = View.GONE
                }

            }

        }
    }
}