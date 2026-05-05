package com.example.saborandino.model

object DataProvider {

    val platos = listOf(
        Plato(
            id = 1,
            nombre = "Ceviche Clásico",
            descripcion = "Pescado fresco marinado en limón con cebolla, camote y choclo.",
            precio = 35.0,
            categoria = "Entradas"
        ),
        Plato(
            id = 2,
            nombre = "Papa a la Huancaína",
            descripcion = "Papas sancochadas bañadas en una crema de ají amarillo y queso.",
            precio = 18.0,
            categoria = "Entradas"
        ),
        Plato(
            id = 3,
            nombre = "Lomo Saltado",
            descripcion = "Trozos de carne salteados al wok con cebolla, tomate y papas fritas.",
            precio = 45.0,
            categoria = "Fondo"
        ),
        Plato(
            id = 4,
            nombre = "Ají de Gallina",
            descripcion = "Crema espesa con pechuga de pollo deshilachada, servido con arroz.",
            precio = 38.0,
            categoria = "Fondo"
        ),
        Plato(
            id = 5,
            nombre = "Seco de Res",
            descripcion = "Guiso de carne en salsa de cilantro con frijoles y arroz.",
            precio = 42.0,
            categoria = "Fondo"
        ),
        Plato(
            id = 6,
            nombre = "Suspiro a la Limeña",
            descripcion = "Dulce tradicional de crema de leche y merengue al oporto.",
            precio = 15.0,
            categoria = "Postres"
        ),
        Plato(
            id = 7,
            nombre = "Chicha Morada",
            descripcion = "Bebida refrescante de maíz morado con piña y canela.",
            precio = 8.0,
            categoria = "Bebidas"
        ),
        Plato(
            id = 8,
            nombre = "Pisco Sour",
            descripcion = "Cóctel bandera a base de pisco, limón y jarabe de goma.",
            precio = 25.0,
            categoria = "Bebidas"
        )
    )
}
