package com.movies.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/films")
public class MoviesProjectApplication {

	@Autowired
	private FilmRepository FilmRepository;
	@Autowired
	private ActorRepository ActorRepository;

	public static void main(String[] args) {
		SpringApplication.run(MoviesProjectApplication.class, args);
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Film>getAllFilms() {
		return FilmRepository.findAll();
	}

	@GetMapping("/film/{filmId}")
	public @ResponseBody
	Optional<Film> getFilm(@PathVariable("filmId") int filmId) {
		return FilmRepository.findById(filmId);
	}

	@GetMapping("/actors")
	public @ResponseBody Iterable<Actor>getAllActors() {
		return ActorRepository.findAll();
	}

	@PostMapping("/addfilm")
	public @ResponseBody String addAFilm (@RequestParam  String title,
										  @RequestParam  int length,
										  @RequestParam  String description,
										  @RequestParam  String rating,
										  @RequestParam  int releaseYear ) {
		Film newFilm = new Film(title,length,description,rating,releaseYear);
		FilmRepository.save(newFilm);
		return "Saved";

	}
	@PostMapping("/addactor")
	public @ResponseBody String addAActor (@RequestParam String firstName,
										  @RequestParam String lastName ) {


		Actor savedActor = new Actor(firstName,lastName);
		ActorRepository.save(savedActor);
		return "Saved";

	}

}