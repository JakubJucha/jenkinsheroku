package pl.zajecia.jankinsheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JankinsherokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(JankinsherokuApplication.class, args);
	}

	@GetMapping
	public String get(){
		return "Hello Jenkins";
	}
}
