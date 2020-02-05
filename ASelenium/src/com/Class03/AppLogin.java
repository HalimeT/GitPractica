package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppLogin {
//	TC 1: HRMS Application Login: 
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//		Enter valid username and password
//		Click on login button
//		Then verify Syntax Logo is displayed.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
		WebDriver driver=new ChromeDriver();
	driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");

driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("sohilaryan");;
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Syntax@12");
driver.findElement(By.cssSelector("input#btnLogin")).click();
	
WebElement logo=driver.findElement(By.xpath("//a[@target='_blank']"));
logo.isDisplayed();
System.out.println(logo.isDisplayed());
	}

}
