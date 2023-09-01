package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchArticle {
    public static final Target BODY =  Target.the("article identifier").locatedBy("//article");
}
