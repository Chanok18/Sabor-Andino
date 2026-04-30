package com.example.saborandino.model

import androidx.compose.runtime.mutableStateListOf

object PedidoManager {

    private val _pedido = mutableStateListOf<Pair<Plato, Int>>()
    val pedido: List<Pair<Plato, Int>> = _pedido

    fun agregar(plato: Plato, cantidad: Int) {
        _pedido.add(plato to cantidad)
    }

    fun total(): Double {
        return _pedido.sumOf { it.first.precio * it.second }
    }
}