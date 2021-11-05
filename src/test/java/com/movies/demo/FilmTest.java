package com.movies.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmTest {

    @Test
    public void testGetTitle() {
        // create variables used to define out film properties
        String FilmTitle = "bad boys";
        int filmLength = 100;
        String description = "A walk in the park";
        String rating = "PG";
        int releaseYear = 2007;
        // initialise test film variable as film class and create new film with defined properties
        Film testFilm = new Film(FilmTitle, filmLength, description, rating, releaseYear);
        assertEquals("it was not the same title", FilmTitle, testFilm.getTitle());


    }

    @Test
    public void testGetFilmLength() {
        // create variables used to define out film properties
        String FilmTitle = "bad boys";
        int filmLength = 100;
        String description = "A walk in the park";
        String rating = "PG";
        int releaseYear = 2007;
        // initialise test film variable as film class and create new film with defined properties
        Film testFilm = new Film(FilmTitle, filmLength, description, rating, releaseYear);
        assertEquals("it was not the same length", filmLength, testFilm.getFilmLength());

    }
    @Test
    public void testGetDescription() {
        // create variables used to define out film properties
        String FilmTitle = "bad boys";
        int filmLength = 100;
        String description = "A walk in the park";
        String rating = "PG";
        int releaseYear = 2007;
        // initialise test film variable as film class and create new film with defined properties
        Film testFilm = new Film(FilmTitle, filmLength, description, rating, releaseYear);
        assertEquals("it was not the same description", description, testFilm.getDescription());

    }
    @Test
    public void testRating() {
        // create variables used to define out film properties
        String FilmTitle = "bad boys";
        int filmLength = 100;
        String description = "A walk in the park";
        String rating = "PG";
        int releaseYear = 2007;
        // initialise test film variable as film class and create new film with defined properties
        Film testFilm = new Film(FilmTitle, filmLength, description, rating, releaseYear);
        assertEquals("it was not the same rating", rating, testFilm.getRating());

    }
    @Test
    public void testReleaseYear() {
        // create variables used to define out film properties
        String FilmTitle = "bad boys";
        int filmLength = 100;
        String description = "A walk in the park";
        String rating = "PG";
        int releaseYear = 2007;
        // initialise test film variable as film class and create new film with defined properties
        Film testFilm = new Film(FilmTitle, filmLength, description, rating, releaseYear);
        assertEquals("it was not the same year that it was released", releaseYear, testFilm.getReleaseYear());

    }

    }
