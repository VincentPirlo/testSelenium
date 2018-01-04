/**   
* @Title: XmlDocument.java 
* @Package com.vincent.fourdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月4日 下午11:27:17 
* @version V1.0   
*/ 
package com.vincent.fourdom4j;

/**
 * @Function: 定义XML文档建立与解析的接口
 * @author: Vincent
 * @date: 2018年1月4日下午11:27:17
 */ 
public interface XmlDocument {
	/**
	* 建立XML文档
	* @param fileName 文件全路径名称
	*/
	public void createXml(String fileName);
	
	
	/**
	* 解析XML文档
	* @param fileName 文件全路径名称
	*/
	public void parserXml(String fileName);
}   
