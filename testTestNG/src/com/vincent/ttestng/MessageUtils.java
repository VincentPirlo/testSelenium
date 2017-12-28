/**   
* @Title: MessageUtils.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午9:10:59 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: 套件测试
 * MessageUtils.java & TestMessage1.java & TestMessages2.java & messagestest-testng.xml
 * 套件的测试是为了测试软件程序的行为或一系列行为的情况下，是一个集合。在TestNG，我们不能定义一套测试源代码，但它代表的套件是一个XML文件执行特征。
 * 这也允许灵活的配置要运行的测试。套件可以包含一个或多个测试和被定义由<suite>标签。testng.xml中有<suite>根标签。它描述了一个测试套件，
 * 这反过来又是由多个<test>区段组成。
 * @author: Vincent
 * @date: 2017年12月28日下午9:10:59
 */
public class MessageUtils {
	
	private String message;
	
	public MessageUtils(String message) {
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
