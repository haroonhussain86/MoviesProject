package CucumberRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions (
        features={"src/test/resources/features/CheckFilmProperties.feature"},
        glue = {"StepsDefinition.CheckFilmTitleTest"}
)

public class CucumberRunner {

}

