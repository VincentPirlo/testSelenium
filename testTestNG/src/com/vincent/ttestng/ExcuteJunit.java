/**   
* @Title: ExcuteJunit.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午11:22:01 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import static org.testng.AssertJUnit.assertEquals;

import org.junit.Test;

/**
 * @Function: TestNG运行JUnit测试
 * @author: Vincent
 * @date: 2017年12月28日下午11:22:01
 */
public class ExcuteJunit {
	@Test
    public void testAdd() {
        String str= "Junit testing using TestNG";
        assertEquals("Junit testing using TestNG",str);
    }
}
