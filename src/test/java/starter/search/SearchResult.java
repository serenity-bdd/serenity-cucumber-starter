package starter.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResult extends UIInteractionSteps {
    public List<String> titles() {
        return findAll(SearchResultList.RESULT_TITLES)
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }
}
