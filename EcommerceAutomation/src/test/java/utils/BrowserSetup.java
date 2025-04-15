package utils;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserSetup {

	 public static WebDriver startBrowser() {
		 
		 ChromeOptions options = new ChromeOptions();
		   
	        options.addArguments("--disable-save-password-bubble");
	        
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        return driver;
	    }
}

