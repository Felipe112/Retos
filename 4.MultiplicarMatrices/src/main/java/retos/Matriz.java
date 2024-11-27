package retos;

import java.util.concurrent.ThreadLocalRandom;
import lombok.extern.java.Log;

/**
 * Clase empleada para el manejo de las matrices.
 *
 * @author Andrés F. Ceballos
 * @since 2024-11-26
 */
@Log
public class Matriz {

  private final int MIN = -100;

  private final int MAX = 100;

  /**
   * Metodo generador de datos aleatorios para llenar una matríx.
   *
   * @param rows Filas
   * @param columns columnas
   *
   * @return
   */
  public int[][] randomGenerator(int rows, int columns) {

    int[][] matrix = null;
    if (rows > 0 && columns > 0) {
      matrix = new int[rows][columns];
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          matrix[i][j] = ThreadLocalRandom.current().nextInt(MIN, MAX);
        }
      }
    }
    return matrix;
  }

  /**
   * Metodo creado para multiplicar dos matrices.
   *
   * @param matrix1 Producto.
   * @param matrix2 Producto.
   *
   * @return Resultado.
   */
  public int[][] multiply(int[][] matrix1, int[][] matrix2) {

    if (!isValid(matrix1) || !isValid(matrix2)) {
      throw new IllegalArgumentException("Ambas matrices deben ser de tamaño 2x2.");
    }

    int[][] result = new int[2][2];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        result[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
      }
    }

    return result;
  }

  /**
   * Funcionalidad empleada para validar si una matrix cumple con la restricción establecida.
   *
   * @param matrix data.
   *
   * @return {true} o {false} dado el caso de validación.
   */
  public boolean isValid(int[][] matrix) {

    if (matrix == null || matrix.length != 2) {
      return false;
    }
    for (int[] row : matrix) {
      if (row == null || row.length != 2) {
        return false;
      }
    }
    return true;
  }

  /**
   * Metodo empleado para imprimir una matrix de datos.
   *
   * @param matrix data.
   */
  public void print(int[][] matrix) {

    for (int[] row : matrix) {
      String data = "[";
      for (int value : row) {
        data += value + ",";
      }
      log.info(data + "]");
    }
  }

}