/**   
* @Title: Dom4jTest1.java 
* @Package com.vincent.dom4j 
* @Description: TODO
* @author Vincent  
* @date 2017年12月30日 下午7:35:37 
* @version V1.0   
*/ 
package com.vincent.dom4j;

import java.io.FileOutputStream;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * @Function: dom4j框架学习，使用dom4j框架创建xml文档并输出保存
 * @author: Vincent
 * @date: 2017年12月30日下午7:35:37
 */
public class Dom4jWrite {
	public static void main(String[] args) throws Exception {
		//第一种方式：创建文档，并创建根元素
		//创建文档：使用一个Helper类
		Document document = DocumentHelper.createDocument();
		
		//创建根节点并添加进文档
		Element root = DocumentHelper.createElement("student");
		document.setRootElement(root);
		
		//第二种方式：创建文档并设置文档的根元素节点
		Element root2 = DocumentHelper.createElement("student");
		Document document2 = DocumentHelper.createDocument(root2);
		
		//添加属性
		root2.addAttribute("name", "zhangsan");
		//添加子节点：add之后就返回这个元素
		Element helloElement = root2.addElement("hello");
		Element worldElement = root2.addElement("world");
		
		helloElement.setText("hello text");
		worldElement.setText("world text");
		
		
		//输出：输出到控制台
		XMLWriter xmlWriter = new XMLWriter();
		xmlWriter.write(document);
		
		//输出：输出到文件
		//格式
		OutputFormat format = new OutputFormat("    ", true);	//设置缩进为4个空格，并且另起一行为true
		XMLWriter xmlWrite2 = new XMLWriter(new FileOutputStream("student.xml"), format);
		xmlWrite2.write(document2);
		
		//另一种输出方式，记得要调用flush()方法，否则输出的文件中显示空白
		XMLWriter xmlWrite3 = new XMLWriter(new FileWriter("student2.xml"), format);
		xmlWrite3.write(document2);
		xmlWrite3.flush();		//close()方法也可以
	}
}
