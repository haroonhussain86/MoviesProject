package com.movies.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface FilmRepository extends CrudRepository <Film, Integer> {

    List<Film> findByName(String name);
}
