package retos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Clase enfocada en brindar metodos que faciliten la generación de números.
 *
 * @Author Andrés F. Ceballos. {@code @Since} 2024-09-13
 */
public class Generator {

  ////
  //// PROPIEDADES
  ////
  private static final int RANGE = 100;
  private final Random random = new Random();

  ////
  //// MÉTODOS PÚBLICOS
  ////
  /**
   * Metodo empleado para crear un array de números el cual tiene una dimensión random
   * de 1 a 100 y sus valores van desde -100 hasta 100 generados de forma aleatoria.
   * @return Array de numeros aletarios.
   */
  public int[] generatorArrayNumbers() {

    int size = random.nextInt(RANGE) + 1;

    int[] numbers = new int[size];

    for (int i = 0; i < size; i++) {
      numbers[i] = ThreadLocalRandom.current().nextInt(-RANGE, RANGE);
    }
    return numbers;
  }

}
