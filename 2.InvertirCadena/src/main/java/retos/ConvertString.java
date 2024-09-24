package retos;

import java.nio.charset.StandardCharsets;
import org.apache.commons.lang3.StringUtils;

/**
 * Clase encargada de convertir una cadena.
 *
 * @author Andrés F. Ceballos.
 * @since 2024-09-15
 */
public class ConvertString {

  ////
  //// MÉTODOS PÚBLICOS
  ////

  /**
   * Método empleado para invertir una cadena de texto, aquí se valida que el registro no sea null o
   * vacío.
   *
   * @param request Cadena de texto.
   *
   * @return Cadena invertida.
   */
  public String investText(String request) {

    if (StringUtils.isEmpty(request)) {
      return StringUtils.EMPTY;
    }

    String stringUtf = new String(request.getBytes(), StandardCharsets.UTF_8);

    StringBuilder result = new StringBuilder(stringUtf.length());
    for (int i = stringUtf.length() - 1; i >= 0; i--) {

      result.append(stringUtf.charAt(i));
    }

    return result.toString();
  }

}
