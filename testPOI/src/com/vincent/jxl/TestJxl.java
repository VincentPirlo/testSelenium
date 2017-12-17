/**   
* @Title: TestJxl.java 
* @Package com.vincent.jxl 
* @Description: TODO
* @author Vincent  
* @date 2017年12月17日 下午10:22:35 
* @version V1.0   
*/ 
package com.vincent.jxl;

import java.io.File;
import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * @Function: 测试jxl.jar读取xls工作簿
 * @author: Vincent
 * @date: 2017年12月17日下午10:22:35
 */
public class TestJxl {
	public static String xls2String(File file) {
		String result = "";
		try {
			FileInputStream fis = new FileInputStream(file);
			StringBuilder sb = new StringBuilder();
			jxl.Workbook rwb = Workbook.getWorkbook(fis);
			Sheet[] sheet = rwb.getSheets();
			for(int i=0; i<sheet.length; i++) {
				Sheet rs = rwb.getSheet(i);
				for(int j=0; j<rs.getRows(); j++) {
					Cell[] cells = rs.getRow(j);
					for(int k=0; k<cells.length; k++) {
						sb.append(cells[k].getContents());
					}
				}
				fis.close();
				result += sb.toString();
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		File file = new File("D:\\test-workspace\\testPOI\\testjxl.xls");
		System.out.println(xls2String(file));
	}
}
