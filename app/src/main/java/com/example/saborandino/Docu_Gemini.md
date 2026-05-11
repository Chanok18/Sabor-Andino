# Mejoras con Gemini — Sabor Andino

---

## Mejora 1: Rediseño en el Menú,Perfl y Login

### Prompt usado:
Actúa como un diseñador senior especializado en UI para aplicaciones 
móviles Android con Jetpack Compose, analiza mi aplicación y 
ayúdame a mejorar en:
- Jerarquía visual (tamaños, texto)
- Espaciado y alineación
- Uso de colores
- Componentes visuales (cards, botones, top bar)
  IMPORTANTE:
- No cambies la lógica de negocio
- Propón mejoras realistas para un estudiante
Objetivo: mejorar la apariencia y usabilidad sin romper la funcionalidad.

### Sugerencia:
"Para un menú de restaurante, la imagen es la protagonista. Sugiero reemplazar la lista plana 
por `ElevatedCard` con bordes redondeados (16dp) y usar `FilterChip` para las categorías. Esto
mejora la 'escaneabilidad' y la estética general."

### Antes:
![img_4.png](docs/img_4.png)
### Después:
![img_2.png](docs/img_2.png)
### Implementación:
Se implementó `PlatoCard` usando `ElevatedCard` y `ContentScale.Crop` para las imágenes. Se reemplazaron los botones de categoría por `FilterChip`.

### Antes:
![img_3.png](docs/img_3.png)

### Despues:
![img_5.png](docs/img_5.png)

### Reflexión:
La sugerencia fue fundamental. La app pasó de parecer un prototipo de
texto a una aplicación comercial real donde el producto
(la comida) destaca.

---

## Mejora 2: Incorporación de Imagenes en el Menú

### Prompt usado:
Chat para el apartado de Menu me gustaria agregar imagenes, 
sugiereme de que forma deberia implementarlo y guiame paso a paso
### Sugerencia:
"Un menú vacío no debe ser solo una imagen en blanco. Agrega una
imagen visual que informe al usuario que plato esta escogiendo y 
proporciónale una estructura clara"

### Antes:
![img_6.png](docs/img_6.png)
### Después:
![img_8.png](docs/img_8.png)
### Implementación:
Imagenes de los platos      
### Reflexión:
Mejorar lo que es el menú agreamos imagenes para asi hacer mejor la experencia
de usuario las imagenes fueron agregadas mediante link.

---

## Mejora 3: Organización en Detalle del Plato

### Prompt usado:
Igual al anterior, enfocado en componentes visuales y experiencia de usuario pero ahora en los detalles de
cada plato para asi el usuario pueda ver mejor la informacion.

### Sugerencia:
"Resalta el precio usando contenedores tonales y agrupa los controles
de cantidad con el botón de compra en la parte inferior para 
mejorar la ergonomía al usar el teléfono con una mano."

![img_9.png](docs/img_9.png)

### Implementación:
Uso de `Scaffold` con una barra de acciones inferior personalizada en `DetailScreen.kt` y estilos de tipografía `Headline` para el nombre del plato.

### Reflexión:
Esta mejora cambió la forma en que el usuario interactúa 
con la pantalla de detalle, haciendo el proceso de 'Agregar' 
mucho más rápido e intuitivo.
