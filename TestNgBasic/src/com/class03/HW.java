package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
public void Open() {
	setUp("chrome",Constants.HRMS_URL);

	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
}
	@Test(dataProvider="getData")
public void login(String firstName, String lastName,String user_name,String user_password) {
	driver.findElement(By.id("firstName")).sendKeys(firstName);	
    driver.findElement(By.id("lastName")).sendKeys(lastName);
    driver.findElement(By.id("user_name")).sendKeys(user_name);
    driver.findElement(By.id("user_password")).sendKeys(user_password);
}
	@DataProvider
	public Object[][] getData(){
		Object[][] data= {
				{"veli","deli","kirkdokuz","velii123"},
				{"Enes","Kanter","king","enes345"},
				{"hakan","sukur","kral","hakan999"},
				{"ahmedo","yildizo","cakmaso","hadilano234"}
		};
		return data;
	}
}
	
	

