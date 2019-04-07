package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.constants.ConstantPath;

abstract public class PredefinedActions {
	
	public static WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver, 3);
	
	public static WebDriver openBrowser(String browserType, String url){
		
		if (browserType.equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver", ConstantPath.CHROME_EXE);
			driver = new ChromeDriver();
		}
		else if (browserType.equalsIgnoreCase("FIREFOX")){
			System.setProperty("webdriver.gecko.driver", ConstantPath.FIREFOX_EXE);
			driver = new FirefoxDriver();
		}
		//driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}

}
