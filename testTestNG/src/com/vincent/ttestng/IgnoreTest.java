/**   
* @Title: IgnoreTest.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午9:57:49 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: 忽略测试
 * 有时，我们的代码是没有准备好，如果测试用例写入到测试方法/代码将无法运行，在这种情况下，@Test(enabled = false)
 * 有助于禁用此测试案例。测试方法是标注了@Test(enabled = false)，那么并不是已经准备好测试的测试用例是绕过。
 * IgnoreUtil.java & IgnoreTest.java & ignoretest-testng.xml
 * @author: Vincent
 * @date: 2017年12月28日下午9:57:49
 */
public class IgnoreTest {
	String message = "Manisha";
	IgnoreUtil messageUtil = new IgnoreUtil(message);
	
	@Test(enabled = false)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Manisha";
		Assert.assertEquals(message, messageUtil.printMessage());
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Manisha";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
}
