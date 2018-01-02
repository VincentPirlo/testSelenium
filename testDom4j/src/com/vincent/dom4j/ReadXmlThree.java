/**   
* @Title: ReadXmlThree.java 
* @Package com.vincent.dom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月2日 下午9:49:24 
* @version V1.0   
*/ 
package com.vincent.dom4j;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月2日下午9:49:24
 */
public class ReadXmlThree {
	public static void main(String[] args) {
		readxml();
	}
	
	public static void readxml() {
		SAXReader reader = new SAXReader();
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("readxmlthree.xml");
		
		try {
			Document doc = reader.read(in);
			Element root = doc.getRootElement();//获取根节点
			List<Element> list = new ArrayList<Element>();
			list.add(root);
			while(list != null) {
				Element element = null;
				Element ele = null;
				
				Iterator ite = list.iterator();
				if(ite.hasNext()) {
					ele = (Element) ite.next();
					ite.remove();
				}
				if(ele != null) {
					for(Iterator i=ele.elementIterator(); (i!=null) && (i.hasNext());) {
						element = (Element) i.next();
						list.add(element);
						if(element != null) {
							System.out.println(element.getName() + " : " + element.getPath() + "--" + element.getText());
							for(Iterator iter=element.attributeIterator(); iter.hasNext();) {
								Attribute item = (Attribute) iter.next();
								System.out.println(item.getName() + "为" + item.getValue());
							}
						}
					}
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
