package com.class04;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.util.CommonMethods;

public class Listener extends CommonMethods implements ITestListener{
 
	public  void onTestStars(ITestResult result) {
	 System.out.println("test started"+result.getName());
	 CommonMethods.takeScreenshot(result.getName());
 }
 public void onTestSuccess(ITestResult result) {
	 System.out.println("test passed"+result.getName());
	 CommonMethods.takeScreenshot("passed/"+result.getName());
 }
 public void onTestFailure(ITestResult result) {
	 System.out.println("test failed"+"failed/"+result.getName());
	 CommonMethods.takeScreenshot("failed"+result.getName());
 }
}
