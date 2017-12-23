/**   
* @Title: ExcelUtil.java 
* @Package com.vincent.pageobject1.util 
* @Description: TODO
* @author Vincent  
* @date 2017年12月23日 下午11:14:10 
* @version V1.0   
*/
package com.vincent.pageobject1.util;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: 此类是实现操作指定Excel文件中的指定sheet页、读取指定的单元格内容、获取sheet中最后一行的行号的功能
 * @author: Vincent
 * @date: 2017年12月23日下午11:14:10
 */
public class ExcelUtil {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell cell;

	// 设定要读写的Excel文件的路径和sheet名称
	// 在读、写Excel文件时，均需先调用此方法，设定要操作的Excel文件路径和要操作的sheet名称
	public static void setExcelFile(String filePath, String sheetName) {
		FileInputStream ExcelFile;

		try {
			// 实例化Excel文件的FileInputStream对象
			ExcelFile = new FileInputStream(filePath);

			// 实例化Excel文件的XSSFWorkbook对象
			ExcelWBook = new XSSFWorkbook(ExcelFile);

			// 实例化XSSFCell对象，指定Excel文件中的sheet名称，后续用于sheet找那个行、列和单元格的操作
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 读取excel文件中指定单元格的函数
	public static String getCellData(int rowNum, int colNum) throws Exception {
		try {
			//通过函数参数指定的单元格的行号和列好，获取指定的单元格对象
			cell = ExcelWSheet.getRow(rowNum).getCell(colNum);
			
			//如果单元格内容的内容为字符类型，则使用getStringCellValue方法来获取单元格内容
			//如果单元格的内容为数字类型，则使用getNumericCellValue方法来获取单元格内容
			String cellData = cell.getCellType() == XSSFCell.CELL_TYPE_STRING ? cell.getStringCellValue() + "":String.valueOf(Math.round(cell.getNumericCellValue()));
			return cellData;
		} catch (Exception e) {
			e.printStackTrace();
			//读取遇到异常，则返回空字符串
			return "Wrong!!!";
		} 
	}
	
	//获取Excel文件的最后一行的行号
	public static int getLastRowNum() {
		//函数返回sheet的最后一行的行号
		return ExcelWSheet.getLastRowNum();
	}
}
