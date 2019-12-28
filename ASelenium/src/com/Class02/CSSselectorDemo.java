package com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("sohilaryan");
		
		
		driver.close();
		           //  shortcuts of CSS
		 //for Id                    for className
		// tagName#value             tagName.value
		
		
		
	}

}
