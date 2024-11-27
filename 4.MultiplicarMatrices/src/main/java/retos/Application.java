package retos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Matriz newMatrix = new Matriz();
		int[][] product1 = newMatrix.randomGenerator(2,2);
		int[][] product2 = newMatrix.randomGenerator(2,2);
		var result = newMatrix.multiply(product1,product2);
		newMatrix.print(result);
	}

}

