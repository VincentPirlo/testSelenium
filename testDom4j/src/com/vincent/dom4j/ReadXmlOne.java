/**   
* @Title: ReadXmlOne.java 
* @Package com.vincent.dom4j 
* @Description: TODO
* @author Vincent  
* @date 2018��1��2�� ����7:52:26 
* @version V1.0   
*/ 
package com.vincent.dom4j;

import java.io.InputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @Function: ��ȡ����xml�ļ��������Ϣ������̨
 * @author: Vincent
 * @date: 2018��1��2������7:52:26
 */
public class ReadXmlOne {
	public static void main(String[] args) {
		read();
	}
	
	
	public static void read() {
		try {
			//��ȡ������XML�ĵ�
			//SAXReader����һ���ܵ�����һ�����ķ�ʽ����xml�ļ�������
			SAXReader reader = new SAXReader();
			//readxmlone.xml��Ҫ����srcĿ¼��
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("readxmlone.xml");
			
			Document doc = reader.read(in);
			//��ȡ���ڵ�
			Element rootElt = doc.getRootElement();
			//��ȡdo�ڵ�
			Element doElement = rootElt.element("do");
			//��ȡdo�ڵ��µ�����
			String path = doElement.attributeValue("path");
			String type = doElement.attributeValue("type");
			//��ȡforward�ڵ�
			Element forwardElement = doElement.element("forward");
			//��ȡforward�ڵ��е����Ժ��ı�ֵ
			String name = forwardElement.attributeValue("name");
			String value = forwardElement.getText();
			
			System.out.println("���ڵ㣺" + rootElt.getName());
			System.out.println("do�ڵ㣺" + doElement.getName());
			System.out.println("do�ڵ������path��type�ֱ�Ϊ��" + path + "��" + type);
			System.out.println("forwart�ڵ㣺" + forwardElement.getName());
			System.out.println("forward�ڵ�����nameΪ��" + name);
			System.out.println("forward�ڵ���ı�ֵΪ��" + value);
			
					
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
