/**   
* @Title: CharUtil.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月26日 下午11:25:14 
* @version V1.0   
*/ 
package com.vincent.testng;

/**
 * @Function: 创建一个将字符转换成ASCII或者副词的类，如何使用TestNG来做单元测试
 * CharUtil.java & CharUtilsTest.java
 * @author: Vincent
 * @date: 2017年12月26日下午11:25:14
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
