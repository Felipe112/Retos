# Generar Serie Fibonacci

Este proyecto implementa la funcionalidad para generar los primeros N números de la serie de Fibonacci, optimizando el 
cálculo para manejar valores grandes de manera eficiente y sin problemas de rendimiento.

## Descripción.
El programa recibe un número entero 𝑁 como entrada y devuelve una lista con los primeros 𝑁 números de la serie de 
Fibonacci. La implementación utiliza métodos optimizados para garantizar que el cálculo sea rápido y eficiente, incluso 
para valores grandes de 𝑁.

### Requisitos
1. N debe ser un número entero mayor o igual a 0.
2. La función debe generar los primeros 𝑁 números de la serie de Fibonacci en orden.
3. La solución debe manejar valores grandes de 𝑁 sin problemas de rendimiento ni errores por desbordamiento.

### Funcionalidades
* Generación de la Serie: Calcula los primeros 𝑁 números de la serie de Fibonacci.
* Optimización: Implementación optimizada para manejar grandes valores de 𝑁 utilizando técnicas como almacenamiento temporal (memoization) o iteración.
* Robustez: Maneja correctamente casos como 𝑁=0 (devolviendo una lista vacía) y 𝑁=1 (devolviendo una lista con el único valor inicial).

### Consideraciones Especiales
* Si 𝑁=0, la salida será una lista vacía.
* Si 𝑁=1, la salida será una lista que contiene solo el número inicial de Fibonacci [0].
* Si 𝑁≥2, la lista contendrá los números de Fibonacci generados de forma secuencial, comenzando con [0,1].
* La implementación asegura una complejidad temporal y espacial óptima, utilizando almacenamiento temporal para evitar cálculos redundantes.

### Pruebas
El proyecto incluye un conjunto completo de pruebas unitarias desarrolladas en Spock, que validan:

* La generación correcta de los primeros 𝑁 números de la serie de Fibonacci.
* La optimización del cálculo para manejar valores grandes de 𝑁.
* El manejo de casos borde, como 𝑁=0, 𝑁=1, y valores grandes como 𝑁=1000.


