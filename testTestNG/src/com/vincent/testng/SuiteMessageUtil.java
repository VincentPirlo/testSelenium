/**   
* @Title: SuiteMessageUtil.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年10月25日 下午10:50:27 
* @version V1.0   
*/ 
package com.vincent.testng;

/*
* This class prints the given message on console.
*/
public class SuiteMessageUtil {
    private String message;

    // Constructor
    // @param message to be printed
    public SuiteMessageUtil(String message) {
    	this.message = message;
    }

    // prints the message
    public String printMessage() {
    	System.out.println(message);
    	return message;
    }

    // add "Hi!" to the message
    public String salutationMessage() {
    	message = "Hi!" + message;
    	System.out.println(message);
    	return message;
    }
}