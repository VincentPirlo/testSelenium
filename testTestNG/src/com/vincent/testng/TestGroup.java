/**   
* @Title: TestGroup.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��24�� ����11:40:38 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @Function: 
 * ���������TestNG�е�һ���µĴ��¹��ܣ�����JUnit������ǲ����ڵġ� �����������������ȵ��ʵ��Ĳ��֣���ִ�и��ӵĲ��Է������顣 
 * ������������������ĳ������ķ�����������ָ��������������顣 Ȼ�����TestNG����Ҫ�������һ���ض�����(��������ʽ)��ͬʱ�ų���һ�����顣
 * ������ṩ����η������Ե��������ԣ��������Ҫ�������������鲻ͬ�Ĳ��ԣ�����Ҫ���±����κ����ݡ�
 * ʹ��<groups>�����testng.xml�ļ���ָ�����顣 ��������<test>��<suite>��ǩ���ҵ��� <suite>��ǩ��ָ���������������µ�����<test>��ǩ��
 * 
 * runSelenium()��runSelenium1()���ڷ��飺selenium-test��
 * testConnectOracle()��testConnectMsSQL()���ڷ��飺database ��
 * �������selenium-test��databaseͨ������runFinal()����ִ�С�
 * @author: Vincent
 * @date: 2017��12��24������11:40:38
 */
public class TestGroup {
	
	@BeforeGroups("database")
	public void setupDB() {
		System.out.println("setupDB()");
	}
	
	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("cleanDB()");
	}
	
	@Test(groups = "selenium-test")
	public void runSelenium() {
		System.out.println("runSelenium()");
	}
	
	 @Test(groups = "selenium-test")
	public void runSelenium1() {
		 System.out.println("runSelenium()1");
	}

	@Test(groups = "database")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	@Test(groups = "database")
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL()");
	}

	@Test(dependsOnGroups = { "database", "selenium-test" })
	public void runFinal() {
		System.out.println("runFinal");
	}
}
