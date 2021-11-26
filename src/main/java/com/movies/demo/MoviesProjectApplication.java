package com.movies.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@CrossOrigin
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

	@GetMapping("/actors")
	public @ResponseBody Iterable<Actor>getAllActors() {
		return ActorRepository.findAll();
	}


	@PostMapping("/add")
	public @ResponseBody String addAFilm (@RequestBody Film film  ) {
		FilmRepository.save(film);
		return "Saved new Film";

	}

	@GetMapping("/id/{id}")
	public @ResponseBody
	Optional<Film> getFilm(@PathVariable("id") int id) {
		return FilmRepository.findById(id);
	}

	@PutMapping("/id/{id}")
	public @ResponseBody String editFilm (@PathVariable("id") int id,
										  @RequestBody Film updatedFilm ) {
		Film film = FilmRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id not found"));
		film.updateWith(updatedFilm, id);
		FilmRepository.save(film);
		return "Updated film with id :" + id;

	}

	@DeleteMapping("/id/{id}")
	public @ResponseBody String deleteFilm (@PathVariable("id") int id ) {
		Film film = FilmRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id not found"));
		FilmRepository.delete(film);
		return "Deleted film with id :" + id;

	}

	@PostMapping("/addactor")
	public @ResponseBody String addAActor (@RequestParam String firstName,
										  @RequestParam String lastName ) {


		Actor savedActor = new Actor(firstName,lastName);
		ActorRepository.save(savedActor);
		return "Saved";

	}

}