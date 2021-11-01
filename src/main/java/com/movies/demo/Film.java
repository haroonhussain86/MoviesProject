package com.movies.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String title;
    private int filmLength;
    private String description;
    private String rating;
    private int releaseYear;


    public Film(String title, int filmLength, String description, String rating, int releaseYear) {

        this.title = title;
        this.filmLength = filmLength;
        this.description = description;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public Film(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public int getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(int filmLength) {
        this.filmLength = filmLength;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void  setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }



    //public String getJsonObjectOfFilm(){
        //return "{"+
              //  "\"title\" :\" "+ title + "\"," +
             //   "\"film length\" : \" " + filmLength + "\"," +
              //  "\"description\" :\" "+ description + "\"," +
              //  "\"rating\" :\" "+ rating + "\"," +
              //  "\"release year\" :\" "+ releaseYear + "\"," +
              //  "}";
    }





















