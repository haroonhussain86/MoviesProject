package com.movies.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
@RestController
@RequestMapping("/films")
public class MoviesProjectApplication {

	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(MoviesProjectApplication.class, args);
	}

	@GetMapping("/all")
	public @ResponseBody Iterable <Film> getAllUsers() {
		return filmRepository.findAll();
	}

	@PostMapping("/addfilm")
	public @ResponseBody String addAFilm (@RequestParam String title,
										  @RequestParam int filmLength ,
										  @RequestParam String description,
										  @RequestParam String rating,
										  @RequestParam int releaseYear ) {


		Film savedFilm = new Film(title,filmLength,description,rating,releaseYear);
		filmRepository.save(savedFilm);
		return "Saved";

	}

}