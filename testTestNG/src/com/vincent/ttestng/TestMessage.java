/**   
* @Title: TestMessage.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月27日 下午11:21:27 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: MessageUtil的测试类
 * MessageUtil.java & TestMessage.java & messagetest-testng.xml
 * @author: Vincent
 * @date: 2017年12月27日下午11:21:27
 */
public class TestMessage {
	String message = "Hello world";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		Assert.assertEquals(message, messageUtil.printMessage());
	}
}
