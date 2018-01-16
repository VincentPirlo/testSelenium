/**   
* @Title: ParallelClassesTestOne.java 
* @Package com.vincent.parallel 
* @Description: TODO
* @author Vincent  
* @date 2018��1��16�� ����10:54:07 
* @version V1.0   
*/ 
package com.vincent.parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018��1��16������10:54:07
 */
import org.testng.annotations.Test;
public class ParallelClassesTestOne {
	
	@BeforeClass
	public void beforeClass() {
		long id = Thread.currentThread().getId();
		System.out.println("Before test-class. Thread id is: " + id);
	}
	
	@Test
	public void testMethodOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Sample test-method One. Thread id is: " + id);
	}
	
	@Test
	public void testMethodTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Sample test-method Two. Thread id is: " + id);
	}
	
	@AfterClass
	public void afterClass() {
		long id = Thread.currentThread().getId();
		System.out.println("After test-class. Thread id is: " + id);
	}
}
