# Mejoras con Gemini — Sabor Andino

---

## Mejora 1: Tarjetas del menú

### Prompt usado:
Actúa como un diseñador senior...

### Antes:
![img.png](img.png)
### Después:
(Imagen)

### Implementación:
Se agregaron bordes redondeados y elevación para mejorar la jerarquía visual.

### Reflexión:
La mejora fue útil porque hace que los platos se vean más atractivos y ordenados.

---

## Mejora 2: Estado vacío en pedido

### Prompt usado:
(igual)

### Sugerencia:
Mostrar mensaje cuando no hay pedidos

### Antes:
Pantalla vacía

### Después:
Mensaje amigable al usuario

### Implementación:
Se agregó una validación `if` mostrando texto centrado.

### Reflexión:
Mejora la experiencia del usuario al no dejar la pantalla vacía.

---

## Mejora 3: TopBar

### Prompt usado:
(igual)

### Sugerencia:
Agregar navegación clara

### Antes:
Sin botón atrás

### Después:
TopBar con flecha

### Implementación:
Uso de `TopAppBar` con `popBackStack()`

### Reflexión:
Hace la navegación más intuitiva.