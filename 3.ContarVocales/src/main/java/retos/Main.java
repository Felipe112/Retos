package retos;

import static java.util.FormatProcessor.FMT;

import java.util.HashMap;
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
    Map<Vowel, Integer> result = countString.countVowels("El veloz murciélago hindú comía feliz cardillo y kiwi.");
   String total = "";
    for (Map.Entry<Vowel, Integer> entry : result.entrySet()) {
      total += STR."\n Vocal \{entry.getKey()} # \{entry.getValue()} ";
    }
    log.info(total);
  }

}