package retos

import spock.lang.Specification

class SumTest extends Specification {

  def "sumPairs debería devolver 0 cuando el arreglo esté vacío"() {
    given:
    def sum = new Sum()
    int[] inputs = []

    when:
    def result = sum.sumPairs(inputs)

    then:
    result == 0
  }

  def "sumPairs debería devolver la suma de números pares en un arreglo con números positivos"() {
    given:
    def sum = new Sum()
    int[] inputs = [1, 2, 3, 4, 5, 6]

    when:
    def result = sum.sumPairs(inputs)

    then:
    result == 12  // 2 + 4 + 6
  }

  def "sumPairs debería devolver 0 cuando no hay números pares en el arreglo"() {
    given:
    def sum = new Sum()
    int[] inputs = [1, 3, 5, 7]

    when:
    def result = sum.sumPairs(inputs)

    then:
    result == 0
  }

  def "sumPairs debería manejar números negativos y devolver la suma de números pares"() {
    given:
    def sum = new Sum()
    int[] inputs = [-2, -1, 0, 1, 2]

    when:
    def result = sum.sumPairs(inputs)

    then:
    result == 0  // -2 + 0 + 2
  }

  def "sumPairs debería devolver la suma correcta cuando hay solo un número par"() {
    given:
    def sum = new Sum()
    int[] inputs = [1, 2, 3]

    when:
    def result = sum.sumPairs(inputs)

    then:
    result == 2
  }
}
