package retos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para generar la serie Fibonacci.
 * @since 2024-12-02
 * @author Andrés F. Ceballos.
 */
public class Fibonacci {

  /**
   * Genera los primeros N números de la serie de Fibonacci.
   *
   * @param n El número de elementos a generar.
   *
   * @return Una lista con los primeros N números de la serie de Fibonacci.
   *
   * @throws IllegalArgumentException si n es negativo.
   */
  public List<Long> generate(int n) {

    if (n < 0) {
      throw new IllegalArgumentException("El valor de N no puede ser negativo.");
    }

    List<Long> fibonacciSeries = new ArrayList<>(n);
    if (n == 0) {
      return fibonacciSeries;
    }

    fibonacciSeries.add(0L);
    if (n == 1) {
      return fibonacciSeries;
    }

    fibonacciSeries.add(1L);

    for (int i = 2; i < n; i++) {
      fibonacciSeries.add(fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2));
    }

    return fibonacciSeries;
  }

}
