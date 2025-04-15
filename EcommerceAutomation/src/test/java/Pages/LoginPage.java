package Pages;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	 private WebDriver driver;
	    
	    // Locators
	    private By usernameField = By.id("user-name");
	    private By passwordField = By.id("password");
	    private By loginButton   = By.id("login-button");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }
	
	    public void login(String username, String password) {
	        driver.findElement(usernameField).clear();
	        driver.findElement(usernameField).sendKeys(username);
	        driver.findElement(passwordField).clear();
	        driver.findElement(passwordField).sendKeys(password);
	        driver.findElement(loginButton).click();
	    }
}

