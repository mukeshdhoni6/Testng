package com.testng.TestNG;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class RunnerClass extends BaseClass{
	

	
	
	@BeforeSuite
	private void driverlaunch() {
		getDriver("chrome");
	}
	
    @BeforeMethod
	private void urllaunch() {
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicitWait(1000);
	}

	@Test
	private void login() {
		inputToElement(PageObjectManager.getPom().getLp().getUsername(), "Admin");
		inputToElement(PageObjectManager.getPom().getLp().getPassword(), "admin123");
		clickOnElement(PageObjectManager.getPom().getLp().getLoginbtn());
		// implicitWait(5000);
	}
	@Test(dependsOnMethods ="login")
	public void pim() {
		clickOnElement(PageObjectManager.getPom().getPim().getPim());
		//implicitWait(1000);
		clickOnElement(PageObjectManager.getPom().getPim().getAddemp());
		//implicitWait(1000);
		inputToElement(PageObjectManager.getPom().getPim().getFirstname(), "Mukesh");
		inputToElement(PageObjectManager.getPom().getPim().getMiddlename(), "Kamesh");
		inputToElement(PageObjectManager.getPom().getPim().getLastname(), "S");
		clickOnElement(PageObjectManager.getPom().getPim().getEmpId());
		Backspace(PageObjectManager.getPom().getPim().getEmpId());
		Backspace(PageObjectManager.getPom().getPim().getEmpId());
		Backspace(PageObjectManager.getPom().getPim().getEmpId());
		Backspace(PageObjectManager.getPom().getPim().getEmpId());
		
		inputToElement(PageObjectManager.getPom().getPim().getEmpId(), "1234");
		clickOnElement(PageObjectManager.getPom().getPim().getCreatelogindetails());
		inputToElement(PageObjectManager.getPom().getPim().getUsername(), "Smukesh");
		inputToElement(PageObjectManager.getPom().getPim().getPassword(),"Smukesh@12");
		inputToElement(PageObjectManager.getPom().getPim().getConfirmpass(),"Smukesh@12");
		clickOnElement(PageObjectManager.getPom().getPim().getSavebtn());
		implicitWait(2000); 
		try { 
			screenshot("Employee ID creation"); 
		} catch
		(IOException e) { e.printStackTrace(); } }

	private void Backspace(WebElement empId) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	/*
	 * @Test(dependsOnMethods = "pim") private void leave() {
	 * clickonElement(PageObjectManager.getPom().getLe().getLeave());
	 * clickonElement(PageObjectManager.getPom().getLe().getAssignleave());
	 * inputToElement(PageObjectManager.getPom().getLe().getEmpname(), "h");
	 * implicitWait(2000);
	 * dropdownForSelect(PageObjectManager.getPom().getLe().getEmpname(),
	 * "value","Hey you bro");
	 * clickonElement(PageObjectManager.getPom().getLe().getLeavetype());
	 * dropdownForSelect(PageObjectManager.getPom().getLe().getLeavetype(),
	 * "index","4");
	 * 
	 * }
	 */

}



	

   
     


		

	 


		
		
		


		
	


