/**   
* @Title: TestOperation.java 
* @Package com.vincent.testdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月2日 下午11:22:16 
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
 * @date: 2018年1月2日下午11:22:16
 */
public class TestOperation {
	
	public static void main(String[] args) throws Exception {
		testGetRoot();
	}
	
	
	/**
	 * @Function: 获取文件的document对象，然后获取对应的根节点
	 */
	public static void testGetRoot() throws Exception { 
		//创建一个SAXReader对象
		SAXReader sax = new SAXReader();
		//根据指定的路径创建file对象
		File xmlFile = new File("D:\\test-workspace\\testDom4j\\src\\testoperation.xml");
		//获取document对象，如果文档无节点，则会抛出Exception提前结束
		Document document = sax.read(xmlFile);
		//获取根节点
		Element root = document.getRootElement();
		//this.getNodes(root);//从根节点开始遍历所有节点
		//对指定名字的节点进行属性的添加删除修改
		editAttribute(root, "user");
		//对指定的节点新增名为newNode的子节点，并指定新增节点的内容
		addNode(root, "newNode", "新增节点的内容");
		//把改变的内存中的document真正保存到指定的文件中
		saveDocument(document, xmlFile);
	}
	
	/**
	 * @Function: 对指定的节点属性进行删除、添加、修改
	 * @param root
	 * @param nodeName
	 */
	public static void editAttribute(Element root, String nodeName) {
		//获取指定名字的节点，无此节点的会报NullPointerException
		Element node = root.element("user");
		//获取此节点指定的属性，无此节点的会报NullPointerException
		Attribute attr = node.attribute("editor");
		//删除此属性
		node.remove(attr);
		
		//获取此节点的指定属性
		Attribute attrDate = node.attribute("date");
		//更改此属性值
		attrDate.setValue("更改");
		
		//添加属性
		node.addAttribute("add", "增加");
	}
	
	
	/**
	 * @Function: 对指定的节点添加子节点和对象的文本内容
	 * @param node
	 * @param nodeName
	 * @param content
	 */
	public static void addNode(Element node, String nodeName, String content) {
		//对指定的节点node新增子节点，名为nodeName
		Element newNode = node.addElement(nodeName);
		//对新增的节点添加文本内容content
		newNode.setText(content);
	}
	
	
	public static void saveDocument(Document document, File xmlFile) throws IOException {
		//创建输出流
		Writer osWrite = new OutputStreamWriter(new FileOutputStream(xmlFile));
		//获取输出的指定格式
		OutputFormat format = OutputFormat.createPrettyPrint();
		//设置编码，确保解析的xml为UTF-8格式
		format.setEncoding("UTF-8");
		//XMLWriter指定输出文件以及格式
		XMLWriter writer = new XMLWriter();
		//把document写入xmlFile指定的文件（可以为被解析的文件或者新创建的文件）
		writer.write(document);
		writer.flush();
		writer.close();
	}
}
