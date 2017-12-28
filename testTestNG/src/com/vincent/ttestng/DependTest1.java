/**   
* @Title: DependTest1.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午11:16:37 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: 依赖测试之二使用属性dependsOnGroups
 * DependUtil.java & DependTest1.java & dependtest1-testng.xml
 * @author: Vincent
 * @date: 2017年12月28日下午11:16:37
 */
public class DependTest1 {
	String message = "Manisha";
    DependUtil messageUtil = new DependUtil(message);

    @Test(groups = { "init" })
    public void testPrintMessage() {
	System.out.println("Inside testPrintMessage()");
	message = "Manisha";
	Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test(dependsOnGroups = { "init.*" })
    public void testSalutationMessage() {
	System.out.println("Inside testSalutationMessage()");
	message = "Hi!" + "Manisha";
	Assert.assertEquals(message, messageUtil.salutationMessage());
    }

    @Test(groups = { "init" })
    public void initEnvironmentTest() {
	System.out.println("This is initEnvironmentTest");
    }
}
