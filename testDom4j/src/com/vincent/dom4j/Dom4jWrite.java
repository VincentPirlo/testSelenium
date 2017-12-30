/**   
* @Title: Dom4jTest1.java 
* @Package com.vincent.dom4j 
* @Description: TODO
* @author Vincent  
* @date 2017��12��30�� ����7:35:37 
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
 * @Function: dom4j���ѧϰ��ʹ��dom4j��ܴ���xml�ĵ����������
 * @author: Vincent
 * @date: 2017��12��30������7:35:37
 */
public class Dom4jWrite {
	public static void main(String[] args) throws Exception {
		//��һ�ַ�ʽ�������ĵ�����������Ԫ��
		//�����ĵ���ʹ��һ��Helper��
		Document document = DocumentHelper.createDocument();
		
		//�������ڵ㲢��ӽ��ĵ�
		Element root = DocumentHelper.createElement("student");
		document.setRootElement(root);
		
		//�ڶ��ַ�ʽ�������ĵ��������ĵ��ĸ�Ԫ�ؽڵ�
		Element root2 = DocumentHelper.createElement("student");
		Document document2 = DocumentHelper.createDocument(root2);
		
		//�������
		root2.addAttribute("name", "zhangsan");
		//����ӽڵ㣺add֮��ͷ������Ԫ��
		Element helloElement = root2.addElement("hello");
		Element worldElement = root2.addElement("world");
		
		helloElement.setText("hello text");
		worldElement.setText("world text");
		
		
		//��������������̨
		XMLWriter xmlWriter = new XMLWriter();
		xmlWriter.write(document);
		
		//�����������ļ�
		//��ʽ
		OutputFormat format = new OutputFormat("    ", true);	//��������Ϊ4���ո񣬲�������һ��Ϊtrue
		XMLWriter xmlWrite2 = new XMLWriter(new FileOutputStream("student.xml"), format);
		xmlWrite2.write(document2);
		
		//��һ�������ʽ���ǵ�Ҫ����flush()����������������ļ�����ʾ�հ�
		XMLWriter xmlWrite3 = new XMLWriter(new FileWriter("student2.xml"), format);
		xmlWrite3.write(document2);
		xmlWrite3.flush();		//close()����Ҳ����
	}
}
