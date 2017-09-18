package com.vincent.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class NGtestOne {
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class.");
	}
	
	@Test
	public void test() {
		System.out.println("This is a test.");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class.");
	}
}
