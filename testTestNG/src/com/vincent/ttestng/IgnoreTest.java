/**   
* @Title: IgnoreTest.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��28�� ����9:57:49 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: ���Բ���
 * ��ʱ�����ǵĴ�����û��׼���ã������������д�뵽���Է���/���뽫�޷����У�����������£�@Test(enabled = false)
 * �����ڽ��ô˲��԰��������Է����Ǳ�ע��@Test(enabled = false)����ô�������Ѿ�׼���ò��ԵĲ����������ƹ���
 * IgnoreUtil.java & IgnoreTest.java & ignoretest-testng.xml
 * @author: Vincent
 * @date: 2017��12��28������9:57:49
 */
public class IgnoreTest {
	String message = "Manisha";
	IgnoreUtil messageUtil = new IgnoreUtil(message);
	
	@Test(enabled = false)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Manisha";
		Assert.assertEquals(message, messageUtil.printMessage());
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Manisha";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
}
