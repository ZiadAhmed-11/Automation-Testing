package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage extends PageBase{
    public AccountPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(className = "entry-title")
    public WebElement MyAccount;

    @FindBy(css = "a.btn.round.small.menu[data-custom-menu-trigger='']")
    private WebElement Menu;

    @FindBy(linkText = "My Account")
    private WebElement EditMyAccount;

    public void clickMenu()
    {
        Menu.click();

    }
    public void clickEditAccount()
    {
        EditMyAccount.click();
    }
}
