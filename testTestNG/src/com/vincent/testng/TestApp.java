/**   
* @Title: TestApp.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��25�� ����11:48:31 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: �������ԣ�dependsOnGroups��
 * TestServer.java & TestDB.java & TestApp.java & dependtest-testng.xml
 * @author: Vincent
 * @date: 2017��12��25������11:48:31
 */
public class TestApp {

	//run if all methods from "deploy" and "db" groups are passed.
	@Test(dependsOnGroups = { "deploy", "db" })
	public void method1() {
		System.out.println("This is method one.");
//		throw new RuntimeException();
	}
	
	//run if method1() is passed.
	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method tow.");
	}
}
