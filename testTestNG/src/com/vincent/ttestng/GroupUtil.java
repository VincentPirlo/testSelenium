/**   
* @Title: GroupUtil.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��28�� ����10:14:14 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: �����ʵ����
 * @author: Vincent
 * @date: 2017��12��28������10:14:14
 */
public class GroupUtil {
	private String message;
	
	public GroupUtil(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String salutationMessage() {
		message = "tutorialspoint" + message;
		System.out.println(message);
		return message;
	}
	
	public String exitMessage() {
		message = "www." + message;
		System.out.println(message);
		return message;
	}
}
