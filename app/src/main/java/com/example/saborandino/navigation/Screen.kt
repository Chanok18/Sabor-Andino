package com.example.saborandino.navigation

/**
 * Screen: Clase sellada (sealed class) para definir las rutas de navegación.
 * Type-safety - Garantiza que solo las rutas definidas sean accesibles.
 *  Route - String que identifica de forma única a cada pantalla.
 */
sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Home : Screen("home")
    object Menu : Screen("menu")
    object Detail : Screen("detail/{id}") {
        /**
         * Crea una ruta dinámica inyectando el ID del plato.
         */
        fun createRoute(id: Int) = "detail/$id"
    }
    object Profile : Screen("profile")
}