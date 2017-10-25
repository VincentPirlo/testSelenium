/**   
* @Title: SuiteTest2.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年10月25日 下午10:54:08 
* @version V1.0   
*/ 
package com.vincent.testng;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SuiteTest2 {
    String message = "Manisha";	
    SuiteMessageUtil messageUtil = new SuiteMessageUtil(message);
	 
    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,messageUtil.salutationMessage());
    }
}