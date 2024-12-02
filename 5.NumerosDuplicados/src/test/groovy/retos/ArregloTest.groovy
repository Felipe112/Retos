package retos

import spock.lang.Specification

class ArregloTest extends Specification {

  def arreglo = new Arreglo()

  def "randomGenerator debe generar un arreglo de tamaño especificado con valores aleatorios en el rango [0, 10)"() {
    when: "Se genera un arreglo con un tamaño específico"
    def result = arreglo.randomGenerator(size)

    then: "El arreglo generado debe tener el tamaño esperado y valores en el rango permitido"
    result.size() == size
    result.every { it >= 0 && it < 10 }

    where:
    size << 5
  }

  def "randomGenerator debe retornar null si el tamaño es menor o igual a 0"() {
    when: "Se genera un arreglo con tamaño no positivo"
    def result = arreglo.randomGenerator(size)

    then: "El resultado debe ser null"
    result == null

    where:
    size << [-1, 0]
  }

  def "correctArray debe eliminar duplicados y preservar el orden de aparición"() {
    given: "Un arreglo con valores duplicados"
    def inputArray = [3, 1, 3, 2, 1] as int[]

    when: "Se corrige el arreglo"
    def result = arreglo.correctArray(inputArray)

    then: "El arreglo resultante no debe tener duplicados y debe preservar el orden"
    result == [3, 1, 2] as int[]
  }

  def "correctArray debe retornar un arreglo vacío si se proporciona uno vacío"() {
    given: "Un arreglo vacío"
    def inputArray = [] as int[]

    when: "Se corrige el arreglo"
    def result = arreglo.correctArray(inputArray)

    then: "El arreglo resultante también debe estar vacío"
    result == [] as int[]
  }

}
