/**   
* @Title: IndependentTest.java 
* @Package com.vincent.parallel 
* @Description: TODO
* @author Vincent  
* @date 2018年1月16日 下午11:08:40 
* @version V1.0   
*/ 
package com.vincent.parallel;

import org.testng.annotations.Test;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月16日下午11:08:40
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
