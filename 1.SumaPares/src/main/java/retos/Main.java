package retos;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase principal del programa.
 *
 * @Author Andrés F. Ceballos.
 * @See 2024-09-12
 */
public class Main {

  ////
  //// PROPIEDADES
  ////
  private static final Logger logger = LoggerFactory.getLogger(Main.class);


  ////
  //// MÉTODOS PÚBLICOS
  ////

  /**
   * Metodo inicializador del programa.
   *
   * @param args Parametros.
   */
  public static void main(String[] args) {

    Generator genera = new Generator();

    int[] numbersRandom = genera.generatorArrayNumbers();
    String arrayString = Arrays.toString(numbersRandom);

    logger.info("Array Size:: {}", numbersRandom.length);
    logger.info("Array:: {}", arrayString);
    Sum mySum = new Sum();
    int total = mySum.sumPairs(numbersRandom);
    logger.info("Total:: {}",  total);
  }

}