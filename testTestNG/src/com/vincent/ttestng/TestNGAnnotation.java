/**   
* @Title: TestNGAnnotation.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��27�� ����11:05:37 
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
 * @Function: TestNGע�������ִ��
 *   ��������beforeSuite��������ִֻ��һ�Ρ�
 *   ���afterSuite�ģ�������ִֻ��һ�Ρ�
 *   ��ʹ���� beforeTest(), beforeClass(), afterClass() ��afterTest() ����ִֻ��һ�Ρ�
 *   beforeMethod��������ִ��ÿ���������������ڴ�֮ǰִ�еĲ���������
 *   afterMethod��������ִ��ÿ����������������������ִ�к�
 *   In between beforeMethod() and afterMethod() each test case executes.
 * @author: Vincent
 * @date: 2017��12��27������11:05:37
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
