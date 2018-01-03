/**   
* @Title: GenerateXml.java 
* @Package com.vincent.tdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018年1月3日 下午9:17:52 
* @version V1.0   
*/ 
package com.vincent.tdom4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * @Function: 生成xml文档
 * @author: Vincent
 * @date: 2018年1月3日下午9:17:52
 */
public class GenerateXml {
	
	/**
	 * @Function: 通过dom4j内置方法生成xml文档
	 * @return
	 */
	public Document generateDocumentByMethod() {
		Document document = DocumentHelper.createDocument();
		//processing Instruction
		Map<String, String> inMap = new HashMap<String, String>();
		inMap.put("type", "text/xsl");
		inMap.put("href", "tstudents.xsl");
		document.addProcessingInstruction("xml-stylesheet", inMap);
		//root element
		Element studentsElement = document.addElement("students");
		studentsElement.addComment("An student catalog");
		//son element
		Element stuElement = studentsElement.addElement("student");
		stuElement.addAttribute("sn", "01");
		Element nameElement = studentsElement.addElement("name");
		nameElement.setText("sam");
		Element ageElement = stuElement.addElement("age");
		ageElement.setText("18");
		//son element
		Element anotherStuElement = studentsElement.addElement("student");
		anotherStuElement.addAttribute("sn", "02");
		Element anotherNameElement = anotherStuElement.addElement("name");
		anotherNameElement.setText("lin");
		Element anotherAgeElement = anotherStuElement.addElement("age");
		anotherAgeElement.setText("20");
		
		return document;
	}
	
	/**
	 * @Function: 通过字符串生成xml文档
	 * @return
	 */
	public Document generateDocumentByString() {
		 String text = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
	              "<?xml-stylesheet type=\"text/xsl\" href=\"students.xsl\"?>" +
	              "<students><!--An Student Catalog-->   <student sn=\"01\">" +
	              "<name>sam</name><age>18</age></student><student sn=\"02\">" +
	              "<name>lin</name><age>20</age></student></students>";
		 Document document = null;
		 try {
			 document = DocumentHelper.parseText(text);
		 } catch (DocumentException e) {
			 e.printStackTrace();
		 }
		 return document;
	}
	
	
	/**
	 * @Function: 输出并保存文件
	 * @param document
	 * @param outputxml
	 */
	public void saveDocument(Document document, File outputxml) {
		try {
			//美化格式
			OutputFormat format = OutputFormat.createPrettyPrint();
			/*//缩减格式
			OutputFormat format1 = OutputFormat.createCompactFormat();
			//指定XML编码
			format.setEncoding("UTF-8");*/
			XMLWriter output = new XMLWriter(new FileWriter(outputxml), format);
			output.write(document);
			output.close();
			System.out.println("OK");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		GenerateXml genXml = new GenerateXml();
		Document document = null;
		document = genXml.generateDocumentByMethod();
		//document = genXml.generateDocumentByString();
		genXml.saveDocument(document, new File("output.xml"));	//生成的文件与src并行
	}
}
