package starter.navigation;

import net.serenitybdd.annotations.*;

public class NavigateTo {

    WikipediaHomePage homePage;

    @Step("Open the Wikipedia home page")
    public void theHomePage() {
        homePage.open();
    }
}