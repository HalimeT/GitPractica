package com.reviewClass01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@BeforeClass
    public  void testBeforeMethod() {
		
		System.out.println("open Browser");
	}	
	@Test
  public void test1() {	
		System.out.println("logining in");
		System.out.println("PIM test case");				
}
	@Test
    public void test2() {	
		System.out.println("Leave Browser");
	}	
	@Test
  public void test3() {	
		System.out.println("test 3");				
}
	@AfterClass
    public  void testAfterM() {	
		System.out.println("close Browser ");
	}	
	}

