package com.example.login.Models

class Producto {
    var id: Int = 0
    var nombreProducto: String? = null
    var cantidad: Int = 0
    constructor(id: Int, nombreProducto: String, cantidad: Int){
        this.id = id
        this.nombreProducto = nombreProducto
        this.cantidad = cantidad
    }
    constructor(nombreProducto: String, cantidad: Int){
        this.nombreProducto = nombreProducto
        this.cantidad = cantidad
    }
}