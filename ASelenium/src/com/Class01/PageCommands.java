package com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		final String expecedTitle="Google"; //benim beklentim 
		
		String actualTitle=driver.getTitle();// de.yazdigi
		if(expecedTitle.equals(actualTitle)) {//karsilastirma
			System.out.println("The actual and exected Title matched");
		}else {
			System.err.println("The actual and exected does not  matched");

		}
System.out.println("=================");

  String actualUrl= driver.getCurrentUrl();
  String expectedUrl="https://www.google.com/";
          System.out.println(actualUrl);
           String expectedUrl1="https:/www.google.com/";
 if(expectedUrl.equals(actualUrl)) {
	 System.out.println("passed");
 }
		driver.close();
	}

}
