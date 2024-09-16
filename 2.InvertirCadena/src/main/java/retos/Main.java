package retos;

import lombok.extern.java.Log;

/**
 * Clase principal del programa.
 *
 * @author Andrés F. Ceballos
 * @since 2024-09-15
 */
@Log
public class Main {

  ////
  //// MÉTODOS PÚBLICOS
  ////

  /**
   * Método principal del programa.
   *
   * @param args Parametros.
   */
  public static void main(String[] args) {


    ConvertString convert = new ConvertString();
    log.info(convert.investText("texto"));
  }

}