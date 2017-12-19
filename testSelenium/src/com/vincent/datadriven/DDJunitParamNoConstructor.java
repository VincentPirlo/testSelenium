/**   
* @Title: DDJunitParamNoConstructor.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017��12��19�� ����11:34:26 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @Function: ʹ��Parameterized������֮��ʽ����ͨ��Annotation Parameterָ����Ҫ������������
 * @author: Vincent
 * @date: 2017��12��19������11:34:26
 */
@RunWith(value = Parameterized.class)
public class DDJunitParamNoConstructor {
	@Parameter(value = 0)
	//value��ֵָ�������Զ�ӦgetData���������е�����
	public String username;		//�˴���������Ϊpublic
	
	@Parameter(value = 1)
	public String password;
	
	@Parameters
	public static Collection getData() {
		return Arrays.asList(new String[][] {{"ray", "123"}, {"venus", "123"}, {"jupiter", "123"}, {"mercury", "123"}});
	}
	
	@Test
	public void test() {
		System.out.println(this.username + " " + this.password);
	}
}
