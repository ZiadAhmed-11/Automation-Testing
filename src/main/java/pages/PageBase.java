package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class PageBase {
    public WebDriver driver;
    public Select select;
    public Actions actions;
    WebDriverWait wait;
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);    }
}
