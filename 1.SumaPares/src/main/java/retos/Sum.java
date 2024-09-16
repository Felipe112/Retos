package retos;

/**
 * Clase encargada de crear los procesos de suma.
 *
 * @author Andrés F. Ceballos.
 * @since 2024-09-12
 */
public class Sum {

  ////
  //// MÉTODOS PÚBLICOS
  ////

  /**
   * Metodo encargado de recibir y sumar los números pares.
   *
   * @param inputs Valores a sumar.
   *
   * @return Resultado de la suma.
   */
  public int sumPairs(int[] inputs) {

    int total = 0;
    for (int input : inputs) {
      if (input % 2 == 0) {
        total += input;
      }
    }
    return total;
  }

}
