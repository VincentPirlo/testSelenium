/**   
* @Title: Common.java 
* @Package com.vincent.read.common 
* @Description: TODO
* @author Vincent  
* @date 2017年12月9日 下午9:56:51 
* @version V1.0   
*/ 
package com.vincent.read.common;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月9日下午9:56:51
 */
public class Common {
	public static final String OFFICE_EXCEL_2003_POSTFIX = "xls";
	public static final String OFFICE_EXCEL_2010_POSTFIX = "xlsx";
	
	public static final String EMPTY = "";
	public static final String POINT = ".";
	public static final String HOME_PATH = "D:\\test-workspace\\testPOI\\src\\com\\vincent\\read";
	public static final String STUDENT_INFO_XLS_PATH = HOME_PATH + "\\student_info" + POINT + OFFICE_EXCEL_2003_POSTFIX;
	public static final String STUDENT_INFO_XLSX_PATH = HOME_PATH + "\\student_info" + POINT + OFFICE_EXCEL_2010_POSTFIX;
	public static final String NOT_EXCLE_FILE = ": Not the Excel file!";
	public static final String PROCESSING = "Processing...";
}
