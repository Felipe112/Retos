package retos;

import java.util.Map;
import lombok.extern.java.Log;

/**
 * Clase principal del programa.
 *
 * @author Andrés F. Ceballos
 * @since 2024-09-18
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

    CountString countString = new CountString();
    Map<Vowel, Integer> result =
        countString.countVowels("El veloz murciélago hindú comía feliz cardillo y kiwi.");
    StringBuilder total = new StringBuilder();

    for (Map.Entry<Vowel, Integer> entry : result.entrySet()) {
      total.append(STR."\n Vocal \{entry.getKey()} # \{entry.getValue()} ");
    }

    log.info(total.toString());
  }

}