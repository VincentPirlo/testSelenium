/**   
* @Title: TestConfig.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月25日 下午9:11:53 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @Function: 如何一起运行多个TestNG测试用例(类)，也称为套件测试。
 * 测试套件是用于测试软件程序的行为或一组行为的测试用例的集合。 在TestNG中，我们无法在测试源代码中定义一个套件，
 * 但它可以由一个XML文件表示，因为套件是执行的功能。 它还允许灵活配置要运行的测试。 套件可以包含一个或多个测试，
 * 并由<suite>标记定义。<suite>是testng.xml的根标记。 它描述了一个测试套件，它又由几个<test>部分组成。
 * TestConfig.java、TestDataBase.java、TestOrder.java、
 * suitetest1-testng.xml、suitetest2-testn.xml、suitetest3-testn.xml
 * @author: Vincent
 * @date: 2017年12月25日下午9:11:53
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
