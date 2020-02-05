package com.class01;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.*;
public class diffrentAnnotations {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@AfterTest
	public void AfterTest() {
	System.out.println("afterTest");
	}@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	@BeforeMethod
     public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");		
	}
	@Test(priority=1)
	public void test () {
		System.out.println("I am an actual test ");
	}
	@Test(priority=2)
	public void atest () {
		System.out.println("I am an actual test 2 ");
	}
}
