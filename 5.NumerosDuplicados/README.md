# Números duplicados
Este proyecto implementa la funcionalidad para eliminar los números duplicados de un arreglo de enteros, asegurando que se preserve el orden original de los elementos.

## Descripción
El programa recibe un arreglo de números como entrada y devuelve un nuevo arreglo donde los duplicados han sido eliminados. Además, garantiza que el orden de los elementos se mantenga tal como aparecen en la entrada original.

### Requisitos
1. El arreglo de entrada debe ser de números enteros.
2. Los duplicados se eliminan respetando el primer orden de aparición.
3. La solución debe ser eficiente y capaz de manejar arreglos de cualquier tamaño.

### Funcionalidades
* Eliminación de duplicados: Remueve los números duplicados del arreglo.
* Preservación del orden: Asegura que los elementos en el arreglo resultante mantengan el orden original de aparición.
* Robustez: Maneja correctamente entradas vacías o con un único elemento, devolviendo la misma entrada.

### Consideraciones Especiales
* Si el arreglo está vacío, el resultado será otro arreglo vacío.
* Si todos los elementos son únicos, el arreglo original será devuelto sin cambios.
* La implementación utiliza estructuras de datos eficientes, como LinkedHashSet, para garantizar la eliminación de duplicados y la preservación del orden.

### Pruebas
El proyecto incluye un conjunto completo de pruebas unitarias desarrolladas en Spock, que validan:

* La eliminación correcta de números duplicados.
* La preservación del orden original de los elementos.
* El manejo de casos borde, como arreglos vacíos o con un único elemento.