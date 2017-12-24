/**   
* @Title: TestTimeout.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��24�� ����11:35:34 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: ��ʱ����
 *  ����ʱ����ʾ�����Ԫ���Ի��ѵ�ʱ�䳬��ָ���ĺ���������ôTestNG������ֹ����������Ϊʧ�ܡ�
 *  ����ʱ��Ҳ���������ܲ��ԣ���ȷ�������ں����ʱ���ڷ��ء�
 * @author: Vincent
 * @date: 2017��12��24������11:35:34
 */
public class TestTimeout {
	
	@Test(timeOut = 5000)				//time in miliseconds
	public void testThisShouldPass() throws InterruptedException {
		Thread.sleep(4000);
	}
	
	@Test(timeOut = 1000)
	public void testThisShouldFail() {
		while(true) {
			//do nothing
		}
	}
}
