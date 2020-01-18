package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.util.CommonMethods;
import com.util.Constants;
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Login into the application
//Click on Add Employee
//Verify labels: Full Name, Employee Id, Photograph are displayed
//Provide Employee First and Last Name
//Verify Employee has been added successfully
//Close the browser
public class Task extends CommonMethods {
	@BeforeMethod 
	public void open () {
		setUp("chrome",Constants.HRMS_URL);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
	    driver.findElement(By.id("btnLogin")).click();
	
	 driver.findElement(By.linkText("PIM")).click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Employee")));
	driver.findElement(By.linkText("Add Employee")).click();	
		
	}
	@Test
	public void verifyLabel() throws InterruptedException {
		
		boolean fullnameDisplay=driver.findElement(By.xpath("//label[text()='Full Name']")).isDisplayed();
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(fullnameDisplay, "full name is NOT displayed");
		boolean EmplooyeeID=driver.findElement(By.xpath("//label[text()='Employee Id']")).isDisplayed();
		softAssert.assertTrue(EmplooyeeID, "EmplooyeeID is NOT displayed");
		boolean Photograph=driver.findElement(By.xpath("//label[text()='Photograph']")).isDisplayed();
		softAssert.assertTrue(Photograph,"Photograph is NOT displayed" );
		
		driver.findElement(By.id("firstName")).sendKeys("Yusuflara");
		driver.findElement(By.id("lastName")).sendKeys("SelamOlsun");
		Thread.sleep(3000);
	//	driver.findElement(By.id("photofile")).sendKeys("/Users/⁨betul/hello.txt");
	//	Thread.sleep(3000);
	    driver.findElement(By.id("btnSave")).click();
	    
	 boolean verification=driver.findElement(By.xpath("//h1[text()='Personal Details']")).isDisplayed();
	    softAssert.assertTrue(verification, "employee was Not added");
	    softAssert.assertAll();
	}	
	@AfterMethod
	public void tearDown() {
	//	driver.close();
	}
		
}
