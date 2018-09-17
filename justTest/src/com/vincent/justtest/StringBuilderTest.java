/**   
* @Title: StringBuilderTest.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018��9��17�� ����9:21:10 
* @version V1.0   
*/ 
package com.vincent.justtest;

/**
 * @Function: ����StringBuilder��
 * @author: Vincent
 * @date: 2018��9��17������9:21:10
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
