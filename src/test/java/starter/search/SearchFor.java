package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.annotations.*;
import org.openqa.selenium.Keys;

public class SearchFor extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void term(String term) {
        $(SearchForm.SEARCH_FIELD).clear();
        $(SearchForm.SEARCH_FIELD).sendKeys(term, Keys.ENTER);
    }
}
