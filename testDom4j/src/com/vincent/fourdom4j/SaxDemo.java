/**   
* @Title: SaxDemo.java 
* @Package com.vincent.fourdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018��1��5�� ����10:12:02 
* @version V1.0   
*/ 
package com.vincent.fourdom4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @Function: SAX�ĵ�������createXml����δ��ɣ�
 * @author: Vincent
 * @date: 2018��1��5������10:12:02
 */
public class SaxDemo implements XmlDocument {
	
	public void createXml(String fileName) {
		System.out.println("<<" + fileName + ">>");
	}
	
	public void parserXml(String fileName) {
		SAXParserFactory saxfac = SAXParserFactory.newInstance();
		try {
			SAXParser saxparser = saxfac.newSAXParser();
			InputStream is = new FileInputStream(fileName);
			saxparser.parse(is, new MySAXHandler());
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
	
	
	class MySAXHandler extends DefaultHandler {
		boolean hasAttribute = false;
		Attributes attributes = null;
		
		public void startDocument() throws SAXException {
			System.out.println("�ĵ���ʼ��ӡ��");
		}
		
		public void endDocument() throws SAXException {
			System.out.println("�ĵ���ӡ������");
		}
		
		public void startElement(String url, String localName, String qName, Attributes attributes) throws SAXException {
			if(qName.equals("employees")) {
				return;
			}
			if(qName.equals("employee")) {
				System.out.println(qName);
			}
			if(attributes.getLength()>0) {
				this.attributes = attributes;
				this.hasAttribute = true;
			}
		}
		
		public void endElement(String url, String localName, String qName) throws SAXException {
			if(hasAttribute && (attributes != null)) {
				for(int i=0; i<attributes.getLength(); i++) {
					System.out.println(attributes.getQName(0) + attributes.getValue(0));
				}
			}
		}
		
		public void characters(char[] ch, int start, int length) throws SAXException {
			System.out.println(new String(ch, start, length));
		}
	}
}