/**   
* @Title: TestDataBase.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月25日 下午9:15:27 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: 如何一起运行多个TestNG测试用例(类)，也称为套件测试。
 * TestConfig.java、TestDataBase.java、TestOrder.java、
 * suitetest1-testng.xml、suitetest2-testn.xml、suitetest3-testn.xml
 * @author: Vincent
 * @date: 2017年12月25日下午9:15:27
 */
public class TestDataBase {
	
	@Test(groups = "db")
	public void testConnectOracle() {
        System.out.println("testConnectOracle()");
    }

    @Test(groups = "db")
    public void testConnectMsSQL() {
        System.out.println("testConnectMsSQL");
    }

    @Test(groups = "db-nosql")
    public void testConnectMongoDB() {
        System.out.println("testConnectMongoDB");
    }

    @Test(groups = { "db", "brokenTests" })
    public void testConnectMySQL() {
        System.out.println("testConnectMySQL");
    }
}
