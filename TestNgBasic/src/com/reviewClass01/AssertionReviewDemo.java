package com.reviewClass01;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionReviewDemo {
@Test
public void testOne() {
	String actualTitle="HRM";
	String expectedTitle="HRM";

  Assert.assertEquals(actualTitle, expectedTitle,"Actual did not match");
//	if (actualTitle.equals(expectedTitle)) {
//		System.out.println("test pass");
//	}else {
//		System.err.println("Test failed");
//	}
//	Assert.assertTrue(test);
	System.out.println("another Testcase");
	
}	
	@Test
	public void testTwo() {
		ArrayList<String> ui=new ArrayList<>();
		ui.add("a");
		ui.add("b");
		ui.add("c");
		ArrayList<String> dd=new ArrayList<>();
		ui.add("a");
		ui.add("b");
		ui.add("c");
		Assert.assertEquals(ui, dd);
	}
}
