/**   
* @Title: ExcuteJunit.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��28�� ����11:22:01 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import static org.testng.AssertJUnit.assertEquals;

import org.junit.Test;

/**
 * @Function: TestNG����JUnit����
 * @author: Vincent
 * @date: 2017��12��28������11:22:01
 */
public class ExcuteJunit {
	@Test
    public void testAdd() {
        String str= "Junit testing using TestNG";
        assertEquals("Junit testing using TestNG",str);
    }
}
