package com.movies.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int film_id;

    private String title;
    private int length;
    private String description;
    private String rating;
    private int releaseYear;


    public Film(String title, int length, String description, String rating, int releaseYear) {

        this.title = title;
        this.length = length;
        this.description = description;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public Film() {
    }

    public int getId() {
        return film_id;
    }

    public void setId(int id) {
        this.film_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public int getFilmLength() {
        return length;
    }

    public void setFilmLength(int length) {
        this.length = length;
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

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}




















