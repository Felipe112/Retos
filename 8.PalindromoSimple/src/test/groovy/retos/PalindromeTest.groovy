package retos

import spock.lang.Specification

class PalindromeTest extends Specification {

  def "Validar si un texto es palíndromo"() {
    given: "Una instancia de la clase Palindrome"
    def palindrome = new Palindrome()

    expect: "El resultado del método isPalindrome es correcto"
    palindrome.isPalindrome(input) == expectedResult

    where:
    input                          | expectedResult
    "Anita lava la tina"           | true
    "Amo la pacífica paloma"       | true
    "Dábale arroz a la zorra el abad" | true
    "La ruta natural"              | true
    "No es palíndromo"             | false
    "12321"                        | true
    "12345"                        | false
    ""                             | true
    "A man, a plan, a canal, Panama" | true
    "No lemon, no melon"           | true
  }
}
