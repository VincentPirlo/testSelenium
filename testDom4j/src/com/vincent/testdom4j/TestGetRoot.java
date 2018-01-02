/**   
* @Title: TestGetRoot.java 
* @Package com.vincent.testdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月2日 下午10:32:23 
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
 * @Function: 递归遍历所有节点和属性
 * @author: Vincent
 * @date: 2018年1月2日下午10:32:23
 */
public class TestGetRoot {
	public static void main(String[] args) throws Exception {
		getRoot();
	}
	
	/**
	 * @Function: 获取文件的document对象，然后获取对应的根节点
	 * @throws Exception
	 */
	public static void getRoot() throws Exception {
		//创建一个SAXReader对象
		SAXReader sax = new SAXReader();
		//根据指定的路径创建file对象
		File xmlFile = new File("D:\\test-workspace\\testDom4j\\src\\testgetroot.xml");
		//获取document对象，如果文档无节点，则会抛出Exception
		Document document = sax.read(xmlFile);
		//获取根节点
		Element rootElement = document.getRootElement();
		getNodes(rootElement);
	}
	
	/**
	 * @Function: 从指定节点开始，递归遍历所有子节点
	 * @param node
	 */
	public static void getNodes(Element node) {
		System.out.println("-----------------------");
		
		//当前节点的名称、文本内容和属性
		System.out.println("当前节点名称：" + node.getName());//当前节点名称
		System.out.println("当前节点的内容：" + node.getTextTrim());//当前节点内容
		List<Attribute> listAttr = node.attributes();//当前节点的所有属性的list
		for(Attribute attr:listAttr) {
			String name = attr.getName();
			String value = attr.getValue();
			System.out.println("属性名称：" + name + "属性值：" + value);
		}
		
		//递归遍历当前节点所有的子节点
		List<Element> listElement = node.elements();//所有一级子节点的list
		for(Element e:listElement) {//遍历所有一级子节点
			getNodes(e);//递归
		}
	}
}
