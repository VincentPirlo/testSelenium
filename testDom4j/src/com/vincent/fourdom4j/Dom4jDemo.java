/**   
* @Title: Dom4jDemo.java 
* @Package com.vincent.fourdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月5日 下午10:31:53 
* @version V1.0   
*/ 
package com.vincent.fourdom4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.xml.sax.SAXException;

/**
 * @Function: Dom4j生成XML文档与解析XML文档
 * @author: Vincent
 * @date: 2018年1月5日下午10:31:53
 */
public class Dom4jDemo implements XmlDocument {
	
	public void createXml(String fileName) {
		Document document = DocumentHelper.createDocument();
		Element employees = document.addElement("employees");
		Element employee = employees.addElement("employee");
		Element name = employee.addElement("name");
		name.setText("ddvip");
		Element sex = employee.addElement("sex");
		sex.setText("m");
		Element age = employee.addElement("age");
		age.setText("29");
		try {
			Writer fileWriter = new FileWriter(fileName);
			XMLWriter xmlWriter = new XMLWriter(fileWriter);
			xmlWriter.write(document);
			xmlWriter.flush();
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void parserXml(String fileName) {
		File inputXml = new File(fileName);
		SAXReader saxReader = new SAXReader();
		try {
			Document document = saxReader.read(inputXml);
			Element employees = document.getRootElement();
			for(Iterator i=employees.elementIterator(); i.hasNext();) {
				Element employee = (Element) i.next();
				for(Iterator j=employee.elementIterator(); j.hasNext();) {
					Element node = (Element) j.next();
					System.out.println(node.getName() + ":" + node.getText());
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		System.out.println("dom4j parseXml");
	}
}
