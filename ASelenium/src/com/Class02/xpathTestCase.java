package com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTestCase {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");

	WebDriver	driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");

	driver.navigate().to("http://newtours.demoaut.com");
	driver.navigate().back();
	driver.navigate().to("https://www.google.com/");
	driver.navigate().forward();
	
	driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath( "//input[@name='firstName']")).sendKeys("Abuhayat");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("TMZ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("00112233");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("9495554433");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Dallas");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("tx");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("75236");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("fethullah.tmz@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("1234567890");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='register']")).click();
	boolean var=driver.findElement(By.xpath("//b[contains(text(),'Note:')]")).isDisplayed();
		if(var) {
			System.out.println("Your register is succesful");
		}else {
			System.out.println("Try again");
		}
		
		//driver.close();
		
		
		
		}	
	}


