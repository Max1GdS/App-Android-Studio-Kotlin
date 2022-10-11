package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val titulo=findViewById<TextView>(R.id.m2_tit)
        val intent=getIntent()
        val mensaje="bienvenido "+(intent.extras?.getString("user")?:intent.getStringExtra("user"))
        titulo.text=mensaje
    }

}