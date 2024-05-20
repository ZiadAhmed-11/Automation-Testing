package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AccountPage;
import pages.HomePage;
import pages.Login_RegisterPage;

import java.time.Duration;

public class LoginTest extends TestBase{
    @Test
    public void testLogin()
    {
        HomePage homePage =new HomePage(driver);
        homePage.clickLogo();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        homePage.clickLogin();

        Login_RegisterPage loginRegisterPage=new Login_RegisterPage(driver);

        loginRegisterPage.login("zeiad.ahmed202@gmail.com","01011022395Zz");

        AccountPage accountPage=new AccountPage(driver);

        Assert.assertEquals(accountPage.MyAccount.getText(),"My account");
    }
}
