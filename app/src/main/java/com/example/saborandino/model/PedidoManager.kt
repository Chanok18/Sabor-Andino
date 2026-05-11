package com.example.saborandino.model

import androidx.compose.runtime.mutableStateListOf
object PedidoManager {

    // Lista privada para encapsular el estado
    private val _pedido = mutableStateListOf<Pair<Plato, Int>>()
    val pedido: List<Pair<Plato, Int>> = _pedido

    /**
     * Agrega un plato al pedido actual.
     */
    fun agregar(plato: Plato, cantidad: Int) {
        _pedido.add(plato to cantidad)
    }

    /**
     * Calcula el subtotal de todos los platos multiplicados por su cantidad.
     * Palabra clave: sumOf - Función de extensión para cálculos acumulados.
     */
    fun total(): Double {
        return _pedido.sumOf { it.first.precio * it.second }
    }
}