/**   
* @Title: GenerateXml.java 
* @Package com.vincent.tdom4j 
* @Description: TODO
* @author Vincent  
* @date 2018��1��3�� ����9:17:52 
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
 * @Function: ����xml�ĵ�
 * @author: Vincent
 * @date: 2018��1��3������9:17:52
 */
public class GenerateXml {
	
	/**
	 * @Function: ͨ��dom4j���÷�������xml�ĵ�
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
	 * @Function: ͨ���ַ�������xml�ĵ�
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
	 * @Function: ����������ļ�
	 * @param document
	 * @param outputxml
	 */
	public void saveDocument(Document document, File outputxml) {
		try {
			//������ʽ
			OutputFormat format = OutputFormat.createPrettyPrint();
			/*//������ʽ
			OutputFormat format1 = OutputFormat.createCompactFormat();
			//ָ��XML����
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
		genXml.saveDocument(document, new File("output.xml"));	//���ɵ��ļ���src����
	}
}
