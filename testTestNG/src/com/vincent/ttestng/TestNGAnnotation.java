/**   
* @Title: TestNGAnnotation.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月27日 下午11:05:37 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @Function: TestNG注解与程序执行
 *   首先所有beforeSuite（）方法只执行一次。
 *   最后，afterSuite的（）方法只执行一次。
 *   即使方法 beforeTest(), beforeClass(), afterClass() 和afterTest() 方法只执行一次。
 *   beforeMethod（）方法执行每个测试用例，但在此之前执行的测试用例。
 *   afterMethod（）方法执行每个测试用例，但测试用例执行后。
 *   In between beforeMethod() and afterMethod() each test case executes.
 * @author: Vincent
 * @date: 2017年12月27日下午11:05:37
 */
public class TestNGAnnotation {
	//test case 1
	@Test
	public void testcast1() {
		System.out.println("in test case 1");
	}
	
	//test case 2
	@Test
	public void testcase2() {
		System.out.println("in test case 2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("in afterMethod");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("in beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("in afterClass");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("in afterTest");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("in afterSuite");
	}
}
