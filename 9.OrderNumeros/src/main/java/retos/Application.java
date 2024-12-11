package retos;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal del programa.
 */
@Log
@SpringBootApplication
public class Application {

	////
	//// MÉTODOS PÚBLICOS
	////

	/**
	 * Inicialización del sistema.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Arreglo array = new Arreglo();
		int[] generated = array.randomGenerator(10);
		array.print(generated);
		int[] result =  array.order(generated);
		array.print(result);

	}

}
