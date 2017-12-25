/**   
* @Title: TestServer.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��25�� ����11:39:29 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: �������ԣ�dependsOnGroups��
 * TestServer.java & TestDB.java & TestApp.java & dependtest-testng.xml
 * @author: Vincent
 * @date: 2017��12��25������11:39:29
 */
@Test(groups = "deploy")
public class TestServer {
	
	@Test
	public void deployServer() {
		System.out.println("Deploying Server...");
	}
	
	//Run this if deployServer() is passed.
	@Test(dependsOnMethods = "deployServer")
	public void deployBackUpServer() {
		System.out.println("Deploying Backup Server....");
	}
}
