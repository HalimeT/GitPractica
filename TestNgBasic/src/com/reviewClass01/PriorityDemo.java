package com.reviewClass01;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityDemo {
	
	
	@Test(priority =2)
    public  void D() {
		
		System.out.println("open Browser");
	}	
	@Test(priority =1)
	  public void A() {	
			
			System.out.println("PIM test case");				
	}
		@Test(priority =3)
	    public void B() {	
			System.out.println("Leave Browser");
		}	
		@Test(priority =4)
	    public void C() {	
			System.out.println("close Browser");
		}	

}