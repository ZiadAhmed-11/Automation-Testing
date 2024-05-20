package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnyBookPage extends PageBase {
    public AnyBookPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(className = "qty")
    private WebElement quantity;

    @FindBy(className = "single_add_to_cart_button")
    public WebElement addToCart;

    @FindBy(xpath = "//div[@class='woocommerce-message']")
    public WebElement successAlert;

    public void AddToCart(String Quantity)
    {
        quantity.clear();
        quantity.sendKeys(Quantity);
        addToCart.click();
    }
    public String getMessageText()
    {
        return successAlert.getText();
    }
}
