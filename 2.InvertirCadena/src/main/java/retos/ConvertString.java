package retos;

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

    StringBuilder result = new StringBuilder(request.length());
    for (int i = request.length() - 1; i >= 0; i--) {
      result.append(request.charAt(i));
    }

    return result.toString();
  }

}
