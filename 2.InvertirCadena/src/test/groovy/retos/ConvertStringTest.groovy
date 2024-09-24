
import retos.ConvertString
import spock.lang.Specification

class ConvertStringTest extends Specification {

  def "Debería devolver una cadena invertida correctamente"() {
    given: "Una instancia de la clase ConvertString"
    def convertString = new ConvertString();

    when: "Se invierte la cadena '#input'"
    def result = convertString.investText(input)

    then: "El resultado es '#expected'"
    result == expected

    where:
    input        | expected
    "Hola Mundo" | "odnuM aloH"
    "Spock"      | "kcopS"
    "12345"      | "54321"
    "¡Hola!"     | "!aloH¡"
  }

  def "Debería devolver una cadena vacía si el input es vacío"() {
    given: "Una instancia de la clase ConvertString"
    def convertString = new ConvertString()

    when: "Se invierte una cadena vacía"
    def result = convertString.investText("")

    then: "El resultado es una cadena vacía"
    result == ""
  }

  def "Debería devolver una cadena vacía si el input es null"() {
    given: "Una instancia de la clase ConvertString"
    def convertString = new ConvertString()

    when: "Se invierte un input null"
    def result = convertString.investText(null)

    then: "El resultado es una cadena vacía"
    result == ""
  }

  def "Debería manejar correctamente cadenas con caracteres UTF-8"() {
    given: "Una instancia de la clase ConvertString"
    def convertString = new ConvertString()

    when: "Se invierte una cadena con caracteres especiales"
    def result = convertString.investText("¡Hola, mundo! ñÑ")

    then: "El resultado es 'Ññ !odnum ,aloH¡'"
    result == "Ññ !odnum ,aloH¡"
  }
}
