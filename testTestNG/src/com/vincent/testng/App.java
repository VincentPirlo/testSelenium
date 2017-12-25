/**   
* @Title: App.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��25�� ����11:29:19 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: ��������1��dependOnMethods��
 * ��ʱ�����ǿ�����Ҫ���ض�˳����ò��������еķ��������߿���ϣ���ڷ���֮�乲��һЩ���ݺ�״̬�� 
 * TestNG֧������������ϵ����Ϊ��֧���ڲ��Է���֮����ʽ������������TestNG����ָ��������ϵ��
 *   ��@Testע����ʹ������dependsOnMethods��������@Testע����ʹ������dependsOnGroups��
 *   ��TestNG�У�����ʹ��dependOnMethods��dependsOnGroups��ʵ���������ԡ� �����������ʧ�ܣ����������к������Է�����
 * @author: Vincent
 * @date: 2017��12��25������11:29:19
 */
public class App {
	
	//���method1()ͨ������ô��ִ��method2()��
	@Test
	public void method1() {
		System.out.println("This is method one.");
	}
	
	@Test(dependsOnMethods = {"method1"})
	public void method2() {
		System.out.println("This is method two");
	}
}
