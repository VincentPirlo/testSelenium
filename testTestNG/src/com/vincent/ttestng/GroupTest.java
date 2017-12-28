/**   
* @Title: GroupTest.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��28�� ����10:18:33 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: �����
 * GroupUtil.java & GroupTest.java & grouptest-testng.xml & grouptest1-testng.xml & grouptest2-testng.xml
 * ��TestNG���������һ���µĴ��¹��ܣ�����������JUnit��ܣ���������ȵ��ʵ��Ĳ��ַ�����ƿ�����ӵĲ��Է������顣
 * ������������������Ⱥ�����Щ����������Ҳ����ָ��һ����������顣Ȼ��TestNG�ɵ��ú�Ҫ�����һ���ض���Ⱥ�壨��������ʽ����
 * ���ų���һ�����ϡ����������������ԣ���η������ԣ�������������ײ�ͬ�Ĳ��Ա���������Ҫ�����±����κζ�����
 * ��ָ��testng.xml�ļ�ʹ��<groups>��ǩ�������Է��������Ǹ���<test>��<suite>��ǩ����ָ��<suite>��ǩ���������еĵ�<test>��ǩ�·���
 * @author: Vincent
 * @date: 2017��12��28������10:18:33
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
