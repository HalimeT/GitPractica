package com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAmazon {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
        WebDriver driver=new ChromeDriver();
		
    driver.get("https://www.amazon.com");
		
 String Title=driver.getTitle();
 String expecedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
          
		if(expecedTitle.equals(Title)) {
    	   System.out.println("Title Displayed");
       }else {
    	   System.err.println("Title is not Displayed");
    	   
       }
          
           driver.close();
	}

}
