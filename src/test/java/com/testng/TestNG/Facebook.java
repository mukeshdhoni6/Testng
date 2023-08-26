package com.testng.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook extends BaseClass{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void login() {
		driver = new ChromeDriver();
		
	}
	
	@Test(priority=1)
	 public void facebookLogin() {
		
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 System.out.println("Login");

	}
	
		
		

	

}
