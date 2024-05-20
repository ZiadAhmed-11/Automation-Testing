package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_RegisterPage extends PageBase{
    public Login_RegisterPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(css = ".login input[name='username']")
    private WebElement login_UsernameInput;

    @FindBy(css = ".login input[name='password']")
    private WebElement login_passwordInput;

    @FindBy(css = "button[name='login']")
    private WebElement loginButton;

    public void login(String username,String password)
    {
        login_UsernameInput.sendKeys(username);
        login_passwordInput.sendKeys(password);
        loginButton.click();
    }
}
