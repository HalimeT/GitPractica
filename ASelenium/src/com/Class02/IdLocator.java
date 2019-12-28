package com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
       WebDriver driver=new ChromeDriver();
       driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
       WebElement userName=driver.findElement(By.id("txtUsername"));//.senKey("");
       userName.sendKeys("Admin");
       driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
       driver.findElement(By.className("button")).click();
       Thread.sleep(2000);
      // driver.findElement(By.linkText("Welcome Admin")).click();
       driver.findElement(By.partialLinkText("Welcome")).click();
       Thread.sleep(2000);
       driver.findElement(By.linkText("Logout")).click();
       
       driver.close();
	}

}
