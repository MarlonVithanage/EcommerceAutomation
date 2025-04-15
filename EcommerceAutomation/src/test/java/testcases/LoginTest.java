package testcases;

import org.junit.jupiter.api.AfterEach; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;
import Pages.LoginPage;
import utils.BrowserSetup;

public class LoginTest {
	 private WebDriver driver;
	    private LoginPage loginPage;

	    @BeforeEach
	    public void setUp() {
	        driver = BrowserSetup.startBrowser();
	        driver.get("https://www.saucedemo.com/");
	        loginPage = new LoginPage(driver);
	    }

	    @Test
	    public void validLogin() {
	        loginPage.login("standard_user", "secret_sauce");
	        
	        // Verify that we are on the inventory page:
	        String currentUrl = driver.getCurrentUrl();
	        assertTrue(currentUrl.contains("inventory"),
	           "Expected URL to contain 'inventory' but got: " + currentUrl);
	    }

	    @AfterEach
	    public void tearDown() throws InterruptedException {
	    	Thread.sleep(3000);
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
