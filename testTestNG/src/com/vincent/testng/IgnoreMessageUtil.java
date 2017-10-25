/**   
* @Title: IgnoreMessageUtil.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年10月25日 下午11:01:33 
* @version V1.0   
*/ 
package com.vincent.testng;

/*
* This class prints the given message on console.
*/
public class IgnoreMessageUtil {

   private String message;

   //Constructor
   //@param message to be printed
   public IgnoreMessageUtil(String message){
      this.message = message; 
   }

   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   

   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
} 