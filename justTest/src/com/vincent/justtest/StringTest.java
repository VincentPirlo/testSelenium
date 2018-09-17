/**   
* @Title: StringTest.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018年9月17日 下午8:26:16 
* @version V1.0   
*/ 
package com.vincent.justtest;

/**
 * @Function: 测试String类
 * @author: Vincent
 * @date: 2018年9月17日下午8:26:16
 */
public class StringTest {
	public static void main(String[] args) {
		String str = "Yesterday Once More!";
		
		System.out.println(str.charAt(3));					//索引为3的字符
		System.out.println(str.codePointAt(3));				//索引为3的字符的ACSII码
		System.out.println(str.offsetByCodePoints(2, 3));	//
		System.out.println(str.compareTo("hello"));
		System.out.println(str.endsWith("!"));				//以!结尾则为真
		
		String str1 = "yesterday Once more!";
		System.out.println(str.equals(str1));				//str与str1相等则为真
		System.out.println(str.equalsIgnoreCase(str1));		//忽略大小写，str与str1相等则为真
		
		System.out.println(str.indexOf("Yes"));
		System.out.println(str.indexOf("Yes", 3));
		System.out.println(str.indexOf(2));
		System.out.println(str.indexOf(2, 3));
		
		System.out.println(str.length());
		
		System.out.println(str.replaceAll("Yes", "haha"));
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(2));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String str2 = " one two three ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		
		
	}
}
