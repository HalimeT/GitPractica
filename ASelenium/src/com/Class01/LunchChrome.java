package com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChrome {

	public static void main(String[] args) throws InterruptedException {
		//System is a class .       setPropery(); is a static method
		                          // Key                   value
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		//http---->>hypertext transfer protocol
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		//it will navigate to a given url
		driver.navigate().to("https://www.facebook.com/");
		// it will navigate back
		driver.navigate().back();
		//it will navigate one step forward
		driver.navigate().forward();
		String actualTitle=driver.getTitle();
	  System.out.println(actualTitle);
		Thread.sleep(1000);
		driver.close();

	}

}
