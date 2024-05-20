package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArabicBooksPage extends PageBase{
    public ArabicBooksPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//h2[contains(text(), 'اوليفر تويست')]/ancestor::a")
    private WebElement  khbaiaBook;

    public void clickBook()
    {
        khbaiaBook.click();
    }
}
