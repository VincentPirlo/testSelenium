/**   
* @Title: SuiteTest.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年10月25日 下午10:47:57 
* @version V1.0   
*/ 
package com.vincent.testng;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Vincent
 *
 */
public class SuiteTest1 {
    String message = "Manisha";
    SuiteMessageUtil messageUtil = new SuiteMessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
	Assert.assertEquals(message, messageUtil.printMessage());
    }
}
