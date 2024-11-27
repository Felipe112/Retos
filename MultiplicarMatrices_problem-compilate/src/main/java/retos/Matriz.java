package retos;

import lombok.extern.java.Log;

/**
 * Clase empleada para el manejo de las matrices.
 *
 * @author Andrés F. Ceballos
 * @since 2024-10-22
 */
@Log
public class Matriz {

  public int[][] randomGenerator(int rows, int columns){

    int[][] matrix = null;
    if(rows > 0 && columns > 0 ) {
      matrix = new int[rows][columns];
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          double random = Math.random();
          matrix[i][j] = (int) random;
        }
      }
    }
    return matrix;
  }

}
