package com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
			Thread.sleep(1000);
			//
		driver.navigate().to("https://www.facebook.com/");
		// it will navigate back
		driver.navigate().back();
		//it will navigate one step forward
		driver.navigate().forward();
		
		Thread.sleep(1000);
		driver.close();

	}

}
