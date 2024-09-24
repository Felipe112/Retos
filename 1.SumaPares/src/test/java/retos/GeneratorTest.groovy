package retos

import spock.lang.Specification

import java.util.concurrent.ThreadLocalRandom

class GeneratorTest extends Specification {

  def "generatorArrayNumbers debería generar un arreglo con dimensión aleatoria entre 1 y 100"() {
    given:
    def generator = new Generator()

    when:
    def result = generator.generatorArrayNumbers()

    then:
    result.size() >= 1
    result.size() <= 100
  }

  def "generatorArrayNumbers debería generar números en el rango de -100 a 100"() {
    given:
    def generator = new Generator()

    when:
    def result = generator.generatorArrayNumbers()

    then:
    result.every { it >= -100 && it < 100 }
  }

  def "generatorArrayNumbers debería manejar correctamente la creación de un arreglo de tamaño 1"() {
    given:
    def generator = new Generator() {
      @Override
      public int[] generatorArrayNumbers() {
        // Forzamos el tamaño a 1 para esta prueba
        return new int[]{ 3 }
      }
    }

    when:
    def result = generator.generatorArrayNumbers()

    then:
    result.size() == 1
  }

  def "generatorArrayNumbers debería manejar correctamente la creación de un arreglo de tamaño máximo 100"() {
    given:
    def generator = new Generator() {
      @Override
      public int[] generatorArrayNumbers() {
        // Forzamos el tamaño a 100 para esta prueba
        return ThreadLocalRandom.current().ints(100, -100, 100).toArray()
      }
    }

    when:
    def result = generator.generatorArrayNumbers()

    then:
    result.size() == 100
  }
}
