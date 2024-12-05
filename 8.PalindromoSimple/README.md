# Palíndromo Simple

Este proyecto implementa una funcionalidad para determinar si una palabra o frase es un palíndromo, ignorando mayúsculas, espacios y puntuación. Está diseñado para manejar entradas largas y garantizar un comportamiento robusto ante diferentes casos.

## Descripción
El programa evalúa si una palabra o frase se lee igual de izquierda a derecha y de derecha a izquierda. Ignora caracteres no alfabéticos y no distingue entre mayúsculas y minúsculas, asegurando una verificación precisa y flexible.
### Requisitos.
1. La entrada debe ser una cadena de texto.
2. Los espacios, mayúsculas y caracteres de puntuación no deben afectar el resultado.
3. La función debe manejar frases largas eficientemente.
4. Las entradas vacías o compuestas solo por caracteres no alfabéticos deben considerarse no palíndromos.

### Funcionalidades

* Verificación de Palíndromo: Determina si una palabra o frase es un palíndromo considerando únicamente caracteres alfabéticos.
* Entradas Vacías o Inválidas: Cualquier cadena sin caracteres alfabéticos es tratada como no válida.
* Eficiencia: Implementada de manera que pueda manejar entradas extensas sin comprometer el rendimiento.

### Pruebas
El proyecto incluye un conjunto completo de pruebas unitarias desarrolladas en Spock, que validan:

* La identificación correcta de palabras y frases palíndromas.
* El manejo adecuado de espacios, puntuación y mayúsculas.
* El comportamiento en casos límite como entradas vacías, muy largas o sin caracteres alfabéticos.
* La eficiencia al procesar entradas grandes.