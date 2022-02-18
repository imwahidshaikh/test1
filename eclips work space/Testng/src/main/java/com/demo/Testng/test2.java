package com.demo.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class test2 {
	static int a=0 ;
	@Test
	public void m1 () {
		
		System.out.println("m1");
		a++;
		}
	@Test
	public void m2 () {
		
		System.out.println("m2");
		a++;
		}
	
	@AfterMethod
	public void p () {
		
		
		System.out.println(a);
		}
	
	
	
	
}
