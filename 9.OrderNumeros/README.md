# Ordenar Números

Este proyecto implementa una función que ordena un arreglo de números en orden ascendente, incluyendo números negativos y ceros. Está diseñado para manejar arreglos de diferentes tamaños y garantizar un comportamiento eficiente y robusto.

## Descripción

El programa toma como entrada un arreglo de números y devuelve una versión ordenada en orden ascendente. La implementación asegura compatibilidad con números negativos, ceros y arreglos grandes, priorizando la eficiencia en el procesamiento.

### Requisitos

* La entrada debe ser un arreglo de números (enteros o flotantes).

* La función debe ser capaz de manejar:

  - Números negativos.
  - Ceros.
  - Arreglos vacíos.

* La salida debe ser un nuevo arreglo ordenado sin modificar el arreglo original.

* La implementación debe ser eficiente, incluso para arreglos grandes.

### Funcionalidades

* Ordenamiento Ascendente: Ordena los elementos de un arreglo de menor a mayor, incluyendo valores negativos y ceros.

* Compatibilidad con Arreglos Vacíos: Si el arreglo está vacío, la función devuelve un arreglo vacío.

* Eficiencia: Utiliza algoritmos de ordenamiento modernos para garantizar un buen rendimiento con datos grandes.

* Inmutabilidad: No modifica el arreglo original, asegurando la integridad de los datos.

### Pruebas
El proyecto incluye un conjunto completo de pruebas unitarias desarrolladas en Spock, que validan:

* El orden correcto de los elementos en el arreglo.

* El manejo adecuado de arreglos con números negativos, ceros y valores mixtos.

* El comportamiento en casos límite como arreglos vacíos o muy grandes.

* La eficiencia del algoritmo para arreglos de gran tamaño.

