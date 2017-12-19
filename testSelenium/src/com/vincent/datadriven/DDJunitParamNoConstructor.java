/**   
* @Title: DDJunitParamNoConstructor.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017年12月19日 下午11:34:26 
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
 * @Function: 使用Parameterized运行器之方式二：通过Annotation Parameter指定需要参数化的属性
 * @author: Vincent
 * @date: 2017年12月19日下午11:34:26
 */
@RunWith(value = Parameterized.class)
public class DDJunitParamNoConstructor {
	@Parameter(value = 0)
	//value的值指定该属性对应getData返回数组中的序数
	public String username;		//此处必须声明为public
	
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
