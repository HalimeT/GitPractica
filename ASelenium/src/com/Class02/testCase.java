package com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
	       Thread.sleep(2000);

		driver.findElement(By.name("firstName")).sendKeys("fethullah");
	       Thread.sleep(2000);

		driver.findElement(By.name("lastName")).sendKeys("Temiz");
	       Thread.sleep(2000);

		driver.findElement(By.name("phone")).sendKeys("9493818438");
	       Thread.sleep(2000);

		driver.findElement(By.name("userName")).sendKeys("fetTmz");
	       Thread.sleep(2000);
        driver.findElement(By.name("address1")).sendKeys("dallas/texas");
	       Thread.sleep(2000);
        driver.findElement(By.name("city")).sendKeys("Dallas");
	       Thread.sleep(2000);
        driver.findElement(By.name("state")).sendKeys("tx");
	       Thread.sleep(2000);
        driver.findElement(By.name("postalCode")).sendKeys("75236");
		driver.findElement(By.name("email")).sendKeys("fethullah.tmz@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
		driver.findElement(By.name("register")).click();
		
		boolean flag=driver.findElement(By.xpath("//b[starts-with(text(),' Dear')]")).isDisplayed();
		if(flag) {
		System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		
         driver.close();
}
}