/**   
* @Title: XmlDocument.java 
* @Package com.vincent.fourdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018��1��4�� ����11:27:17 
* @version V1.0   
*/ 
package com.vincent.fourdom4j;

/**
 * @Function: ����XML�ĵ�����������Ľӿ�
 * @author: Vincent
 * @date: 2018��1��4������11:27:17
 */ 
public interface XmlDocument {
	/**
	* ����XML�ĵ�
	* @param fileName �ļ�ȫ·������
	*/
	public void createXml(String fileName);
	
	
	/**
	* ����XML�ĵ�
	* @param fileName �ļ�ȫ·������
	*/
	public void parserXml(String fileName);
}   
