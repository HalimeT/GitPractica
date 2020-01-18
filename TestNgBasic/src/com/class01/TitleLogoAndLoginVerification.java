package com.class01;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.util.CommonMethods;
import com.util.Constants;

public class TitleLogoAndLoginVerification extends CommonMethods {
	
@BeforeMethod
public void openAndNavigate() {
	setUp("chrome",Constants.HRMS_URL);
	
}
@AfterMethod
public void closeBrowser() {
	driver.quit();
}
@Test
public void titleVAlidation() {
	String expectedTitle="Human Management System";
	String actualTitle=driver.getTitle();
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("test pass");
	}else {
		System.out.println("test fail");
	}
}
@Test
public void LogoValidation() {
	boolean isDisplayed=driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
	if(isDisplayed)	{
		System.out.println("pass");
	}else {
		System.out.println("fails");
	}
}
@Test
public void validLogin() {
	String userName="Admin";
	String passWord="Hum@nhrm123";
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
	driver.findElement(By.id("txtPassword")).sendKeys(passWord);
	driver.findElement(By.id("btnLogin")).click();
	// verify emplooyee is logged in
	String uid=driver.findElement(By.id("welcome")).getText();
	if(uid.contains(userName)) {
		System.out.println("User "+userName+ " is logged in");
	}else {
		System.out.println("User "+userName+ "is NOT logged in");
	}
}
}
