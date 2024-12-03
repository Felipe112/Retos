package retos;

import java.math.BigInteger;
import lombok.extern.java.Log;

/**
 * Clase empleada para calcular el factorial de un número especifico.
 *
 * @author Andrés F. Ceballos.
 * @since 2024-12-02.
 */
@Log
public class Factorial {

  ////
  //// MÉTODOS PÚBLICOS
  ////

  /**
   * Metodo creado para calcular el factorial de un valor especifico.
   * @param value entero.
   * @return Calculo de la operación.
   */
  public BigInteger calculate(int value) {

    if(value<0){
      throw new IllegalArgumentException("El valor de N no puede ser negativo.");
    }

    BigInteger result = BigInteger.ONE;
    for (int i = 2; i <= value; i++) {
      result = (result.multiply(BigInteger.valueOf(i)));
    }
    return result;
  }

}
