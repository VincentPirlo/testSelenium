/**   
* @Title: ExpectedExceptionTest.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年10月25日 下午9:04:31 
* @version V1.0   
*/ 
package com.vincent.testng;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * @author Vincent
 *
 */
public class ExceptionTest {
    String message = "Manisha";	
    ExceptionMessageUtil messageUtil = new ExceptionMessageUtil(message);
	   
    @Test(expectedExceptions = ArithmeticException.class)
    public void testPrintMessage() {	
        System.out.println("Inside testPrintMessage()");     
        messageUtil.printMessage();     
   }
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Manisha";
      Assert.assertEquals(message,messageUtil.salutationMessage());
   }
}