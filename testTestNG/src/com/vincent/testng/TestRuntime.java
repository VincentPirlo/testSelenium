/**   
* @Title: TestRuntime.java 
* @Package com.vincent.testng 
* @Description: TODO�쳣���ԡ�������ʱ�쳣
* @author Vincent  
* @date 2017��10��22�� ����11:08:23 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;
/**
 * @author Vincent
 *
 */
public class TestRuntime {
	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 0;
		System.out.println("After division the value of i is: "+i);
	}
}
