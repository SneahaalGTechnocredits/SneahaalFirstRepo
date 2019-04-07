package com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.constants.ConstantPath;

public class DemoClassChrome extends DemoTestBase{

	@Parameters(value={"browserName","platformName"})
	@Test
	public void demoTestChrome(String browser, String platform){
		
		System.out.println("Demo Test has been completed : " + browser);
		System.out.println("Demo Test has been completed : " + platform);
		
		startSession(browser, ConstantPath.DEMO_URL);
		
	}
}
