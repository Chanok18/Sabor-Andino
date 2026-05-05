package com.example.saborandino.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.saborandino.model.DataProvider
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
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { padding ->

        Column(modifier = Modifier.padding(padding)) {
            // Categorías filtrables
            LazyRow(modifier = Modifier.padding(vertical = 8.dp)) {
                items(categorias) { cat ->
                    val isSelected = categoriaSeleccionada == cat
                    Button(
                        onClick = { categoriaSeleccionada = cat },
                        modifier = Modifier.padding(horizontal = 4.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondaryContainer,
                            contentColor = if (isSelected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    ) {
                        Text(cat)
                    }
                }
            }

            // Lista scrollable de platos
            LazyColumn {
                items(platos) { plato ->
                    ListItem(
                        headlineContent = { Text(plato.nombre, style = MaterialTheme.typography.titleMedium) },
                        supportingContent = {
                            Text(
                                "S/ ${plato.precio}\n${plato.descripcion}",
                                maxLines = 2
                            )
                        },
                        leadingContent = {
                            Image(
                                painter = painterResource(id = plato.imagenRes),
                                contentDescription = plato.nombre,
                                modifier = Modifier
                                    .size(64.dp)
                                    .clip(RoundedCornerShape(8.dp))
                            )
                        },
                        modifier = Modifier.clickable {
                            navController.navigate(Screen.Detail.createRoute(plato.id))
                        }
                    )
                    HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MenuPreview() {
    SaborAndinoTheme {
        MenuScreen(navController = rememberNavController())
    }
}
