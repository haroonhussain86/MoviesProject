package StepsDefinition;

import com.movies.demo.Film;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class CheckFilmTitleTest {

    Film BadBoys = new Film(2,"Bad Boys",100 , "", "", 200);

    private String filmTitle;
    private int filmLength;
    private String description;
    private String rating;
    private int releaseYear;
    private String actualFilmTitle;

    @Given("Set The Film Title To Bad Boys")
    public void setTheFilmTitleToBadBoys() {
        filmTitle = "Bad Boys";
    }

    @When("Check The Film Title Is Bad Boys")
    public void checkTheFilmTitleIsBadBoys() {
        actualFilmTitle = BadBoys.getTitle();
    }

    @Then("It should return {string}")
    public void itShouldReturn(String arg0) {
            assertEquals(filmTitle, actualFilmTitle);
    }
}

