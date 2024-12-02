package retos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Arreglo newArray = new Arreglo();
		int[] arrayGenerated = newArray.randomGenerator(15);
		newArray.print(arrayGenerated);
		var result = newArray.correctArray(arrayGenerated);
		newArray.print(result);

	}

}
