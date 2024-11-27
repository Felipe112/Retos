# Multiplicación de Matrices 2x2
Este proyecto implementa la funcionalidad para multiplicar dos matrices de tamaño 2x2, asegurando que se manejan correctamente las entradas inválidas.

## Descripción
El programa recibe dos matrices de tamaño 2x2 como entrada y devuelve una nueva matriz 2x2 resultante de su multiplicación. Además, incluye validaciones para garantizar que las matrices sean del tamaño correcto antes de realizar la operación.

## Requisitos
Ambas matrices deben ser de tamaño 2x2. Si alguna no cumple esta condición, el programa lanzará una excepción.
La multiplicación se realiza de acuerdo con las reglas matemáticas estándar para matrices.
El programa está diseñado para ser robusto y manejar errores de entrada.

## Funcionalidades
* Validación de matrices: Verifica si las matrices proporcionadas son válidas (2x2).
* Multiplicación de matrices: Calcula el producto de las dos matrices si son válidas.
* Generación de matrices aleatorias: Permite generar matrices aleatorias de cualquier tamaño con valores en un rango definido.
* Impresión de matrices: Imprime matrices en un formato legible.

## Consideraciones Especiales
Si alguna matriz no es válida, se lanza una excepción con un mensaje descriptivo.
El código está implementado para ser claro, eficiente y seguro.
Incluye pruebas unitarias desarrolladas en Spock para garantizar el correcto funcionamiento.

## Pruebas
El proyecto incluye un conjunto completo de pruebas unitarias desarrolladas en Spock, que validan:

* La correcta multiplicación de matrices.
* La generación de matrices aleatorias.
* La validación de entradas.
