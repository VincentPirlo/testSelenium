/**   
* @Title: TestParameterDataProvider.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月26日 下午10:13:41 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Function: 参数化测试之二通过@DataProvider传递参数（1传递一个int参数）
 * @author: Vincent
 * @date: 2017年12月26日下午10:13:41
 */
public class TestParameterDataProvider {
	
	@Test(dataProvider = "providerNumbers")
	public void test(int number, int expected) {
		Assert.assertEquals(number+10, expected);
	}
	
	@DataProvider(name = "providerNumbers")
	public Object[][] providerData() {
		return new Object[][] { {10,20}, {100,110}, {200,210}};
	}
}
