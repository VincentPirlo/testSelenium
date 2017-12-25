/**   
* @Title: TestConfig.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��25�� ����9:11:53 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @Function: ���һ�����ж��TestNG��������(��)��Ҳ��Ϊ�׼����ԡ�
 * �����׼������ڲ�������������Ϊ��һ����Ϊ�Ĳ��������ļ��ϡ� ��TestNG�У������޷��ڲ���Դ�����ж���һ���׼���
 * ����������һ��XML�ļ���ʾ����Ϊ�׼���ִ�еĹ��ܡ� ���������������Ҫ���еĲ��ԡ� �׼����԰���һ���������ԣ�
 * ����<suite>��Ƕ��塣<suite>��testng.xml�ĸ���ǡ� ��������һ�������׼��������ɼ���<test>������ɡ�
 * TestConfig.java��TestDataBase.java��TestOrder.java��
 * suitetest1-testng.xml��suitetest2-testn.xml��suitetest3-testn.xml
 * @author: Vincent
 * @date: 2017��12��25������9:11:53
 */
public class TestConfig {
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite()");
	}
	
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("testAfterSuite()");
	}
	
	@BeforeTest
	public void testBeforeTest() {
		System.out.println("testBeforeTest()");
	}
	
	@AfterTest
	public void testAfterTest() {
        System.out.println("testAfterTest()");
    }
}
