/**   
* @Title: IndependentTest.java 
* @Package com.vincent.testng.parallelism 
* @Description: TODO
* @author Vincent  
* @date 2017年10月23日 下午10:49:55 
* @version V1.0   
*/ 
package com.vincent.testng.parallelism;
import org.testng.annotations.Test;
/**
 * @author Vincent
 *
 */
public class IndependentTest
{
    @Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
    public void testMethod()
    {
        Long id = Thread.currentThread().getId();
        System.out.println("Test method executing on thread with id: " + id);
    }
}
