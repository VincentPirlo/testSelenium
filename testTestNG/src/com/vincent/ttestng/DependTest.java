/**   
* @Title: DependTest.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午10:49:58 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: 依赖测试之一使用属性dependsOnMethods
 * * 有时候，你可能需要在一个特定的顺序调用方法在测试案例，或你想分享一些数据和方法之间的状态。
 * TestNG支持这种依赖测试方法之间的显式依赖它支持声明。TestNG允许指定依赖，无论与否：
 * 		使用属性dependsOnMethods在 @Test 注释  	或者		使用属性dependsOnGroups在@Test注解。
 * DependUtil.java & DependTest.java & dependtest-testng.xml
 * @author: Vincent
 * @date: 2017年12月28日下午10:49:58
 */
public class DependTest {
	String message = "Manisha";
    DependUtil messageUtil = new DependUtil(message);

    @Test
    public void testPrintMessage() {
	System.out.println("Inside testPrintMessage()");
	message = "Manisha";
	Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test(dependsOnMethods = { "initEnvironmentTest" })
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
	message = "Hi!" + "Manisha";
	Assert.assertEquals(message, messageUtil.salutationMessage());
    }

    @Test
    public void initEnvironmentTest() {
	System.out.println("This is initEnvironmentTest");
    }
}
