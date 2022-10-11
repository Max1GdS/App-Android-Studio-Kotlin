package com.example.login.Database

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.example.login.Models.Producto
import java.util.prefs.PreferencesFactory

class DB (context: Context,nombre : String?,factory:SQLiteDatabase.CursorFactory?,version: Int?) :
    SQLiteOpenHelper(context, NOMBREBDD,factory,VERSION){

    companion object {
        private val VERSION = 1
        private val NOMBREBDD = "productos.db"
        val TABLA_PRODUCTO = "productos"

        val COLUMN_ID = "_id"
        val COLUMN_NOMBREPRODUCTO= "nombreproducto"
        val COLUMN_cantidad = "cantidad"
    }
    override fun onCreate(db: SQLiteDatabase?) {
        val CREAR_TABLE = "CREATE TABLE $TABLA_PRODUCTO($COLUMN_ID INTEGER PRIMARY KEY, $COLUMN_NOMBREPRODUCTO TEXT, $COLUMN_cantidad INTEGER)"
        if (db != null) {
            db.execSQL(CREAR_TABLE.toString())
            Log.e("BASEDATOS", "LA BASE FUE CREADA")
        }
    }
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
    fun addProducto(producto: Producto){
        val valores = ContentValues()
        valores.put(COLUMN_NOMBREPRODUCTO, producto.nombreProducto)
        valores.put(COLUMN_cantidad, producto.cantidad)
        Log.e("BaseDatos", "El registro fue agregado")
        val labase = this.writableDatabase
        labase.insert(TABLA_PRODUCTO, null, valores)

        }



}
