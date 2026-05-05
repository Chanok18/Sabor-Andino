package com.example.saborandino.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
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

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            text = "¡Bienvenido, Comensal! 👋",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "Sabor Andino te espera.",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Tarjetas de acceso rápido
        DashboardCard("Ver Menú", "Explora nuestra variedad de platos") {
            navController.navigate(Screen.Menu.route)
        }

        Spacer(modifier = Modifier.height(16.dp))

        DashboardCard("Mi Pedido", "Revisa lo que has seleccionado") {
            navController.navigate(Screen.Profile.route)
        }

        Spacer(modifier = Modifier.height(16.dp))

        DashboardCard("Mi Perfil", "Gestiona tu información") {
            // Por ahora redirigimos al mismo perfil o a una sección futura
            navController.navigate(Screen.Profile.route)
        }
    }
}

@Composable
fun DashboardCard(title: String, subtitle: String, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = title, style = MaterialTheme.typography.titleLarge)
            Text(text = subtitle, style = MaterialTheme.typography.bodyMedium)
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
