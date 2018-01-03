/**   
* @Title: TraXml1.java 
* @Package com.vincent.tdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月3日 下午11:00:23 
* @version V1.0   
*/ 
package com.vincent.tdom4j;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ProcessingInstruction;
import org.dom4j.VisitorSupport;
import org.dom4j.io.SAXReader;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月3日下午11:00:23
 */
public class TraXml1 {
	
	private File inputXml;
	public TraXml1(File inputXml) {
		this.inputXml = inputXml;
	}
	
	public Document getDocument() {
		SAXReader saxReader = new SAXReader();
		Document document = null;
		try {
			document = saxReader.read(inputXml);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		return document;
	}
	
	public Element getRootElement() {
		return getDocument().getRootElement();
	}
	
	public void traversalDocumentByIterator() {
		Element root = getRootElement();
		//枚举根节点下所有子节点
		for(Iterator iter=root.elementIterator(); iter.hasNext();) {
			System.out.println("===================");
			Element element = (Element) iter.next();
			System.out.println(element.getName());
			
			//枚举属性
			for(Iterator ia=element.attributeIterator(); ia.hasNext();) {
				Attribute attribute = (Attribute) ia.next();
				System.out.println(attribute.getName() + ":" + attribute.getData());
			}
			
			//枚举当前节点下所有子节点
			for(Iterator ieson=element.elementIterator(); ieson.hasNext();) {
				Element elementSon = (Element) ieson.next();
				System.out.println(elementSon.getName() + ":" + elementSon.getText());
			}
		}
	}
	
	public void traversalDocumentByVisitor() {
		getDocument().accept(new MyVisitor());
	}
	
	private static class MyVisitor extends VisitorSupport {
		public void visit(Attribute node) {
			System.out.println("attribute: " + node.getName() + " = " + node.getValue());
		}
	}
	
	public void visit(ProcessingInstruction node) {
		System.out.println("PI: " + node.getTarget() + " " + node.getText());
	}
	
	
	public void visit(Element node) {
		if(node.isTextOnly()) {
			System.out.println("element: " + node.getName() + " = " + node.getText());
		} else {
			System.out.println("--------------" + node.getName() + "--------------");
		}
	}
	
	public static void main(String[] args) {
		TraXml1 traxml1 = new TraXml1(new File("students-gen.xml"));
		traxml1.traversalDocumentByIterator();
		//traxml1.traversalDocumentByVisitor();
	}
}
