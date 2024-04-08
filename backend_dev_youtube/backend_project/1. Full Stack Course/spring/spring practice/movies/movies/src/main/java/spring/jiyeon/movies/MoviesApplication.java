package spring.jiyeon.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot() {
		return "Hello, World!";
	}

	@GetMapping("/root")
	public String apiapi() {
		return "Hello, world!!!!";
	}

}
