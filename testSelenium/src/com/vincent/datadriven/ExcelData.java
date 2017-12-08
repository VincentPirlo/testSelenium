/**   
* @Title: ExcelData.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017年12月3日 下午3:16:03 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月3日下午3:16:03
 */

public class ExcelData implements Iterator<Object[]> {
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private int rowNum = 0;
	private int curRowNo = 0;
	private int columnNum = 0;
	private String[] columnName;
	
	public ExcelData(String filepath, String casename) {
		try {
			File directory = new File(".");
			String ss = "open.";
			
		}
	}
}
