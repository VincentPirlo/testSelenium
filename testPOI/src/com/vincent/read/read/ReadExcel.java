/**   
* @Title: ReadExcel.java 
* @Package com.vincent.read.read 
* @Description: TODO
* @author Vincent  
* @date 2017年12月9日 下午10:07:16 
* @version V1.0   
*/ 
package com.vincent.read.read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.vincent.read.common.Common;
import com.vincent.read.stu.Student;
import com.vincent.read.util.Util;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月9日下午10:07:16
 */
public class ReadExcel {
	
	/**
	 * @Function: TODO
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public List<Student> readExcel(String path) throws IOException {
		if(path == null || Common.EMPTY.endsWith(path)) {
			return null;
		} else {
			String postfix = Util.getPostfix(path);
			if(!Common.EMPTY.equals(postfix) ) {
				if(Common.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
					return readXls(path);
				} else if(Common.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
					return readXlsx(path);
				}
			} else {
				System.out.println(path + Common.NOT_EXCLE_FILE);
			}
		}
		return null;
	}
	
	/**
	 * @Function: TODO
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public List<Student> readXlsx(String path) throws IOException {
		System.out.println(Common.PROCESSING + path);
		InputStream is = new FileInputStream(path);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
		Student student = null;
		List<Student> list = new ArrayList<Student>();
		for(int numSheet=0; numSheet<xssfWorkbook.getNumberOfSheets(); numSheet++) {
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
			if(xssfSheet == null) {
				continue;
			}
			for(int rowNum=1; rowNum<=xssfSheet.getLastRowNum(); rowNum++) {
				XSSFRow xssfRow = xssfSheet.getRow(rowNum);
				if(xssfRow != null) {
					student = new Student();
					XSSFCell no = xssfRow.getCell(0);
					XSSFCell name = xssfRow.getCell(1);
					XSSFCell age = xssfRow.getCell(2);
					XSSFCell score = xssfRow.getCell(3);
					student.setNo(getValue(no));
					student.setName(getValue(name));
					student.setAge(getValue(age));
					student.setScore(Float.valueOf(getValue(score)));
					list.add(student);
				}
			}
		}
		return list;
	}
	
	/**
	 * @Function: TODO
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public List<Student> readXls(String path) throws IOException {
		System.out.println(Common.PROCESSING + path);
		InputStream is = new FileInputStream(path);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		Student student = null;
		List<Student> list = new ArrayList<Student>();
		for(int numSheet = 0; numSheet<hssfWorkbook.getNumberOfSheets(); numSheet++) {
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if(hssfSheet == null) {
				continue;
			}
			for(int rowNum = 1; rowNum<=hssfSheet.getLastRowNum(); rowNum++) {
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if(hssfRow != null) {
					student = new Student();
					HSSFCell no = hssfRow.getCell(0);
					HSSFCell name = hssfRow.getCell(1);
					HSSFCell age = hssfRow.getCell(2);
					HSSFCell score = hssfRow.getCell(3);
					student.setNo(getValue(no));
					student.setName(getValue(name));
					student.setAge(getValue(age));
					student.setScore(Float.valueOf(getValue(score)));
					list.add(student);
				}
			}
		}
		return list;
	}
	
	@SuppressWarnings("static-access")
	private String getValue(XSSFCell xssfRow) {
		if(xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
			return String.valueOf(xssfRow.getBooleanCellValue());
		} else if(xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
			return String.valueOf(xssfRow.getNumericCellValue());
		} else {
			return String.valueOf(xssfRow.getStringCellValue());
		}
	}
	
	@SuppressWarnings("static-access")
	private String getValue(HSSFCell hssfCell) {
		if(hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(hssfCell.getBooleanCellValue());
		} else if(hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
			return String.valueOf(hssfCell.getNumericCellValue());
		} else {
			return String.valueOf(hssfCell.getStringCellValue());
		}
	}
}
