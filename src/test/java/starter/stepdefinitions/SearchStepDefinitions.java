package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.steps.UserSteps;

public class SearchStepDefinitions {

    @Steps
    private UserSteps userSteps;

    @Then("assert in double nested step method")
    public void assertResponseIsCustomHttpsBlockPage() {
        userSteps.assertInDoubleNestedStepMethod();
    }

}
