package com.movies.demo;


import javax.persistence.*;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actor_id;

    private String firstName;;
    private String lastName;


    public Actor(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName ;
    }

    public Actor(){}

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getActorID() {
        return actor_id;
    }




}
