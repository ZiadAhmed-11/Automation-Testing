package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AuthorPage;
import pages.HomePage;

import java.time.Duration;

public class AuthorTest extends TestBase{
    @Test
    public void testAuthor() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLogo();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Scroll to the author image
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", homePage.AuthorImage);



        AuthorPage authorPage = new AuthorPage(driver);
        Assert.assertEquals("محمد طه", authorPage.showName());
    }

}
