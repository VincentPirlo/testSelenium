/**   
* @Title: TestMessages1.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午9:28:25 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: 套件测试
 * MessageUtils.java & TestMessage1.java & TestMessages2.java & messagestest-testng.xml
 * @author: Vincent
 * @date: 2017年12月28日下午9:28:25
 */
public class TestMessages1 {
	String message = "Manisha";
	MessageUtils messageUtils = new MessageUtils(message);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		Assert.assertEquals(message, messageUtils.printMessage());
	}
}
