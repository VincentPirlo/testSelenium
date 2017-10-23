/**   
* @Title: ParallelMethodTest.java 
* @Package com.vincent.testng.parallelism 
* @Description: TODO并行地执行测试方法
* @author Vincent  
* @date 2017年10月23日 下午9:41:56 
* @version V1.0   
*/ 
package com.vincent.testng.parallelism;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Vincent
 *
 */
public class ParallelMethodTest {
	@BeforeMethod
	public void beforeMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("Before test-method. Thread id is: "+id);
	}
	
	@Test
	public void testMethodsOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method One. Thread id is: "+id);
	}
	
	@Test
	public void testMethodsTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method Two. Thread id is: "+id);
	}
	
	@AfterMethod
	public void afterMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("After test-method. Thread id is:"+id);
	}
	
	
}
