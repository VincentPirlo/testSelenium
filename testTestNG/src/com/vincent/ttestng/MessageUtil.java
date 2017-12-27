/**   
* @Title: MessageUtil.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月27日 下午11:18:51 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: prints the given message on console.
 * MessageUtil.java & TestMessage.java & messagetest-testng.xml
 * @author: Vincent
 * @date: 2017年12月27日下午11:18:51
 */
public class MessageUtil {
	private String message;
	
	//constructor
	public MessageUtil(String message) {
		this.message = message;
	}
	
	//print the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
}
