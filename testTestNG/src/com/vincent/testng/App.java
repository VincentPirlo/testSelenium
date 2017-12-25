/**   
* @Title: App.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月25日 下午11:29:19 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: 依赖测试1（dependOnMethods）
 * 有时，我们可能需要以特定顺序调用测试用例中的方法，或者可能希望在方法之间共享一些数据和状态。 
 * TestNG支持这种依赖关系，因为它支持在测试方法之间显式依赖的声明。TestNG允许指定依赖关系：
 *   在@Test注释中使用属性dependsOnMethods，或者在@Test注释中使用属性dependsOnGroups。
 *   在TestNG中，我们使用dependOnMethods和dependsOnGroups来实现依赖测试。 如果依赖方法失败，则将跳过所有后续测试方法。
 * @author: Vincent
 * @date: 2017年12月25日下午11:29:19
 */
public class App {
	
	//如果method1()通过，那么将执行method2()。
	@Test
	public void method1() {
		System.out.println("This is method one.");
	}
	
	@Test(dependsOnMethods = {"method1"})
	public void method2() {
		System.out.println("This is method two");
	}
}
