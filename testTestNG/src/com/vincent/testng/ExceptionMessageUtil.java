/**   
* @Title: MessageUtil.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年10月25日 下午9:01:49 
* @version V1.0   
*/ 
package com.vincent.testng;

/**
 * @author Vincent
 *
 */
public class ExceptionMessageUtil {

	   private String message;

	   //Constructor
	   //@param message to be printed
	   public ExceptionMessageUtil(String message){
	      this.message = message; 
	   }

	   // prints the message
	   public void printMessage(){
	      System.out.println(message);
	      int a =0;
	      int b = 1/a;
	   }   

	   // add "Hi!" to the message
	   public String salutationMessage(){
	      message = "Hi!" + message;
	      System.out.println(message);
	      return message;
	   }   
	}