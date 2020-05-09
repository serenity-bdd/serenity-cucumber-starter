package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    WikipediaHomePage searchPage;

    @Step("Open Wikipedia")
    public void theWikipediaHomePage() {
        searchPage.open();
    }
}
