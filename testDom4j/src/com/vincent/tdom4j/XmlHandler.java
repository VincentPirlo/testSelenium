/**   
* @Title: XmlHandler.java 
* @Package com.vincent.tdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月4日 下午9:21:45 
* @version V1.0   
*/ 
package com.vincent.tdom4j;

import java.io.File;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;
import org.dom4j.io.SAXReader;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月4日下午9:21:45
 */
public class XmlHandler {
	public static void main(String[] args) {
		SAXReader saxReader = new SAXReader();
		File file = new File("students-gen.xml");
		try {
			saxReader.addHandler("/students/student", new StudentHandler());
			saxReader.read(file);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private static class StudentHandler implements ElementHandler {
		public void onStart(ElementPath path) {
			Element elt = path.getCurrent();
			System.out.println("Found student: " + elt.attribute("sn"));
			path.addHandler("name", new NameHandler());
		}
		
		public void onEnd(ElementPath path) {
			path.removeHandler("name");
		}
		
		private static class NameHandler implements ElementHandler {
			public void onStart(ElementPath path) {
				System.out.println("path: " + path.getPath());
			}
			
			public void onEnd(ElementPath path) {
				Element elt = path.getCurrent();
				System.out.println(elt.getName() + " : " + elt.getText());
			}
		}
	}
}
