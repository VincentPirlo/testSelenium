/**   
* @Title: TestOperation.java 
* @Package com.vincent.testdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018��1��2�� ����11:22:16 
* @version V1.0   
*/ 
package com.vincent.testdom4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018��1��2������11:22:16
 */
public class TestOperation {
	
	public static void main(String[] args) throws Exception {
		testGetRoot();
	}
	
	
	/**
	 * @Function: ��ȡ�ļ���document����Ȼ���ȡ��Ӧ�ĸ��ڵ�
	 */
	public static void testGetRoot() throws Exception { 
		//����һ��SAXReader����
		SAXReader sax = new SAXReader();
		//����ָ����·������file����
		File xmlFile = new File("D:\\test-workspace\\testDom4j\\src\\testoperation.xml");
		//��ȡdocument��������ĵ��޽ڵ㣬����׳�Exception��ǰ����
		Document document = sax.read(xmlFile);
		//��ȡ���ڵ�
		Element root = document.getRootElement();
		//this.getNodes(root);//�Ӹ��ڵ㿪ʼ�������нڵ�
		//��ָ�����ֵĽڵ�������Ե����ɾ���޸�
		editAttribute(root, "user");
		//��ָ���Ľڵ�������ΪnewNode���ӽڵ㣬��ָ�������ڵ������
		addNode(root, "newNode", "�����ڵ������");
		//�Ѹı���ڴ��е�document�������浽ָ�����ļ���
		saveDocument(document, xmlFile);
	}
	
	/**
	 * @Function: ��ָ���Ľڵ����Խ���ɾ������ӡ��޸�
	 * @param root
	 * @param nodeName
	 */
	public static void editAttribute(Element root, String nodeName) {
		//��ȡָ�����ֵĽڵ㣬�޴˽ڵ�ĻᱨNullPointerException
		Element node = root.element("user");
		//��ȡ�˽ڵ�ָ�������ԣ��޴˽ڵ�ĻᱨNullPointerException
		Attribute attr = node.attribute("editor");
		//ɾ��������
		node.remove(attr);
		
		//��ȡ�˽ڵ��ָ������
		Attribute attrDate = node.attribute("date");
		//���Ĵ�����ֵ
		attrDate.setValue("����");
		
		//�������
		node.addAttribute("add", "����");
	}
	
	
	/**
	 * @Function: ��ָ���Ľڵ�����ӽڵ�Ͷ�����ı�����
	 * @param node
	 * @param nodeName
	 * @param content
	 */
	public static void addNode(Element node, String nodeName, String content) {
		//��ָ���Ľڵ�node�����ӽڵ㣬��ΪnodeName
		Element newNode = node.addElement(nodeName);
		//�������Ľڵ�����ı�����content
		newNode.setText(content);
	}
	
	
	public static void saveDocument(Document document, File xmlFile) throws IOException {
		//���������
		Writer osWrite = new OutputStreamWriter(new FileOutputStream(xmlFile));
		//��ȡ�����ָ����ʽ
		OutputFormat format = OutputFormat.createPrettyPrint();
		//���ñ��룬ȷ��������xmlΪUTF-8��ʽ
		format.setEncoding("UTF-8");
		//XMLWriterָ������ļ��Լ���ʽ
		XMLWriter writer = new XMLWriter();
		//��documentд��xmlFileָ�����ļ�������Ϊ���������ļ������´������ļ���
		writer.write(document);
		writer.flush();
		writer.close();
	}
}
