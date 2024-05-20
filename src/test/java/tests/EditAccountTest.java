package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AccountPage;
import pages.EditAccountPage;
import pages.HomePage;
import pages.Login_RegisterPage;

import java.time.Duration;

public class EditAccountTest extends TestBase {
    @Test
    public void testEditAccount()
    {
        HomePage homePage =new HomePage(driver);

        homePage.clickLogo();
        homePage.clickLogin();

        Login_RegisterPage loginRegisterPage=new Login_RegisterPage(driver);

        loginRegisterPage.login("zeiad.ahmed202@gmail.com","01011022395Zz");
        AccountPage accountPage=new AccountPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn.round.small.menu[data-custom-menu-trigger='']")));

        accountPage.clickMenu();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account")));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,500)");
        accountPage.clickEditAccount();

        EditAccountPage editAccountPage=new EditAccountPage(driver);
        editAccountPage.EditFullName("Zezo","Abdelnour");
        editAccountPage.clickSaveChanges();
        js.executeScript("scrollBy(0,500)");

        Assert.assertEquals("Save Changes",editAccountPage.changeSuccess());

    }
}
