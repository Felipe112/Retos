package retos;

public class Palindrome {

  /**
   * Metodo creado para validar si un texto es un palíndromo
   * @param text Texto a validar.
   * @return resultado {true} or {false}
   */
  public boolean isPalindrome(String text){
    String cleanText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
    String reverseText = new StringBuilder(cleanText).reverse().toString();
    return cleanText.equals(reverseText);
  }

}
