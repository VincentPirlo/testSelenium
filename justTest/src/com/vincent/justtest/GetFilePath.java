/**   
* @Title: GetFilePath.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018��1��6�� ����6:42:02 
* @version V1.0   
*/ 
package com.vincent.justtest;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @Function: ��ȡ�ļ�·���ķ���
 * @author: Vincent
 * @date: 2018��1��6������6:42:02
 */
public class GetFilePath {
	
	//��һ�ֵĵ�һ����ʽ����ȡ��ǰ��(.class�ļ�)�����ڹ���·��
	public void getPathOne() {
		File fileone = new File(this.getClass().getResource("/").getPath());
		System.out.println(fileone);
	}
	
	//��һ�ֵĵڶ�����ʽ����ȡ��ǰ��(.class�ļ�)�ľ���·��
	public void getPathOne2() {
		File fileone = new File(this.getClass().getResource("").getPath());
		System.out.println(fileone);
	}
	
	//�ڶ��֣���ȡ��ǰ������ڹ���·��
	public void getPathTwo() throws IOException {
		File directory = new File("");	//����Ϊ��
		String courseFile = directory.getCanonicalPath();
		System.out.println(courseFile);
	}
	
	//�����֣���ȡ��ǰ����srcĿ¼��testpath.txt�ļ���·��
	public void getPathThree() {
		URL xmlPath = this.getClass().getClassLoader().getResource("testpath.txt");
		System.out.println(xmlPath);
	}
	
	//�����֣���ȡ��ǰ����·��
	public void getPathFour() {
		System.out.println(System.getProperty("user.dir"));
	}
	
	//�����֣�
	public void getPathFive() {
		System.out.println(System.getProperty("java.class.path"));
	}
	
	
	
}
