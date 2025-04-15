package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	 private WebDriver driver;

	    // Example locators
	    private By cartItem      = By.className("cart_item");
	    private By checkoutButton = By.id("checkout");

	    public CartPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public int getCartItemsCount() {
	        return driver.findElements(cartItem).size();
	    }

	    public void clickCheckout() {
	        driver.findElement(checkoutButton).click();
	    }

}

