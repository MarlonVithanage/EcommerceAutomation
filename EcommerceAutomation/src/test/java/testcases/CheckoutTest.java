package testcases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.CartPage;
import utils.BrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutTest {
	
	  private WebDriver driver;
	  private LoginPage loginPage;
	  private ProductPage productPage;
	  private CartPage cartPage;
	  
	  @BeforeEach
	    public void setUp() {
	        driver = BrowserSetup.startBrowser();
	        driver.get("https://www.saucedemo.com/");

	        loginPage = new LoginPage(driver);
	        productPage = new ProductPage(driver);
	        cartPage = new CartPage(driver);

	        // Login first
	        loginPage.login("standard_user", "secret_sauce");
	  }
	  
	  @Test
	  public void checkoutOneItem() throws InterruptedException{
	        // Add first product
	        productPage.addFirstProductToCart();

	        // Go to cart
	        productPage.goToCart();
	        cartPage.clickCheckout();
	        
	        // Fill Checkout Info
	        driver.findElement(By.id("first-name")).sendKeys("Marlon");
	        driver.findElement(By.id("last-name")).sendKeys("Vithanage");
	        driver.findElement(By.id("postal-code")).sendKeys("11850");
	        driver.findElement(By.id("continue")).click();
	        
	        Thread.sleep(2000);

	        // Finalize
	        driver.findElement(By.id("finish")).click();

	        // Verify success
	        String currentUrl = driver.getCurrentUrl();
	        assertTrue(currentUrl.contains("checkout-complete"),
	            "Expected to land on 'checkout-complete' page, but got: " + currentUrl);
	    }
	  
	  @AfterEach
	    public void tearDown() throws InterruptedException {
		  Thread.sleep(2000);
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}