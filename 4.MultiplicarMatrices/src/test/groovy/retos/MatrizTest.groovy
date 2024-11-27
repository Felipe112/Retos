package retos

import spock.lang.Specification

class MatrizTest extends Specification {

  def "Prueba para randomGenerator: genera una matriz aleatoria válida"() {
    given: "Una instancia de la clase Matriz"
    Matriz matriz = new Matriz()

    when: "Se genera una matriz aleatoria con filas y columnas válidas"
    int[][] result = matriz.randomGenerator(rows, columns)

    then: "La matriz generada tiene las dimensiones correctas"
    result != null
    result.length == rows
    result[0].length == columns

    where:
    rows | columns
    3    | 4
    2    | 2
    1    | 1
  }

  def "Prueba para randomGenerator: retorna null si filas o columnas son inválidas"() {
    given: "Una instancia de la clase Matriz"
    Matriz matriz = new Matriz()

    when: "Se intenta generar una matriz con dimensiones no válidas"
    int[][] result = matriz.randomGenerator(rows, columns)

    then: "El resultado es null"
    result == null

    where:
    rows | columns
    0    | 4
    -1   | 2
    3    | 0
  }

  def "Prueba para multiply: multiplica correctamente dos matrices 2x2"() {
    given: "Una instancia de la clase Matriz y dos matrices válidas"
    Matriz matriz = new Matriz()
    int[][] matrix1 = [[1, 2], [3, 4]]
    int[][] matrix2 = [[5, 6], [7, 8]]

    when: "Se multiplican las matrices"
    int[][] result = matriz.multiply(matrix1, matrix2)

    then: "El resultado es correcto"
    result == [[19, 22], [43, 50]]
  }

  def "Prueba para multiply: lanza excepción si alguna matriz no es válida"() {
    given: "Una instancia de la clase Matriz y matrices inválidas"
    Matriz matriz = new Matriz()
    int[][] invalidMatrix = [[1, 2]]
    int[][] validMatrix = [[5, 6], [7, 8]]

    when: "Se intenta multiplicar matrices inválidas"
    matriz.multiply(invalidMatrix, validMatrix)

    then: "Se lanza una excepción IllegalArgumentException"
    thrown(IllegalArgumentException)
  }

  def "Prueba para print: verifica que no falle al imprimir una matriz"() {
    given: "Una instancia de la clase Matriz y una matriz válida"
    Matriz matriz = new Matriz()
    int[][] matrix = [[1, 2], [3, 4]]

    when: "Se imprime la matriz"
    matriz.print(matrix)

    then: "No ocurre ningún error durante la impresión"
    noExceptionThrown()
  }
}
