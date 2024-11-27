# Retos

Este reto consiste en implementar un programa que realice la multiplicación de dos matrices de tamaño 2x2. La solución debe considerar la validación de las entradas para manejar matrices de tamaño incorrecto.

### Descripción

El programa debe recibir dos matrices de tamaño 2x2 como entrada y devolver su producto, que también será una matriz de tamaño 2x2. La multiplicación de matrices sigue la fórmula estándar, donde cada elemento de la matriz resultante se obtiene de la suma de los productos de las filas de la primera matriz y las columnas de la segunda.

1. El programa debe ser capaz de validar que las matrices de entrada sean de tamaño 2x2.
2. Proveer un manejo de errores adecuado cuando se reciban matrices de tamaños inválidos.
3. Proveer pruebas unitarias que aseguren el correcto funcionamiento del programa.
4. Implementar el código siguiendo las mejores prácticas de programación: eficiencia, claridad y seguridad.

### Consideraciones Especiales

* Matrices de tamaño incorrecto: Si alguna de las matrices no tiene un tamaño de 2x2, el programa debe manejar esta situación de manera adecuada, por ejemplo, lanzando un error o devolviendo un mensaje que indique el problema.
* Matrices vacías o nulas: Si alguna de las matrices de entrada es nula o está vacía, el programa debe manejar el caso y notificarlo.
* Estructura de datos: Las matrices se recibirán como arreglos o listas bidimensionales de tamaño 2x2.

Entrada:
´´´
Matriz A:
[ [1, 2], 
  [3, 4] ]

Matriz B:
[ [5, 6], 
  [7, 8] ]
´´´  

Salida:
´´´
Matriz Resultado:
[ [19, 22], 
  [43, 50] ]
´´´