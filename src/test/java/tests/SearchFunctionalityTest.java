package tests;


import dev.failsafe.Execution;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.SearchResultsPage;

import java.time.Duration;

public class SearchFunctionalityTest extends TestBase {
    @Test
    public void testSearchFunctionality() {
        // Initialize Page Objects
        HomePage homePage = new HomePage(driver);
        homePage.clickLogo();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        homePage.search("messi");

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        Assert.assertTrue( "Search results are not displayed.",searchResultsPage.getSearchResultsCount() == 10);
    }
}
