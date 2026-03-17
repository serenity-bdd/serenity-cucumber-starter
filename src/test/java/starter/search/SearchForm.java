package starter.search;

import net.serenitybdd.screenplay.targets.Target;

class SearchForm {
    static Target SEARCH_FIELD = Target.the("search field").locatedBy("[data-ssg-id='ai-searchbox-input']");

}
