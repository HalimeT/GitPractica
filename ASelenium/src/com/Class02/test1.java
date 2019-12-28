package com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Using Xpath ONLY
//TC 1: Facebook login: 
//Open chrome browser
//Go to “https://www.facebook.com/”
//Enter valid username and valid password and click login 
//User successfully logged in
public class test1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Syntaxtest@gmail");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("000000099999hujx");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	//driver.findElement(By.xpath("//a[@id='nav-recently-viewed']"));
	
	//driver.findElement(By.id("nav-recently-viewed"));
	
	//driver.findElement(By.cssSelector("a[id='nav-recently-viewed']"));

	
	boolean flag=driver.findElement(By.xpath(" //input[@type='submit']")).isDisplayed();
	if(flag) {
	System.out.println("passed");
	}else {                                
		System.out.println("failed");
	}
		driver.close();	
			}

}
