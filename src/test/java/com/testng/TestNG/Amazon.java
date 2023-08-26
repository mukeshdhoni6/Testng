package com.testng.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\user\\cucumber-workspace\\TestNG\\chrome\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Iphone12");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> iphone_price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(int i=0;i<iphone_price.size();i++) {
			String text = iphone_price.get(i).getText();
			System.out.println(text);
			
		}
		
		
	}

}
