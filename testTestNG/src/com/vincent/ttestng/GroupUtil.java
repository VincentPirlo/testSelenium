/**   
* @Title: GroupUtil.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午10:14:14 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: 组测试实用类
 * @author: Vincent
 * @date: 2017年12月28日下午10:14:14
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
