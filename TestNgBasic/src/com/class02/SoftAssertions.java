package com.class02;

import com.util.CommonMethods;
import com.util.Constants;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/*
 * open application 
 * verify logo displayed
 * eneter valid credentials
 * verify user successfully logged in 
 */
public class SoftAssertions extends CommonMethods {
  
	@BeforeMethod 
	public void open () {
		setUp("chrome",Constants.HRMS_URL);
	}
	@Test
	public void logoAndLOgin() {
        boolean logoDisplayed = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed(); 	
      //Hard Assert will fail and execution will stop at that point 
      //  Assert.assertTrue(isDisplayed, "Logo is NOT displayed");
        logoDisplayed=false; 
        
        SoftAssert softAssert=new SoftAssert();
      softAssert.assertTrue(logoDisplayed, "Logo is NOT displayed");
        
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("Syntax@123");
        driver.findElement(By.name("Submit")).click();
       
        boolean welcomeDisplayed=driver.findElement(By.id("welcome")).isDisplayed();
       // Assert.assertTrue(welcomeDisplayed);
        softAssert.assertTrue(welcomeDisplayed,"Welcome element is NOT displayed");
        softAssert.assertAll();
	}	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
