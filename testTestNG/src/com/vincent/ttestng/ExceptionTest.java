/**   
* @Title: ExceptionTest.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午10:43:43 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: 异常测试
 * TestNG跟踪异常处理代码提供了一个选项。可以测试是否需要代码抛出异常或不抛
 * 出。 @Test注释expectedExceptions 参数一起使用。现在，让我们来看看@Test（expectedExceptions）在动作中。
 * ExceptionUtil.java & ExceptionTest.java & exceptiontest-testng.xml
 * @author: Vincent
 * @date: 2017年12月28日下午10:43:43
 */
public class ExceptionTest {
	 String message = "Manisha";	
	    ExceptionUtil messageUtil = new ExceptionUtil(message);
		   
	@Test(expectedExceptions = ArithmeticException.class)
	public void testPrintMessage() {	
		System.out.println("Inside testPrintMessage()");     
		messageUtil.printMessage();     
	}
	    
	@Test
	public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Manisha";
	      Assert.assertEquals(message,messageUtil.salutationMessage());
	}
}
