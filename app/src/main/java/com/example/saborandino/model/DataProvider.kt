package com.example.saborandino.model

object DataProvider {

    val platos = listOf(
        Plato(
            id = 1,
            nombre = "Ceviche Clásico",
            descripcion = "Pescado fresco marinado en limón con cebolla, camote y choclo.",
            precio = 35.0,
            categoria = "Entradas",
            imagenUrl = "https://www.recetasnestle.com.pe/sites/default/files/styles/recipe_detail_desktop/public/recipe/2023-05/ceviche-de-pescado.jpg?itok=f4z2J2J9"
        ),
        Plato(
            id = 2,
            nombre = "Papa a la Huancaína",
            descripcion = "Papas sancochadas bañadas en una crema de ají amarillo y queso.",
            precio = 18.0,
            categoria = "Entradas",
            imagenUrl = "https://t2.rg.ltmcdn.com/es/posts/0/0/2/papa_a_la_huancaina_33200_orig.jpg"
        ),
        Plato(
            id = 3,
            nombre = "Lomo Saltado",
            descripcion = "Trozos de carne salteados al wok con cebolla, tomate y papas fritas.",
            precio = 45.0,
            categoria = "Fondo",
            imagenUrl = "https://www.comida-peruana.com/base/stock/Recipe/2-image/2-image_web.jpg"
        ),
        Plato(
            id = 4,
            nombre = "Ají de Gallina",
            descripcion = "Crema espesa con pechuga de pollo deshilachada, servido con arroz.",
            precio = 38.0,
            categoria = "Fondo",
            imagenUrl = "https://comidasperuanas.net/wp-content/uploads/2015/01/Aji-de-gallina.jpg"
        ),
        Plato(
            id = 5,
            nombre = "Seco de Res",
            descripcion = "Guiso de carne en salsa de cilantro con frijoles y arroz.",
            precio = 42.0,
            categoria = "Fondo",
            imagenUrl = "https://www.recetasnestle.com.pe/sites/default/files/styles/recipe_detail_desktop/public/recipe/2022-04/seco-de-res.jpg?itok=zQ7_e3L0"
        ),
        Plato(
            id = 6,
            nombre = "Suspiro a la Limeña",
            descripcion = "Dulce tradicional de crema de leche y merengue al oporto.",
            precio = 15.0,
            categoria = "Postres",
            imagenUrl = "https://comidasperuanas.net/wp-content/uploads/2015/10/Suspiro-a-la-limena.jpg"
        ),
        Plato(
            id = 7,
            nombre = "Chicha Morada",
            descripcion = "Bebida refrescante de maíz morado con piña y canela.",
            precio = 8.0,
            categoria = "Bebidas",
            imagenUrl = "https://tipico.pe/wp-content/uploads/2021/07/chicha-morada-receta.jpg"
        ),
        Plato(
            id = 8,
            nombre = "Pisco Sour",
            descripcion = "Cóctel bandera a base de pisco, limón y jarabe de goma.",
            precio = 25.0,
            categoria = "Bebidas",
            imagenUrl = "https://comidasperuanas.net/wp-content/uploads/2015/11/Pisco-sour.jpg"
        )
    )
}
