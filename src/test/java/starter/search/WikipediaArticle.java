package starter.search;


import net.serenitybdd.screenplay.targets.Target;

public class WikipediaArticle {
    public static final Target PAGE_HEADING = Target.the("Page heading")
                                                    .locatedBy("#firstHeading");
}