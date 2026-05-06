# Mejoras con Gemini — Sabor Andino

---

## Mejora 1: Rediseño de Tarjetas de Plato y Filtros en el Menú

### Prompt usado:
Actúa como un diseñador senior especializado en UI para aplicaciones móviles Android con Jetpack Compose, analiza mi aplicación y ayúdame a mejorar en:
- Jerarquía visual (tamaños, texto)
- Espaciado y alineación
- Uso de colores (Material 3)
- Experiencia de usuario
- Componentes visuales (cards, botones, top bar)
- Estados vacíos o feedback al usuario

### Sugerencia de Gemini:
"Para un menú de restaurante, la imagen es la protagonista. Sugiero reemplazar la lista plana por `ElevatedCard` con bordes redondeados (16dp) y usar `FilterChip` para las categorías en lugar de botones estándar. Esto mejora la 'escaneabilidad' y hace que los platos se vean más apetecibles."

### Implementación:
Se creó el componente `PlatoCard` en `MenuScreen.kt` utilizando `ElevatedCard` y `ContentScale.Crop` para las imágenes. Se implementó `FilterChip` de Material 3 para un filtrado de categorías más intuitivo.

### Reflexión:
La sugerencia fue muy útil. Cambiar los botones por chips y usar tarjetas elevadas le dio a la app un aspecto mucho más moderno y profesional, alineado con las guías de Material 3.

---

## Mejora 2: Jerarquía Visual en la Pantalla de Detalle

### Prompt usado:
(Igual al anterior)

### Sugerencia de Gemini:
"El precio es un factor decisivo, debe resaltar. Sugiero usar un contenedor tonal para el precio y agrupar el selector de cantidad con el botón de 'Agregar' en una barra de acción inferior con elevación suave para mejorar la ergonomía."

### Implementación:
En `DetailScreen.kt`, se implementó una imagen tipo 'Hero' con bordes redondeados en la base. El precio se colocó dentro de una `Surface` con el color primario del tema y se diseñó una barra inferior agrupada para las acciones de compra.

### Reflexión:
La mejora en la jerarquía visual facilita que el usuario encuentre la información importante de inmediato. El agrupamiento de botones en la parte inferior hace que la app sea más fácil de usar con una sola mano.

---

## Mejora 3: Identidad Visual y Estética en el Login

### Prompt usado:
(Igual al anterior)

### Sugerencia de Gemini:
"El login es la primera impresión. Agrega un icono de marca distintivo y utiliza un gradiente sutil de fondo que use los colores del tema. Asegúrate de que los campos de texto tengan un redondeo consistente con las tarjetas del resto de la app."

### Implementación:
Se rediseñó `LoginScreen.kt` agregando un icono de restaurante centralizado, un fondo con gradiente vertical (`Brush.verticalGradient`) y se aumentó el redondeo de los `OutlinedTextField` a 16dp.

### Reflexión:
Añadir elementos de marca y el gradiente transformó una pantalla aburrida en una experiencia de bienvenida. El diseño ahora se siente cohesivo en toda la aplicación.
