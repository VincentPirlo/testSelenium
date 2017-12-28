/**   
* @Title: ExceptionUtil.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午10:39:29 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: 异常测试实用类
 * ExceptionUtil.java & ExceptionTest.java & exceptiontest-testng.xml
 * @author: Vincent
 * @date: 2017年12月28日下午10:39:29
 */
public class ExceptionUtil {
	 private String message;

	public ExceptionUtil(String message){
	      this.message = message; 
	}

	public void printMessage(){
	      System.out.println(message);
	      int a =0;
	      int b = 1/a;
	}   

	public String salutationMessage(){
	      message = "Hi!" + message;
	      System.out.println(message);
	      return message;
	}   
}
