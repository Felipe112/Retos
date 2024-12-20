package retos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal del programa.
 */
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

		Factorial factorial= new Factorial();
		var result = factorial.calculate(200);
		System.out.println(result);

	}

}
