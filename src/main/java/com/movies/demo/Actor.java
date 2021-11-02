package com.movies.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String firstName;;
    private String lastName;
    private int actorID;


    public Actor(String firstName, String lastName,int actorID) {

        this.firstName = firstName;
        this.lastName = lastName ;
        this.actorID = actorID;

    }

    public Actor(){}

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getActorID() {
        return actorID;
    }


   /// public String getJsonObjectOfActor(){
     ///   return "{"+
       ///         "\"first name\" :\" "+ firstName + "\"," +
        ///        "\"last name \" : \" " + lastName + "\"," +
        ///        "\"actor ID\" :\" "+ actorID + "\"," +
        //        "}";
   // }


}
