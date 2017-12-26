/**   
* @Title: CharUtil.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��26�� ����11:25:14 
* @version V1.0   
*/ 
package com.vincent.testng;

/**
 * @Function: ����һ�����ַ�ת����ASCII���߸��ʵ��࣬���ʹ��TestNG������Ԫ����
 * CharUtil.java & CharUtilsTest.java
 * @author: Vincent
 * @date: 2017��12��26������11:25:14
 */
public class CharUtil {
	/**
	 * @Function: Convert the characters to ASCII value
	 * @param character
	 * @return
	 */
	public static int CharToASCII(final char character) {
		return (int) character;
	}
	
	/**
	 * @Function: Convert the ASCII value to character
	 * @param ascii
	 * @return
	 */
	public static char ASCIIToChar(final int ascii) {
		return (char) ascii;
	}
}
