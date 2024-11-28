package retos;

import java.util.LinkedHashSet;
import java.util.concurrent.ThreadLocalRandom;
import lombok.extern.java.Log;

/**
 * Clase empleada manipular y generar los arreglos.
 *
 * @author Andrés F. Ceballos
 * @since 2024-11-27
 */
@Log
public class Arreglo {

  /// / / PROPIEDADES /
  private final static int MIN = 0;

  private final static int MAX = 10;

  ////
  //// MÉTODOS PÚBLICOS
  ////

  /**
   * Metodo empleado para generar arreglos con valores aleatorios.
   *
   * @param size tamaño del arreglo.
   *
   * @return arreglo generado.
   */
  public int[] randomGenerator(int size) {

    int[] array = null;
    if (size > 0) {
      array = new int[size];
      for (int i = 0; i < size; i++) {
        array[i] = ThreadLocalRandom.current().nextInt(MIN, MAX);

      }
    }
    return array;
  }

  /**
   * Metodo usado para corregir los registros duplicados.
   *
   * @param array de datos duplicados.
   *
   * @return Resultado.
   */
  public int[] correctArray(int[] array) {

    LinkedHashSet<Integer> seenElements = new LinkedHashSet<>();
    for (int value : array) {
      seenElements.add(value);
    }
    return convertLinkedHashSetToIntArray(seenElements);
  }

  /**
   * Imprimir un array dado.
   *
   * @param array Arreglo especificado.
   */
  public void print(int[] array) {

    StringBuilder data = new StringBuilder("[");

    for (int value : array) {
      data.append(value).append(",");
    }

    log.info(data + "]");
  }

  ////
  //// MÉTODOS PRIVADOS
  ////
  ///

  /**
   * Metodo usado para convertir un LinkedHashSet a un Array
   *
   * @param set Lista de Hash con los valores.
   *
   * @return Array.
   */
  private int[] convertLinkedHashSetToIntArray(LinkedHashSet<Integer> set) {

    int[] array = new int[set.size()];
    int index = 0;
    for (Integer value : set) {
      array[index++] = value;
    }
    return array;
  }

}
