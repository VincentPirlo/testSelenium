/**   
* @Title: ReadXmlTwo.java 
* @Package com.vincent.dom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月2日 下午9:00:28 
* @version V1.0   
*/ 
package com.vincent.dom4j;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月2日下午9:00:28
 */
public class ReadXmlTwo {
	public static void main(String[] args) {
		readStringXml();
	}
	
	public static void readStringXml() {
		try {
			//读取并解析XML文档
			//SAXReader就是一个管道，用一个流动方式，把xml文件读出来
			SAXReader reader = new SAXReader();
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("readxmltwo.xml");
			Document doc = reader.read(in);
			Element rootElt = doc.getRootElement();	//获取根节点
			System.out.println("根节点：" + rootElt.getName());//拿到根节点的名称
			
			for(int i =0; i<rootElt.nodeCount(); i++) {
				Node node = rootElt.node(i);
				if(node instanceof Element) {
					Element elementTemp = (Element)node;
					System.out.println("二级节点do: " + node.getName());	//拿到第一个二级节点的名称
					//取得二级节点do的type和path属性的值
					for(Iterator iter = elementTemp.attributeIterator(); iter.hasNext();) {
						Attribute item = (Attribute) iter.next();
						System.out.println("二级节点do的： " + item.getName() + "为" + item.getValue());//拿到二级节点的path和type
					}
					
					//获取二级节点的下面的子节点forward（三级节点）
					for(Iterator iterroot2 = elementTemp.elementIterator(); iterroot2.hasNext();) {
						Element root22 = (Element) iterroot2.next();//得到一个二级节点
						System.out.println("三级节点forward： " + root22.getName());
						System.out.println("三级节点forward的值： " + root22.getText());//获取forward的值
						
						List attrList = root22.attributes();//获取三级节点的属性
						//遍历获取三级节点的属性
						for(Iterator iter = attrList.iterator(); iter.hasNext();) {
							Attribute item = (Attribute) iter.next();
							System.out.println("三级节点forward的属性： " + item.getName() + "为" + item.getValue());
						}
					}
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
