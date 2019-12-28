package com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSyntax {
//	TC 2: Syntax Page URL Verification:
//	Open chrome browser
//	Navigate to “https://www.syntaxtechs.com/”
//	Navigate to “https://www.google.com/”
//	Navigate back to Syntax Technologies Page
//	Refresh current page
//	Verify url contains “Syntax”
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");
	        WebDriver driver=new ChromeDriver();
	        driver.navigate().to("https://www.syntaxtechs.com");
	        driver.navigate().to("https://www.google.com/");
	        driver.navigate().back();
	        driver.navigate().refresh();
	        String actualUrl= driver.getCurrentUrl();
if(actualUrl.contains("Syntax")) {
	System.out.println(actualUrl+"test is passed");
}else {
	System.err.println(actualUrl+"test is failed");
}
Thread.sleep(2000);
driver.quit();
	}

}
