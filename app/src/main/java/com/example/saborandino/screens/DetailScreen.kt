package com.example.saborandino.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController, id: Int) {

    Column(modifier = Modifier.padding(24.dp)) {

        Text("Detalle del plato ID: $id")


        Button(onClick = { navController.popBackStack() }) {
            Text("Volver")
        }
    }
}