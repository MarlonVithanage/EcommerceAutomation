package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	 private WebDriver driver;

	    // Example locators
	 
	    public By addToCartBtn = By.xpath("//button[contains(text(),'Add to cart')]");
	    private By cartLink = By.className("shopping_cart_link");

	    public ProductPage(WebDriver driver) {
	        this.driver = driver;
	    }

	   
	    public void addFirstProductToCart() {
	        driver.findElements(addToCartBtn).get(0).click();
	    }
	    
	    public void goToCart() {
	    	driver.findElement(cartLink).click();
	    }
	    
	    public int getAddToCartButtonsCount() {
	        return driver.findElements(addToCartBtn).size();
	    }
	   
	  
}