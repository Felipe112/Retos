package retos;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import lombok.extern.java.Log;

/**
 * Clase empleada manipular y generar los arreglos.
 *
 * @author Andrés F. Ceballos
 * @since 2024-12-11
 */
@Log
public class Arreglo {

  /// / / PROPIEDADES /
  private final static int MIN = -10;

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
   * Metodo encargado de ordenar el array.
   * @param numbs array.
   * @return Nuevo array ordenado.
   */
  public int[] order(int[] numbs) {

    int[] copy = Arrays.copyOf(numbs, numbs.length);
    Arrays.sort(copy);
    return copy;
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

}
