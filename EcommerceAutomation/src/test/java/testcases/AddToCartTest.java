package testcases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.CartPage;
import utils.BrowserSetup;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToCartTest {
	
	 private WebDriver driver;
	    private LoginPage loginPage;
	    private ProductPage productPage;
	    private CartPage cartPage;
	    
	    @BeforeEach
	    public void setUp() {
	        driver = BrowserSetup.startBrowser();
	        driver.get("https://www.saucedemo.com/");

	        loginPage = new LoginPage(driver);

	        // Login first
	        loginPage.login("standard_user", "secret_sauce");
	       
	    }
	    
	    @Test
	    public void addSingleItemToCart() {
	    	
	      productPage = new ProductPage(driver);
		      
	        // Add first product to cart
	       productPage.addFirstProductToCart();

	        // Go to cart
	       productPage.goToCart();
	       
	       cartPage = new CartPage(driver);

	        // Verify 1 item in cart
	        int itemCount = cartPage.getCartItemsCount();
	        assertEquals(1, itemCount, "Expected 1 item in cart, but found " + itemCount);
	    }
	    
	    @AfterEach
	    public void tearDown() throws InterruptedException{
	    	Thread.sleep(3000);
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	  
	  
	    
}