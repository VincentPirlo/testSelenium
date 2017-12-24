/**   
* @Title: TestGroup.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月24日 下午11:40:38 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @Function: 
 * 分组测试是TestNG中的一个新的创新功能，它在JUnit框架中是不存在的。 它允许您将方法调度到适当的部分，并执行复杂的测试方法分组。 
 * 您不仅可以声明属于某个分组的方法，还可以指定包含其他组的组。 然后调用TestNG，并要求其包含一组特定的组(或正则表达式)，同时排除另一个分组。
 * 组测试提供了如何分区测试的最大灵活性，如果您想要背靠背运行两组不同的测试，则不需要重新编译任何内容。
 * 使用<groups>标记在testng.xml文件中指定分组。 它可以在<test>或<suite>标签下找到。 <suite>标签中指定分组适用于其下的所有<test>标签。
 * 
 * runSelenium()和runSelenium1()属于分组：selenium-test。
 * testConnectOracle()和testConnectMsSQL()属于分组：database 。
 * 如果分组selenium-test和database通过，则runFinal()将被执行。
 * @author: Vincent
 * @date: 2017年12月24日下午11:40:38
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
