package com.class02;

import com.util.CommonMethods;
	import org.testng.annotations.BeforeMethod;
	import com.util.CommonMethods;
	import com.util.Constants;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
    import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

public class Assert extends CommonMethods {
//	Open chrome browser
//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//	Enter valid username and password
//	Click on login button
//	Then verify Syntax Logo is displayed
//	Close the browser	
		
//	C 2: HRMS Application Negative Login: 
//	Open chrome browser
//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//	Enter valid username
//	Leave password field empty
//	Verify error message with text “Password cannot be empty” is displayed	

		@BeforeMethod
	    public void open() {
	        setUp("chrome", Constants.HRMS_URL);
	    }
	    @AfterMethod
	    public void close() {
	        driver.close();
	    }
	    @Test(priority=2, dependsOnMethods= {"validationOfMessage"}, enabled=false)
	    public void validationOfLogo() {
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("Syntax@123");
	        driver.findElement(By.id("btnLogin")).click();
	       boolean isTrue = driver.findElement(By.xpath("//img[contains(@src,'syntax.png')]")).isDisplayed();
	     //  Assert.assertTrue(
	       //	        if (isTrue) {
//	            System.out.println("Logo is dislayed");
//	        } else {
//	            System.out.println("Logo is NOT displayed");
	    }
	    @Test(priority=1)
	    public void validationOfMessage() {
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("btnLogin")).click();
	        WebElement error = driver.findElement(By.id("spanMessage"));
	        String expectedError="Password canno be empty";
	        if (error.isDisplayed()) {
	            System.out.println("error is dislayed");
	            if(error.getText().equals(expectedError)) {
	                System.out.println("Erorr msg is correct. Test Pass");
	            }else {
	                System.out.println("Erorr msg is not correct. Test Fail");
	            }
	        } else {
	            System.out.println("error is NOT displayed. Test Fail");
	        }
	    }
	}

	
	
	
	

