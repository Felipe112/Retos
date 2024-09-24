package retos

import spock.lang.Specification

class CountStringTest extends Specification {

  def "Debe retornar null cuando el string es vacío o null"() {
    given: "Una instancia de CountString"
    def countString = new CountString()

    when: "Se cuenta las vocales en un string vacío o null"
    def resultNull = countString.countVowels(null)
    def resultEmpty = countString.countVowels("")

    then: "El resultado es null"
    resultNull == null
    resultEmpty == null
  }

  def "Debe contar correctamente las vocales en un texto sin acentos"() {
    given: "Una instancia de CountString"
    def countString = new CountString()

    when: "Se cuenta las vocales en un texto sin acentos"
    def result = countString.countVowels("Hola Mundo")

    then: "Las vocales son contadas correctamente"
    result[Vowel.A] == 1
    result[Vowel.E] == 0
    result[Vowel.I] == 0
    result[Vowel.O] == 2
    result[Vowel.U] == 1
  }

  def "Debe contar correctamente las vocales en un texto con acentos"() {
    given: "Una instancia de CountString"
    def countString = new CountString()

    when: "Se cuenta las vocales en un texto con acentos"
    def result = countString.countVowels("Árbol Élite Íntimo Ópera Útil")

    then: "Las vocales con acentos son contadas correctamente"
    result[Vowel.A] == 2
    result[Vowel.E] == 3
    result[Vowel.I] == 4
    result[Vowel.O] == 3
    result[Vowel.U] == 1
  }

  def "Debe ignorar caracteres que no son vocales"() {
    given: "Una instancia de CountString"
    def countString = new CountString()

    when: "Se cuenta las vocales en un texto con caracteres no válidos"
    def result = countString.countVowels("1234 !?")

    then: "No hay vocales en el resultado"
    result[Vowel.A] == 0
    result[Vowel.E] == 0
    result[Vowel.I] == 0
    result[Vowel.O] == 0
    result[Vowel.U] == 0
  }

  def "Debe manejar correctamente las mayúsculas y minúsculas"() {
    given: "Una instancia de CountString"
    def countString = new CountString()

    when: "Se cuenta las vocales en un texto con letras en mayúsculas y minúsculas"
    def result = countString.countVowels("Aa Ee Ii Oo Uu")

    then: "Las vocales son contadas correctamente ignorando mayúsculas y minúsculas"
    result[Vowel.A] == 2
    result[Vowel.E] == 2
    result[Vowel.I] == 2
    result[Vowel.O] == 2
    result[Vowel.U] == 2
  }
}
