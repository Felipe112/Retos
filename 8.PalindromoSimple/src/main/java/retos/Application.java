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

		String text = "Anita lava la tina";

		Palindrome palindrome = new Palindrome();
		if(palindrome.isPalindrome(text)) {
			log.info(text + " :: Es palíndromo.");
		}else{
			log.info(text + " :: NO ES palíndromo.");
		}

	}

}
