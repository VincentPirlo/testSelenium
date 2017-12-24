/**   
* @Title: IgnoreTest.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年10月25日 下午10:59:36 
* @version V1.0   
*/ 
package com.vincent.testng;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 忽略测试
 * @author Vincent
 *
 */


public class IgnoreTest {
    String message = "Manisha";
    IgnoreMessageUtil messageUtil = new IgnoreMessageUtil(message);

    @Test(enabled = false)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = "Manisha";
	Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
	message = "Hi!" + "Manisha";
	Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}