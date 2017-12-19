/**   
* @Title: DDJunitParamConstructor.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017年12月19日 下午11:24:22 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @Function: 使用Parameterized运行器之方式一：通过构造方法初始化测试数据
 * @author: Vincent
 * @date: 2017年12月19日下午11:24:22
 */
@RunWith(value=Parameterized.class)
public class DDJunitParamConstructor {
	private String username;
	private String password;
	public DDJunitParamConstructor(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Parameters
	public static Collection getData() {
		return Arrays.asList(new String[][] {{"ray", "123"}, {"venus", "123"}, {"jupiter", "123"}, {"mercury", "123"}});
	}
	
	@Test
	public void test() {
		System.out.println(this.username + " " + this.password);
	}
}
