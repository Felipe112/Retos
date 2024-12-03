package retos

import spock.lang.Specification

class FactorialTest extends Specification {
  def "calcular factorial de un número positivo"() {
    given: "una instancia de la clase Factorial"
    def factorial = new Factorial()

    when: "calcular el factorial de un número positivo"
    BigInteger result = factorial.calculate(value)

    then: "el resultado es correcto"
    result == expectedResult

    where:
    value | expectedResult
    0     | BigInteger.ONE  // 0! = 1
    1     | BigInteger.ONE  // 1! = 1
    2     | BigInteger.valueOf(2)  // 2! = 2
    3     | BigInteger.valueOf(6)  // 3! = 6
    4     | BigInteger.valueOf(24) // 4! = 24
    5     | BigInteger.valueOf(120) // 5! = 120
    16    | BigInteger.valueOf(20922789888000)
  }

  def "debe lanzar una excepción si el valor es negativo"() {
    given: "una instancia de la clase Factorial"
    def factorial = new Factorial()

    when: "calcular el factorial de un número negativo"
    factorial.calculate(-1)

    then: "se lanza IllegalArgumentException"
    thrown(IllegalArgumentException)
  }

  def "calcular factorial de un número grande"() {
    given: "una instancia de la clase Factorial"
    def factorial = new Factorial()

    when: "calcular el factorial de un número grande"
    BigInteger result = factorial.calculate(50)

    then: "el resultado no es nulo"
    result != null
    result > BigInteger.ZERO  // Asegurarse de que el resultado sea positivo
  }
}
