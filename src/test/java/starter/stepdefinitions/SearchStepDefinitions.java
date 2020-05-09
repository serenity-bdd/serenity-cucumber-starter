package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.Search;
import starter.search.WikipediaArticle;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("(s)he searches for {string}")
    public void searchesFor(String term) {
        theActorInTheSpotlight().attemptsTo(
            Search.forTerm(term)
        );
    }

    @Then("the results should be about {string}")
    public void all_the_result_titles_should_contain_the_word(String term) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(WikipediaArticle.PAGE_HEADING).text().isEqualToIgnoringCase(term)
        );
    }
}
