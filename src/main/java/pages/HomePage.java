package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageBase {
    @FindBy(className = "custom-logo")
    private  WebElement logo;

    @FindBy(id = "search-form-1")
    private WebElement searchInput;

    @FindBy(className = "search-submit")
    private WebElement searchButton;

    @FindBy(className = "login")
    private WebElement loginbutton;

    @FindBy(id = "menu-item-306")
    private WebElement ArabicBooks;

    @FindBy(xpath = "//h5[contains(text(),'محمد طه')]")
    public WebElement AuthorImage;

    @FindBy(className = "cart")
    private WebElement cartIcon;

    public void clickLogo()
    {
        logo.click();
    }

    public void clickCartIcon()
    {
        cartIcon.click();
    }
    public void clickLogin()
    {
        loginbutton.click();
    }

    public void clickArabicBooks()
    {
        ArabicBooks.click();
    }
    @FindBy(className = "mark")
    private WebElement checkbox;

    public void checkCheckbox() {
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }



    public void search(String searchTerm) {
        searchInput.sendKeys(searchTerm);
        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
/*
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("search-submit")));
*/
/*
        searchButton.click();
*/
        searchInput.sendKeys(Keys.RETURN);
    }

    public void AuthorClick()
    {
        AuthorImage.click();
    }


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
