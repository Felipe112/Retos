package retos;

import lombok.extern.java.Log;

/**
 * Clase principal del programa.
 *
 * @author Andrés F. Ceballos
 * @since 2024-10-15
 */
@Log
class Main {

  ////
  //// MÉTODOS PÚBLICOS
  ////

  /**
   * Método principal del programa.
   */
  void main() {

    Matriz newMatrix = new Matriz();
   int[][] a = newMatrix.randomGenerator(2,2);
   System.out.println(a);

        //log.info("def");
  }

}