package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.constants.ConstantPath;

public class DemoClassFirefox extends DemoTestBase {
	
	/*@Parameters(value={"browserName","platformName"})
	@Test
	public void demoTestFirefox(String browser, String platform){
		
		System.out.println("Demo Test has been completed : " + browser);
		System.out.println("Demo Test has been completed : " + platform);
		
		startSession(browser, ConstantPath.DEMO_URL);
	}*/
	
	
	@Test
	public void demoTestFirefox(){
		
		System.setProperty("webdriver.gecko.driver", ConstantPath.FIREFOX_EXE);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		System.out.println("Firefox Invoked");
	}
	
	
	/*public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", ConstantPath.FIREFOX_EXE);
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		System.out.println("Firefox Invoked");
	}*/

}
