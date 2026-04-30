package com.example.saborandino.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.saborandino.model.DataProvider
import com.example.saborandino.model.Plato
import com.example.saborandino.navigation.Screen
import com.example.saborandino.ui.theme.SaborAndinoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController) {

    var categoriaSeleccionada by remember { mutableStateOf("Todos") }

    val categorias = listOf("Todos", "Entradas", "Fondo", "Bebidas", "Postres")

    val platos = if (categoriaSeleccionada == "Todos") {
        DataProvider.platos
    } else {
        DataProvider.platos.filter { it.categoria == categoriaSeleccionada }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Menú") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, null)
                    }
                }
            )
        }
    ) { padding ->

        Column(modifier = Modifier.padding(padding)) {
            //categorias
            LazyRow {
                items(categorias) { cat ->
                    Button(
                        onClick = { categoriaSeleccionada = cat },
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Text(cat)
                    }
                }
            }

            //lista de platos
            LazyColumn {
                items(platos) { plato ->
                    ListItem(
                        headlineContent = { Text(plato.nombre) },
                        supportingContent = { Text("S/ ${plato.precio}") },
                        modifier = Modifier.clickable {
                            navController.navigate(
                                Screen.Detail.createRoute(plato.id)
                            )
                        }
                    )
                    HorizontalDivider()
                }
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MenuPreview() {
    SaborAndinoTheme {
        MenuScreen(navController = androidx.navigation.compose.rememberNavController())
    }
}