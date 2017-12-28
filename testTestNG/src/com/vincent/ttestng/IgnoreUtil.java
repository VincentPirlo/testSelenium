/**   
* @Title: IgnoreUtil.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��28�� ����9:51:58 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: print the given message on console.
 * IgnoreUtil.java & IgnoreTest.java & ignoretest-testng.xml
 * @author: Vincent
 * @date: 2017��12��28������9:51:58
 */
public class IgnoreUtil {
	
	private String message;
	
	public IgnoreUtil(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}
}
