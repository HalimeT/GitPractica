package com.Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testFacenook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
	
	}
}

