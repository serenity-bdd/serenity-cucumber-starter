package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SearchStepDefinitions {

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) throws AWTException, IOException {
        actor.attemptsTo(
                Ensure.that(TheWebPage.title()).containsIgnoringCase(term)
        );
    }

    @Given("the following books exist in the bookstore:")
    public void theFollowingBooksExistInTheBookstore() {
    }

    @When("a user searches for {string}")
    public void aUserSearchesFor(String arg0) {
    }

    @Then("they should see the following books:")
    public void theyShouldSeeTheFollowingBooks() {
    }

    @Given("the bookstore has the following books:")
    public void theBookstoreHasTheFollowingBooks() {
    }

    @Then("they should see a message {string}")
    public void theyShouldSeeAMessage(String arg0) {
    }

    @Given("Tim has the following positions at the start of the day:")
    public void timHasTheFollowingPositionsAtTheStartOfTheDay() {
    }

    @And("Tim has placed the following order:")
    public void timHasPlacedTheFollowingOrder() {
    }

    @When("the consolidated daily positions are generated")
    public void theConsolidatedDailyPositionsAreGenerated() {
    }

    @Then("Tim should see his new positions as follows:")
    public void timShouldSeeHisNewPositionsAsFollows() {
    }

    @Given("the following customers with different credit risks:")
    public void theFollowingCustomersWithDifferentCreditRisks() {
    }

    @When("the KYC risk calculator assesses the customers")
    public void theKYCRiskCalculatorAssessesTheCustomers() {
    }

    @Then("the system should assign the following KYC levels:")
    public void theSystemShouldAssignTheFollowingKYCLevels() {
    }
}
