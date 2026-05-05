package com.example.saborandino.model

data class Plato(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val categoria: String,
    val imagenRes: Int = android.R.drawable.ic_menu_gallery // Placeholder por defecto
)
