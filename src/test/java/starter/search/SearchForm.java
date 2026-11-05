package starter.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

class SearchForm {
    static Target SEARCH_FIELD = Target.the("search field").located(By.cssSelector("textarea[name='q']"));
}
