package retos

import spock.lang.Specification

class ArregloTest extends Specification {

  def "Prueba de ordenamiento de arreglo"() {
    given:
    def arreglo = new Arreglo()

    when:
    def result = arreglo.order(nums as int[])

    then:
    result == expectedOrder as int[]

    where:
    nums                   || expectedOrder
    [3, -1, 0, 5, -10, 8]  || [-10, -1, 0, 3, 5, 8]
    [0, 0, 0]              || [0, 0, 0]
    []                     || []
    [-5, -1, -3]           || [-5, -3, -1]
  }

  def "Prueba de impresión del arreglo"() {
    given:
    def arreglo = new Arreglo()
    def array = [1, 2, 3]

    when:
    arreglo.print(array)

    then:
    noExceptionThrown()
  }
}
