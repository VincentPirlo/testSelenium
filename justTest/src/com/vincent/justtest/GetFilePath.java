/**   
* @Title: GetFilePath.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018年1月6日 下午6:42:02 
* @version V1.0   
*/ 
package com.vincent.justtest;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @Function: 获取文件路径的方法
 * @author: Vincent
 * @date: 2018年1月6日下午6:42:02
 */
public class GetFilePath {
	
	//第一种的第一种形式：获取当前类(.class文件)的所在工程路径
	public void getPathOne() {
		File fileone = new File(this.getClass().getResource("/").getPath());
		System.out.println(fileone);
	}
	
	//第一种的第二种形式：获取当前类(.class文件)的绝对路径
	public void getPathOne2() {
		File fileone = new File(this.getClass().getResource("").getPath());
		System.out.println(fileone);
	}
	
	//第二种：获取当前类的所在工程路径
	public void getPathTwo() throws IOException {
		File directory = new File("");	//参数为空
		String courseFile = directory.getCanonicalPath();
		System.out.println(courseFile);
	}
	
	//第三种：获取当前工程src目录下testpath.txt文件的路径
	public void getPathThree() {
		URL xmlPath = this.getClass().getClassLoader().getResource("testpath.txt");
		System.out.println(xmlPath);
	}
	
	//第四种：获取当前工程路径
	public void getPathFour() {
		System.out.println(System.getProperty("user.dir"));
	}
	
	//第五种：
	public void getPathFive() {
		System.out.println(System.getProperty("java.class.path"));
	}
	
	
	
}
