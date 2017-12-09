/**   
* @Title: Client.java 
* @Package com.vincent.read.client 
* @Description: TODO
* @author Vincent  
* @date 2017年12月9日 下午10:51:03 
* @version V1.0   
*/ 
package com.vincent.read.client;

import java.io.IOException;
import java.util.List;

import com.vincent.read.common.Common;
import com.vincent.read.read.ReadExcel;
import com.vincent.read.stu.Student;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月9日下午10:51:03
 */
public class Client {
	public static void main(String[] args) throws IOException {
		String excel2003 = Common.STUDENT_INFO_XLS_PATH;
		String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
		
		List<Student> list = new ReadExcel().readExcel(excel2003);
		if(list != null) {
			for(Student student : list) {
				System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : " + student.getAge() + ", score : " + student.getScore());
			}
		}
		System.out.println("=======================================");
		
		List<Student> list1 = new ReadExcel().readExcel(excel2010);
		if(list1 != null) {
			for(Student student : list1) {
				System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : " + student.getAge() + ", score : " + student.getScore());
			}
		}
	}
}
