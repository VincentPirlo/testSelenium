/**   
* @Title: GroupTest.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午10:18:33 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: 组测试
 * GroupUtil.java & GroupTest.java & grouptest-testng.xml & grouptest1-testng.xml & grouptest2-testng.xml
 * 在TestNG中组测试是一个新的创新功能，它不存在于JUnit框架，它允许调度到适当的部分方法和瓶坯复杂的测试方法分组。
 * 您不仅可以声明属于群体的那些方法，但你也可以指定一组包含其他组。然后，TestNG可调用和要求包括一组特定的群体（或正则表达式），
 * 而排除另一个集合。这给了你最大的灵活性，如何分区测试，如果想运行两套不同的测试背靠背，不要求重新编译任何东西。
 * 组指定testng.xml文件使用<groups>标签。它可以发现无论是根据<test>或<suite>标签。组指定<suite>标签适用于所有的的<test>标签下方。
 * @author: Vincent
 * @date: 2017年12月28日下午10:18:33
 */
public class GroupTest {
	
	String message = ".com";
    GroupUtil messageUtil = new GroupUtil(message);

    @Test(groups = { "functest", "checkintest" })
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
	message = ".com";
	Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test(groups = { "checkintest" })
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
	message = "tutorialspoint" + ".com";
	Assert.assertEquals(message, messageUtil.salutationMessage());
    }

    @Test(groups = { "functest" })
    public void testingExitMessage() {
        System.out.println("Inside testExitMessage()");
        message = "www." + "tutorialspoint"+".com";
	Assert.assertEquals(message, messageUtil.exitMessage());
    }
}
