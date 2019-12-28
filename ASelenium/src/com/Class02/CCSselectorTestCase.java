package com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CCSselectorTestCase {

	public static void main(String[] args) {
     System.setProperty("webdriver.gecko.driver","drivers/geckodriver" );	
     WebDriver driver=new FirefoxDriver();	
   driver.get("http://newtours.demoaut.com");
   driver.findElement(By.cssSelector("td[class='mouseOut']")).click();
   driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("fethullah.tmz@gmail.com");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234567890");
	driver.findElement(By.cssSelector("input[name='Login']")).click();	
	
		
		
		
	}

}
