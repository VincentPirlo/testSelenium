/**   
* @Title: StringTest.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018��9��17�� ����8:26:16 
* @version V1.0   
*/ 
package com.vincent.justtest;

/**
 * @Function: ����String��
 * @author: Vincent
 * @date: 2018��9��17������8:26:16
 */
public class StringTest {
	public static void main(String[] args) {
		String str = "Yesterday Once More!";
		
		System.out.println(str.charAt(3));					//����Ϊ3���ַ�
		System.out.println(str.codePointAt(3));				//����Ϊ3���ַ���ACSII��
		System.out.println(str.offsetByCodePoints(2, 3));	//
		System.out.println(str.compareTo("hello"));
		System.out.println(str.endsWith("!"));				//��!��β��Ϊ��
		
		String str1 = "yesterday Once more!";
		System.out.println(str.equals(str1));				//str��str1�����Ϊ��
		System.out.println(str.equalsIgnoreCase(str1));		//���Դ�Сд��str��str1�����Ϊ��
		
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
