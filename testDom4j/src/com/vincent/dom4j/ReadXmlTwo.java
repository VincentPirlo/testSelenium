/**   
* @Title: ReadXmlTwo.java 
* @Package com.vincent.dom4j 
* @Description: TODO
* @author Vincent  
* @date 2018��1��2�� ����9:00:28 
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
 * @date: 2018��1��2������9:00:28
 */
public class ReadXmlTwo {
	public static void main(String[] args) {
		readStringXml();
	}
	
	public static void readStringXml() {
		try {
			//��ȡ������XML�ĵ�
			//SAXReader����һ���ܵ�����һ��������ʽ����xml�ļ�������
			SAXReader reader = new SAXReader();
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("readxmltwo.xml");
			Document doc = reader.read(in);
			Element rootElt = doc.getRootElement();	//��ȡ���ڵ�
			System.out.println("���ڵ㣺" + rootElt.getName());//�õ����ڵ������
			
			for(int i =0; i<rootElt.nodeCount(); i++) {
				Node node = rootElt.node(i);
				if(node instanceof Element) {
					Element elementTemp = (Element)node;
					System.out.println("�����ڵ�do: " + node.getName());	//�õ���һ�������ڵ������
					//ȡ�ö����ڵ�do��type��path���Ե�ֵ
					for(Iterator iter = elementTemp.attributeIterator(); iter.hasNext();) {
						Attribute item = (Attribute) iter.next();
						System.out.println("�����ڵ�do�ģ� " + item.getName() + "Ϊ" + item.getValue());//�õ������ڵ��path��type
					}
					
					//��ȡ�����ڵ��������ӽڵ�forward�������ڵ㣩
					for(Iterator iterroot2 = elementTemp.elementIterator(); iterroot2.hasNext();) {
						Element root22 = (Element) iterroot2.next();//�õ�һ�������ڵ�
						System.out.println("�����ڵ�forward�� " + root22.getName());
						System.out.println("�����ڵ�forward��ֵ�� " + root22.getText());//��ȡforward��ֵ
						
						List attrList = root22.attributes();//��ȡ�����ڵ������
						//������ȡ�����ڵ������
						for(Iterator iter = attrList.iterator(); iter.hasNext();) {
							Attribute item = (Attribute) iter.next();
							System.out.println("�����ڵ�forward�����ԣ� " + item.getName() + "Ϊ" + item.getValue());
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
