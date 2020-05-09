package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;

import static org.assertj.core.api.Assertions.assertThat;
import static starter.matchers.TextMatcher.textOf;

public class SearchStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Given("^(?:.*) is researching things on the internet$")
    public void researchingThings() {
        navigateTo.theWikipediaHomePage();
    }

    @When("(s)he searches for {string}")
    public void searchesFor(String term) {
        searchFor.term(term);
    }

    @Then("the results should be about {string}")
    public void all_the_result_titles_should_contain_the_word(String term) {
        assertThat(searchResult.heading()).isEqualToIgnoringCase(term);
    }
}
