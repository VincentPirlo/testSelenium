/**   
* @Title: DependTest.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��28�� ����10:49:58 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: ��������֮һʹ������dependsOnMethods
 * * ��ʱ���������Ҫ��һ���ض���˳����÷����ڲ��԰��������������һЩ���ݺͷ���֮���״̬��
 * TestNG֧�������������Է���֮�����ʽ������֧��������TestNG����ָ���������������
 * 		ʹ������dependsOnMethods�� @Test ע��  	����		ʹ������dependsOnGroups��@Testע�⡣
 * DependUtil.java & DependTest.java & dependtest-testng.xml
 * @author: Vincent
 * @date: 2017��12��28������10:49:58
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
