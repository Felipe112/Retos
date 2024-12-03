package retos;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Fibonacci fibo = new Fibonacci();
		List<Long> result = fibo.generate(200);
		System.out.println(result);

	}

}
