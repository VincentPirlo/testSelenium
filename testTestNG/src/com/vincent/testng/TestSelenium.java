/**   
* @Title: TestSelenium.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月24日 下午11:48:21 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: "分组"可以在类上应用。 在下面的示例中，“TestSelenium”类的每个公共方法都属于分组：selenium-test 
 * @author: Vincent
 * @date: 2017年12月24日下午11:48:21
 */
@Test(groups = "selenium-test")
public class TestSelenium {
	
	public void runSelenium() {
		System.out.println("runSelenium()");
	}
	
	public void runSelenium1() {
		System.out.println("runSelenium1()");
	}
}
