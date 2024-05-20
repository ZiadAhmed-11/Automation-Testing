package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public static void openUrl() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://diwanegypt.com/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeUrl() {
        driver.quit();
    }


}
