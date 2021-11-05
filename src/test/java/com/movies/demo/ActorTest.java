package com.movies.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ActorTest {

	@Test
	public void testGetFirstName() {
		// create variables used to define out actor properties
		String actorFirstName = "Martin";
		String actorLastName = "Lawrence";
		int actorActorID = 12;
		// initialise test actor variable as actor class and create new actor with defined properties
		Actor testActor = new Actor(actorFirstName, actorLastName, actorActorID);
		Assertions.assertEquals(actorFirstName, testActor.getFirstName(), "incorrect first name ");

	}
	@Test
	public void testGetLastName() {
		// create variables used to define out actor properties
		String actorFirstName = "Martin";
		String actorLastName = "Lawrence";
		int actorActorID = 12;
		// initialise test actor variable as actor class and create new actor with defined properties
		Actor testActor = new Actor(actorFirstName, actorLastName, actorActorID);
		Assertions.assertEquals(actorLastName, testActor.getLastName(), "incorrect last name ");

	}
	@Test
	public void testGetActorID() {
		// create variables used to define out actor properties
		String actorFirstName = "Martin";
		String actorLastName = "Lawrence";
		int actorActorID = 12;
		// initialise test actor variable as actor class and create new actor with defined properties
		Actor testActor = new Actor(actorFirstName, actorLastName, actorActorID);
		Assertions.assertEquals(actorActorID, testActor.getActorID(), "Actor ID was incorrect ");

	}


	}
