package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class SearchResult extends UIInteractionSteps {

    public String heading() {
        return $(WikipediaArticle.PAGE_HEADING).getText();
    }
}
