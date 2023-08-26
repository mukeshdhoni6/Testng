package com.testng.TestNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("set property");
		
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("launch the browser");
	}
	
	@BeforeClass
	private void launchUrl() {
        System.out.println("launch the url"); 
	}

	
	
	@BeforeMethod
	private void signIn() {
        System.out.println("signin"); 
	}
	
	@Test
	private void women() {
        System.out.println("women"); 
	}
	
	@Test
	private void dresses() {
        System.out.println("dresses");
	}
	
	@Test
	private void tshirts() {
        System.out.println("tshirts");
	}
	
	@AfterMethod
	private void signOff() {
        System.out.println("signoff");
	}
	
	@AfterClass
	private void homePage() {
        System.out.println("homepage");
	}
	
	@AfterTest
	private void close() {
		System.out.println("close");
	}
	
	@AfterSuite
	private void deleteAllCookies() {
		System.out.println("delete all cookies");

	}
	
}
	
         
	

