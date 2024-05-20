package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends PageBase {
    public EditAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "account_first_name")
    private WebElement firstName;

    @FindBy(id = "account_last_name")
    private WebElement lastName;

    @FindBy(name = "save_account_details")
    private WebElement saveChangesButton;

    @FindBy(name = "save_account_details")
    private WebElement changeMessage;

    public void EditFullName(String fname, String lname) {
        firstName.clear();
        firstName.sendKeys(fname);
        lastName.clear();
        lastName.sendKeys(lname);
    }

    public void clickSaveChanges() {
        if (driver != null) {
            saveChangesButton.click();
        } else {
            System.out.println("WebDriver instance is null!");
        }
    }

    public String changeSuccess() {
        return changeMessage.getText();
    }
}
