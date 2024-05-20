package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorPage extends PageBase{

    public AuthorPage(WebDriver drive)
    {
        super(drive);
    }

    @FindBy(xpath = "//h5[contains(text(), 'محمد طه')]")
    private WebElement authorName;

    public String showName()
    {
        return authorName.getText();
    }

}
