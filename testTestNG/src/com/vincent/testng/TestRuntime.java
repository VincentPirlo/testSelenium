/**   
* @Title: TestRuntime.java 
* @Package com.vincent.testng 
* @Description: TODO异常测试——运行时异常
* @author Vincent  
* @date 2017年10月22日 下午11:08:23 
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
