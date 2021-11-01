package com.movies.demo;

public class Actor {
    private String firstName;;
    private String lastName;
    private int actorID;


    public Actor(String firstName, String lastName,int actorID) {

        this.firstName = firstName;
        this.lastName = lastName ;
        this.actorID = actorID;

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getActorID() {
        return actorID;
    }


    public String getJsonObjectOfActor(){
        return "{"+
                "\"first name\" :\" "+ firstName + "\"," +
                "\"last name \" : \" " + lastName + "\"," +
                "\"actor ID\" :\" "+ actorID + "\"," +
                "}";
    }


}
