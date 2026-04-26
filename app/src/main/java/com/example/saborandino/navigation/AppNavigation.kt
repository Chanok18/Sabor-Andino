package com.example.saborandino.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.saborandino.screens.DetailScreen
import com.example.saborandino.screens.HomeScreen
import com.example.saborandino.screens.LoginScreen
import com.example.saborandino.screens.MenuScreen
import com.example.saborandino.screens.ProfileScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {

        composable(Screen.Login.route) {
            LoginScreen(navController)
        }
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.Menu.route) {
            MenuScreen(navController)
        }

        composable(Screen.Detail.route) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toInt() ?: 0
            DetailScreen(navController, id)
        }
        composable(Screen.Profile.route) {
            ProfileScreen(navController)
        }
    }
}