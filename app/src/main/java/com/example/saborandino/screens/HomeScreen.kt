package com.example.saborandino.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.saborandino.navigation.Screen
import com.example.saborandino.ui.theme.SaborAndinoTheme

@Composable
fun HomeScreen(navController: NavController) {

    Column(modifier = Modifier.padding(24.dp)) {

        Text("Bienvenido a Sabor Andino 👋")

        Button(onClick = { navController.navigate(Screen.Menu.route) }) {
            Text("Ver Menú")
        }

        Button(onClick = { navController.navigate(Screen.Profile.route) }) {
            Text("Mi Pedido")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    SaborAndinoTheme {
        HomeScreen(navController = rememberNavController())
    }
}
