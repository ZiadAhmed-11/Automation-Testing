package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends PageBase {
    @FindBy(className = "search-result")
    private List<WebElement> searchResults;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public int getSearchResultsCount() {
        return searchResults.size();
    }
}