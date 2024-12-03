# Calcular Factorial

Este proyecto implementa la funcionalidad para calcular el factorial de un número entero dado, asegurando un manejo adecuado de casos especiales como el factorial de 0 y valores negativos.

## Descripción
El programa recibe un número entero como entrada y devuelve el valor de su factorial. La implementación garantiza un cálculo eficiente y robusto, considerando casos especiales y proporcionando mensajes claros para entradas inválidas.

### Requisitos.
1. El número de entrada debe ser un entero.
2. El factorial de 0 debe devolver   1.
3. Para números negativos, la función debe lanzar una excepción que indique que el cálculo no es válido.
4. La solución debe manejar números grandes siempre que el sistema lo permita.

### Funcionalidades

* Cálculo del Factorial: Calcula el factorial de un número dado de forma precisa y eficiente.
* Manejo de Casos Especiales: Responde adecuadamente para el factorial de 0 y valores negativos.
* Robustez: Maneja entradas inválidas lanzando excepciones claras.

### Consideraciones Especiales
* Factorial de 0: Matemáticamente, el factorial de 0 es 1.
* Números Negativos: El factorial no está definido para números negativos, por lo que la función lanzará una excepción.
* Optimización: La implementación está diseñada para calcular valores grandes siempre que el sistema lo permita, utilizando técnicas iterativas para evitar desbordamientos de pila.

### Pruebas
El proyecto incluye un conjunto completo de pruebas unitarias desarrolladas en Spock, que validan:

* El cálculo correcto del factorial para números pequeños y grandes.
* El manejo de casos especiales como 0! y números negativos.
* El rendimiento y la eficiencia al calcular factoriales de números grandes.