package retos;

/**
 * Clase enfocada en calcular y validdar si es un palindromo.
 *
 * @author Andrés F. Ceballos.
 * @since 2024-12-05.
 */
public class Palindrome {

  ////
  //// MÉTODOS PÚBLICOS
  ////

  /**
   * Metodo creado para validar si un texto es un palíndromo
   *
   * @param text Texto a validar.
   *
   * @return resultado {true} or {false}
   */
  public boolean isPalindrome(String text) {

    String cleanText = text.toLowerCase()
        .replaceAll("[áàäâã]", "a")
        .replaceAll("[éèëê]", "e")
        .replaceAll("[íìïî]", "i")
        .replaceAll("[óòöôõ]", "o")
        .replaceAll("[úùüû]", "u")
        .replaceAll("[^a-z0-9]", "");

    String reverseText = new StringBuilder(cleanText).reverse().toString();

    return cleanText.equals(reverseText);

  }

}
