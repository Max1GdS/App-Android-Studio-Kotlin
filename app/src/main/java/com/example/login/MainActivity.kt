package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.login.Database.DB
import com.example.login.Models.Producto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val producto = Producto("Cocacola", 22)
        val mibase = DB(this,null,null, null)
        mibase.addProducto(producto)
    }
    fun BotonClick(v : View) {
        var edad = 22
        Log.i("Titulo", "mensaje info" + edad)
        Log.e("Titulo", "mensaje info" + edad)
        Log.w("Titulo", "mensaje info" + edad)
        Log.d("Titulo", "mensaje info" + edad)

        val user = findViewById<EditText>(R.id.m_user)
        val textuser = user.text.toString()

        val pass = findViewById<EditText>(R.id.m_pass)
        val textpass = pass.text.toString()

        val intento1 =
            Intent(this, MainActivity2::class.java).apply { putExtra("user", textuser) }

        Toast.makeText(this, "el usuario es :" + user.text, Toast.LENGTH_SHORT).show()

        if ((textuser == "charly") and (textpass == "123")) {
            startActivity(intento1)
        }

    }
}