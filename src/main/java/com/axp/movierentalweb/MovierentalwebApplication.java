package com.axp.movierentalweb;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class MovierentalwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovierentalwebApplication.class, args);
	}

	@Bean
	ApplicationRunner init(MovieRepository repository) {
		return args -> {
			Stream.of("101 Dalmatians", "Avengers", "Pinocchio", "Lion King", "One Flew Over the Cuckoo's nest",
					"Deadpool", "Casablanca", "Schindler's List", "The Godfather").forEach(name -> {
				Movie movie = new Movie();
				movie.setName(name);
				repository.save(movie);
			});
		};
	}
}
