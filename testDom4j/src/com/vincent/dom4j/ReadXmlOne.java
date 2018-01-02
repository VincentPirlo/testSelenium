/**   
* @Title: ReadXmlOne.java 
* @Package com.vincent.dom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月2日 下午7:52:26 
* @version V1.0   
*/ 
package com.vincent.dom4j;

import java.io.InputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @Function: 读取解析xml文件并输出信息到控制台
 * @author: Vincent
 * @date: 2018年1月2日下午7:52:26
 */
public class ReadXmlOne {
	public static void main(String[] args) {
		read();
	}
	
	
	public static void read() {
		try {
			//读取并解析XML文档
			//SAXReader就是一个管道，用一个流的方式，把xml文件读出来
			SAXReader reader = new SAXReader();
			//readxmlone.xml需要放在src目录下
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("readxmlone.xml");
			
			Document doc = reader.read(in);
			//获取根节点
			Element rootElt = doc.getRootElement();
			//获取do节点
			Element doElement = rootElt.element("do");
			//获取do节点下的属性
			String path = doElement.attributeValue("path");
			String type = doElement.attributeValue("type");
			//获取forward节点
			Element forwardElement = doElement.element("forward");
			//获取forward节点中的属性和文本值
			String name = forwardElement.attributeValue("name");
			String value = forwardElement.getText();
			
			System.out.println("根节点：" + rootElt.getName());
			System.out.println("do节点：" + doElement.getName());
			System.out.println("do节点的属性path和type分别为：" + path + "、" + type);
			System.out.println("forwart节点：" + forwardElement.getName());
			System.out.println("forward节点属性name为：" + name);
			System.out.println("forward节点的文本值为：" + value);
			
					
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
