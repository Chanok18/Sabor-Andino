package com.example.saborandino.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.saborandino.model.DataProvider
import com.example.saborandino.model.PedidoManager
import com.example.saborandino.ui.theme.SaborAndinoTheme

@Composable
fun DetailScreen(navController: NavController, id: Int) {

    val plato = DataProvider.platos.find { it.id == id }
    if (plato == null) {
        Text("Plato no encontrado")
        return
    }
    var cantidad by remember { mutableIntStateOf(1) }

    Column(modifier = Modifier.padding(24.dp)) {

        Text(plato.nombre, style = MaterialTheme.typography.headlineMedium)

        Text(plato.descripcion)

        Text("Precio: S/ ${plato.precio}")

        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = { if (cantidad > 1) cantidad-- }) {
                Text("-")
            }
            Text(" $cantidad ", modifier = Modifier.padding(horizontal = 8.dp))
            Button(onClick = { cantidad++ }) {
                Text("+")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            PedidoManager.agregar(plato, cantidad)
            navController.popBackStack()
        }) {
            Text("Agregar al pedido")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetailScreenPreview() {
    SaborAndinoTheme {
        DetailScreen(
            navController = rememberNavController(),
            id = 1
        )
    }
}
