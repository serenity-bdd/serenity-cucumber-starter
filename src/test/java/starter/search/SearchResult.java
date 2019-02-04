package starter.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.List;

public class SearchResult {
    public static Question<List<String>> titles() {
        return actor -> TextContent.of(SearchResultList.RESULT_TITLES).viewedBy(actor).asList();
    }
}
