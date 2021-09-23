package com.pruthvi.Arisb2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG02 {

public WebDriver myD;
	
	@Test
	public void TS001() throws InterruptedException
	{
		System.out.println("Opening Browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\chromedriver.exe");
		myD=new ChromeDriver();
		myD.get("https://www.google.com/");
		String vTitle=myD.getTitle();
		System.out.println("The Title is "+vTitle);
		Thread.sleep(5000);
		myD.close();
	}
	
	@BeforeTest
	public void openBrowser()
	{
	System.out.println("Before Test");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("After Test");	
	}

}
