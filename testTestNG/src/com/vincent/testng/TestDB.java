/**   
* @Title: TestDB.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月25日 下午11:43:54 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: 依赖测试（dependsOnGroups）
 * TestServer.java & TestDB.java & TestApp.java & dependtest-testng.xml
 * @author: Vincent
 * @date: 2017年12月25日下午11:43:54
 */
public class TestDB {
	
	//belong to "db" group
	//run if all methods from "deploy" group are passed.
	@Test(groups="db", dependsOnGroups="deploy")
	public void initDB() {
		System.out.println("This is initDB()");
	}
	
	//belong to "db" group
	//run if "initDB" method is passed
	@Test(dependsOnMethods = { "initDB" }, groups="db")
	public void testConnection() {
		System.out.println("This is testConnection()");
	}
}
