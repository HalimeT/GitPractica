package com.class03;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import com.util.CommonMethods;
import com.util.Constants;

public class HW extends CommonMethods{
//	1: HRMS Add Employee: 
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Login into the application
//Add 5 different Employees and create login credentials by providing: 
//First Name , Last Name ,Username ,Password
//Provide Employee First and Last Name
//Verify Employee has been added successfully and take screenshot (you must have 5 different screenshots)
//Close the browser
//Specify group for this test case, add it into specific suite and execute from xml file.
	
@BeforeMethod
public void Open() throws InterruptedException {
	setUp("chrome",Constants.HRMS_URL);
//login into hrms 
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
	driver.findElement(By.id("btnLogin")).click();
//navigating to add employee section
	Thread.sleep(3000);
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
}
	@Test(dataProvider="getData")
public void login(String firstName, String lastName,String user_name,String user_password) throws InterruptedException {
	//adding employee
	driver.findElement(By.id("firstName")).sendKeys(firstName);	
    driver.findElement(By.id("lastName")).sendKeys(lastName);
    Thread.sleep(3000);
    String empId=driver.findElement(By.id("employeeId")).getAttribute("value");
    driver.findElement(By.id("chkLogin")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("user_name")).sendKeys(user_name);
    driver.findElement(By.id("user_password")).sendKeys(user_password);
    driver.findElement(By.id("re_password")).sendKeys(user_password);
    driver.findElement(By.id("btnSave")).click();
    Thread.sleep(3000);
 //  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(""))) 
  String actualEmpId=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
  Assert.assertEquals(actualEmpId,empId,"Employee ID did not match");
  
  TakesScreenshot ts=(TakesScreenshot) driver;
  File screen=ts.getScreenshotAs(OutputType.FILE);
    
	try {
		FileUtils.copyFile(screen,new File("ScreenShot/screen/"+firstName+lastName+".png"));
	} catch (IOException e) {
	
	System.out.println(e.getMessage());
	}
}
	@DataProvider
	public Object[][] getData(){
		Object[][] data= {
				{"veli","deli@","kirkdokuzG","Celii123"},
				{"Enes","Kanter","king0DiK8","Enes345O"},
				{"hakan","sukur","kral67#H","Hakan999"},
				{"ahmedo","yildizo","Cakmaso9#","Hadilano234"}
		};
		return data;
	}
}
	
	

