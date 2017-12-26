/**   
* @Title: TestParameterDataProvider.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��26�� ����10:13:41 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Function: ����������֮��ͨ��@DataProvider���ݲ�����1����һ��int������
 * @author: Vincent
 * @date: 2017��12��26������10:13:41
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
