package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class WikipediaArticle {
    public static final Target HEADING =  Target.the("article identifier").locatedBy("p.mw-search-createlink a");
}
