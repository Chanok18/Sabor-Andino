package com.example.saborandino.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.saborandino.model.Plato
import com.example.saborandino.navigation.Screen
import com.example.saborandino.ui.theme.SaborAndinoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController) {

    val platos = listOf(
        Plato(1, "Lomo Saltado", "Carne con papas", 25.0),
        Plato(2, "Ceviche", "Pescado fresco", 30.0),
        Plato(3, "Ají de Gallina", "Pollo cremoso", 20.0)
    )

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

        LazyColumn(contentPadding = padding) {
            items(platos) { plato ->
                ListItem(
                    headlineContent = { Text(plato.nombre) },
                    supportingContent = { Text("S/ ${plato.precio}") },
                    modifier = Modifier.clickable {
                        navController.navigate(Screen.Detail.createRoute(plato.id))
                    }
                )
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