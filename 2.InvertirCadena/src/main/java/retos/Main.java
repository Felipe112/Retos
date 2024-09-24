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
   * Importante: La libreria de Log usada para implementar el código es la que no nos procesa
   * las tildes.
   * @param args Parametros.
   */
  public static void main(String[] args) {

    String test = "El rápido zorro marrón salta sobre el perezoso perro. Además, la niña compró un helado de fresa y disfrutó su paseo. ¡Qué día tan fantástico! ¿Y tú, qué harás después? #Aventura @mundo";
    log.info(String.format("Test: %s",test));
    ConvertString convert = new ConvertString();
    String result = convert.investText(test);
    log.info(String.format("Result: %s",result));
  }

}