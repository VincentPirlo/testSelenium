/**   
* @Title: TestMessages1.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��28�� ����9:28:25 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: �׼�����
 * MessageUtils.java & TestMessage1.java & TestMessages2.java & messagestest-testng.xml
 * @author: Vincent
 * @date: 2017��12��28������9:28:25
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
