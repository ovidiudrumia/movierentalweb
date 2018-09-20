package com.axp.movierentalweb;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class MoviesController {
    private MovieRepository repository;

    public MoviesController(MovieRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/movies")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Movie> movies() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}
