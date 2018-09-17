/**   
* @Title: StringBuilderTest.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018年9月17日 下午9:21:10 
* @version V1.0   
*/ 
package com.vincent.justtest;

/**
 * @Function: 测试StringBuilder类
 * @author: Vincent
 * @date: 2018年9月17日下午9:21:10
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("hello");
		System.out.println(builder.toString());
		System.out.println(builder.length());
		builder.append('a');
		System.out.println(builder.toString());
		
		builder.setCharAt(2, 'e');
		System.out.println(builder.toString());
		
		builder.insert(3, " www");
		System.out.println(builder.toString());
		
		builder.delete(4, 6);
		System.out.println(builder.toString());
	}
}
