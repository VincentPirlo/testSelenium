/**   
* @Title: ExceptionTest.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��28�� ����10:43:43 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: �쳣����
 * TestNG�����쳣��������ṩ��һ��ѡ����Բ����Ƿ���Ҫ�����׳��쳣����
 * ���� @Testע��expectedExceptions ����һ��ʹ�á����ڣ�������������@Test��expectedExceptions���ڶ����С�
 * ExceptionUtil.java & ExceptionTest.java & exceptiontest-testng.xml
 * @author: Vincent
 * @date: 2017��12��28������10:43:43
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
