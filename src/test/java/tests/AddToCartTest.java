package tests;

/*
import org.junit.Assert;
*/
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.AnyBookPage;
import pages.ArabicBooksPage;
import pages.HomePage;

import java.time.Duration;

public class AddToCartTest extends TestBase{
    @Test
    public void testAddToCart()
    {
        HomePage homePage=new HomePage(driver);
        homePage.clickLogo();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-306")));
        homePage.clickArabicBooks();
        ArabicBooksPage arabicBooksPage=new ArabicBooksPage(driver);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1000)");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'اوليفر تويست')]/ancestor::a") ));
        arabicBooksPage.clickBook();
        AnyBookPage anyBookPage=new AnyBookPage(driver);
        anyBookPage.AddToCart("2");
        String actualMessage=anyBookPage.getMessageText();
        String expectedMessage = "View Cart\n" +
                "2 × “اوليفر تويست” have been added to your cart.";
        Assert.assertEquals(expectedMessage,actualMessage);

    }
}
