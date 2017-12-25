/**   
* @Title: App2.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月25日 下午11:33:48 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: 依赖测试2（dependOnMethods）
 * @author: Vincent
 * @date: 2017年12月25日下午11:33:48
 */
public class App2 {
	
	//如果method1()失败，则将跳过method2()
	@Test
	public void method1() {
		System.out.println("This is method one.");
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = { "method1" } )
	public void method2() {
		System.out.println("This is method two.");
	}
}
