package com.Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-2");	
    WebDriver driver=new ChromeDriver();

    driver.navigate().to("https://www.amazon.com/ap/signin?_encoding=UTF8&accountStatusPolicy=P1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcss%2Forder-history%3Fie%3DUTF8%26ref_%3Dnav_orders_first&pageId=webcs-yourorder&showRmrMe=1");
    driver.findElement( By.id("ap_email")).sendKeys("fethullah.tmz@gmail.com");
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("ap_password")).sendKeys("19841984Ft");
    driver.findElement(By.id("signInSubmit")).click();
    driver.findElement(By.id("class=\"a-input-text a-span12 auth-autofocus auth-required-field\"")).click();
	}

}
