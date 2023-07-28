package starter.stepdefinitions;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import io.cucumber.java8.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;

public class SearchStepDefinitions implements En {

    public SearchStepDefinitions() {
        Given("{actor} is researching things on the internet", (Actor actor) -> {
            actor.wasAbleTo(NavigateTo.theSearchHomePage());
        });

        When("{actor} looks up {string}", (Actor actor, String term) -> {
            actor.attemptsTo(LookForInformation.about(term));
        });

        Then("{actor} should see information about {string}", (Actor actor, String term) -> {
            actor.attemptsTo(Ensure.that(TheWebPage.title()).containsIgnoringCase(term));
        });
    }
}
