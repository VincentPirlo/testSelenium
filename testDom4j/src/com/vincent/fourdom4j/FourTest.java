/**   
* @Title: FourTest.java 
* @Package com.vincent.fourdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月5日 下午10:02:14 
* @version V1.0   
*/ 
package com.vincent.fourdom4j;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月5日下午10:02:14
 */
public class FourTest {
	public static void main(String[] args) {
		DomDemo domdemo = new DomDemo();
		domdemo.init();
		domdemo.createXml("domdemo.xml");
		domdemo.parserXml("domdemo.xml");
		
		
		Dom4jDemo dom4jdemo = new Dom4jDemo();
		dom4jdemo.createXml("dom4jdemo.xml");
		dom4jdemo.parserXml("dom4jdemo.xml");
	}
}
