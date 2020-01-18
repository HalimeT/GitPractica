package com.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Create class that will have:
//Before and After Class annotation
//Before and After Method annotation
//2 methods with Test annotation
public class Task2 {
	@BeforeClass()
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}@AfterClass()
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
	@Test
	public void test1 () {
		System.out.println("I am an actual test 1");
	}
	@Test
	public void test2 () {
		System.out.println("I am an actual test 2 ");
	}
}
