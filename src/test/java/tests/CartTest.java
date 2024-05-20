package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.HomePage;

import java.time.Duration;

public class CartTest extends TestBase{
    @Test
    public void testCart()
    {
        HomePage homePage=new HomePage(driver);
        homePage.clickLogo();
        homePage.clickCartIcon();
        CartPage cartPage=new CartPage(driver);
        Assert.assertEquals("Cart",cartPage.showCartHeader());
    }
}
