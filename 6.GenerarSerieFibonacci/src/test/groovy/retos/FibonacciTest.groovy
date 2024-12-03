package retos

import spock.lang.Specification
import spock.lang.Unroll

class FibonacciTest extends Specification {

  def fibonacci = new Fibonacci()

  @Unroll
  def "generate debe retornar correctamente los primeros #n números de la serie de Fibonacci"() {
    when: "Se generan los primeros N números de la serie de Fibonacci"
    def result = fibonacci.generate(n)

    then: "El resultado debe coincidir con la serie esperada"
    result == expected

    where:
    n || expected
    0 || []
    1 || [0L]
    2 || [0L, 1L]
    5 || [0L, 1L, 1L, 2L, 3L]
    10 || [0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L]
  }

  def "generate debe lanzar una excepción si N es negativo"() {
    when: "Se genera la serie con un valor negativo"
    fibonacci.generate(-1)

    then: "Se lanza una excepción IllegalArgumentException"
    thrown(IllegalArgumentException)
  }

  def "generate debe manejar correctamente un N muy grande"() {
    given: "Un valor grande de N"
    def n = 50

    when: "Se generan los primeros N números de la serie de Fibonacci"
    def result = fibonacci.generate(n)

    then: "El tamaño del resultado debe ser N"
    result.size() == n
    result[-1] > 0
  }
}
