package com;

import org.openqa.selenium.WebDriver;

import com.base.PredefinedActions;

public class DemoTestBase {
	
	private WebDriver driver;
	
	protected void startSession(String browserType, String url){
		
		driver = PredefinedActions.openBrowser(browserType, url); 
		
	}
	
	

}
