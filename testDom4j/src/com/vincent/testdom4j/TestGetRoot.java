/**   
* @Title: TestGetRoot.java 
* @Package com.vincent.testdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018��1��2�� ����10:32:23 
* @version V1.0   
*/ 
package com.vincent.testdom4j;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @Function: �ݹ�������нڵ������
 * @author: Vincent
 * @date: 2018��1��2������10:32:23
 */
public class TestGetRoot {
	public static void main(String[] args) throws Exception {
		getRoot();
	}
	
	/**
	 * @Function: ��ȡ�ļ���document����Ȼ���ȡ��Ӧ�ĸ��ڵ�
	 * @throws Exception
	 */
	public static void getRoot() throws Exception {
		//����һ��SAXReader����
		SAXReader sax = new SAXReader();
		//����ָ����·������file����
		File xmlFile = new File("D:\\test-workspace\\testDom4j\\src\\testgetroot.xml");
		//��ȡdocument��������ĵ��޽ڵ㣬����׳�Exception
		Document document = sax.read(xmlFile);
		//��ȡ���ڵ�
		Element rootElement = document.getRootElement();
		getNodes(rootElement);
	}
	
	/**
	 * @Function: ��ָ���ڵ㿪ʼ���ݹ���������ӽڵ�
	 * @param node
	 */
	public static void getNodes(Element node) {
		System.out.println("-----------------------");
		
		//��ǰ�ڵ�����ơ��ı����ݺ�����
		System.out.println("��ǰ�ڵ����ƣ�" + node.getName());//��ǰ�ڵ�����
		System.out.println("��ǰ�ڵ�����ݣ�" + node.getTextTrim());//��ǰ�ڵ�����
		List<Attribute> listAttr = node.attributes();//��ǰ�ڵ���������Ե�list
		for(Attribute attr:listAttr) {
			String name = attr.getName();
			String value = attr.getValue();
			System.out.println("�������ƣ�" + name + "����ֵ��" + value);
		}
		
		//�ݹ������ǰ�ڵ����е��ӽڵ�
		List<Element> listElement = node.elements();//����һ���ӽڵ��list
		for(Element e:listElement) {//��������һ���ӽڵ�
			getNodes(e);//�ݹ�
		}
	}
}
