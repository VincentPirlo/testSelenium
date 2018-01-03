/**   
* @Title: ModifyXml.java 
* @Package com.vincent.tdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018��1��3�� ����9:48:50 
* @version V1.0   
*/ 
package com.vincent.tdom4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * @Function: �޸�xml�ĵ�
 * @author: Vincent
 * @date: 2018��1��3������9:48:50
 */
public class ModifyXml {

	public void modifyDocument(File inputXml) {
		try {
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read(inputXml);
			List list = document.selectNodes("//students/student/@sn");
			//System.out.println(list.size());
			Iterator iter  = list.iterator();
			while(iter.hasNext()) {
				Attribute attribute = (Attribute) iter.next();
				if(attribute.getValue().equals("01")) {
					attribute.setValue("001");
				}
				
				list = document.selectNodes("//students/student");
				iter = list.iterator();
				while(iter.hasNext()) {
					Element element = (Element) iter.next();
					Iterator iterator = element.elementIterator("name");
					while(iterator.hasNext()) {
						Element nameElement = (Element) iterator.next();
						if(nameElement.getText().equals("sam")) {
							nameElement.setText("jeff");
						}
					}
					
					XMLWriter output = new XMLWriter(new FileWriter(new File("students-modified.xml")));
					output.write(document);
					output.flush();
					output.close();
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ModifyXml modifyxml = new ModifyXml();
		modifyxml.modifyDocument(new File("students-gen.xml"));//��src����  ���ɵ�students-modified.xmlҲ��src����
		System.out.println("modify success!");
	}
}
