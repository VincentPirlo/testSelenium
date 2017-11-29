/**   
* @Title: ExcelUtils.java 
* @Package com.vincent.keyword.utility 
* @Description: TODO
* @author Vincent  
* @date 2017年11月26日 下午9:20:31 
* @version V1.0   
*/ 
package com.vincent.keyword.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年11月26日下午9:20:31
 */
public class ExcelUtils {
	public static XSSFSheet ExcelSheet;
	public static XSSFWorkbook ExcelBook;
	public static XSSFRow Row;
	public static XSSFCell Cell;
	
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		FileInputStream ExcelFile = new FileInputStream(Path);
		ExcelBook = new XSSFWorkbook(ExcelFile);
		ExcelSheet = ExcelBook.getSheet(SheetName);
	}
	
	public static void setCellData(String Result, int RowNum, int ColNum, String Path) throws Exception {
		Row = ExcelSheet.getRow(RowNum);
		Cell = Row.getCell(ColNum,Row.RETURN_BLANK_AS_NULL);
		if(Cell == null)
		{
			Cell = Row.createCell(ColNum);
			Cell.setCellValue(Result);
		}
		else
		{
			Cell.setCellValue(Result);
		}
		
		FileOutputStream fileOut = new FileOutputStream(Path);
		ExcelBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	
	//获取单元格的值
	public static String getCellData(int RowNum, int ColNum) {
		Cell = ExcelSheet.getRow(RowNum).getCell(ColNum);
		String cellData = Cell.getStringCellValue();
		return cellData;
	}
	
	//获取最后一行的数量
	public static int getLastRowNums(String SheetName) {
		try {
			ExcelSheet = ExcelBook.getSheet(SheetName);
			int rowCount = ExcelSheet.getLastRowNum();
			return rowCount;
		} catch (Exception e) {
			throw(e);
		}
	}
}
