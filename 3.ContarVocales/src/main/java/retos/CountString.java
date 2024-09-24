package retos;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.java.Log;
import org.apache.commons.lang3.StringUtils;

/**
 * Clase enfocada en implementar procesos para contar caracteres de un string.
 *
 * @author Andrés F. Ceballos
 * @since 2024-09-18
 */
@Log
public class CountString {

  ////
  //// MÉTODOS PÚBLICOS
  ////

  /**
   * Metodo encargado de tomar una cddena de texto y contar el número de vocales.
   * @param request Texto.
   * @return Lista y contador de vocales.
   */
  public Map<Vowel, Integer> countVowels(String request) {

    if (StringUtils.isEmpty(request)) {
      return null;
    }

    request = request.toUpperCase();

    HashMap<Vowel, Integer> result = new HashMap<>();
    for (Vowel vowel : Vowel.values()) {
      result.put(vowel, 0);
    }

    for (int i = 0; i < request.length(); i++) {
      switch (request.charAt(i)) {
        case 'A', 'Á'  -> result.put(Vowel.A, result.get(Vowel.A) + 1);
        case 'E', 'É' -> result.put(Vowel.E, result.get(Vowel.E) + 1);
        case 'I', 'Í' -> result.put(Vowel.I, result.get(Vowel.I) + 1);
        case 'O', 'Ó' -> result.put(Vowel.O, result.get(Vowel.O) + 1);
        case 'U', 'Ú' -> result.put(Vowel.U, result.get(Vowel.U) + 1);
        default -> log.info("No es vocal");
      }
    }
    return result;
  }

}
