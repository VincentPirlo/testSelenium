/**   
* @Title: ExcelUtils2.java 
* @Package com.vincent.keyword.utility 
* @Description: TODO
* @author Vincent  
* @date 2017年12月2日 下午2:45:50 
* @version V1.0   
*/ 
package com.vincent.keyword.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月2日下午2:45:50
 */
public class ExcelUtils2 {
	
	public static XSSFSheet ExcelSheet;
	public static XSSFWorkbook ExcelBook;
	public static XSSFRow Row;
	public static XSSFCell Cell;
	
	/**
	 * @Function: TODO
	 * @param Path
	 */
	public static void setExcelFile(String Path) {
		FileInputStream ExcelFile;
		try {
			ExcelFile = new FileInputStream(Path);
			ExcelBook = new XSSFWorkbook(ExcelFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Function: TODO
	 * @param Result
	 * @param RowNum
	 * @param ColNum
	 * @param Path
	 * @param SheetName
	 */
	public static void setCellData(String Result, int RowNum, int ColNum, String Path, String SheetName) {
		try {
			ExcelSheet = ExcelBook.getSheet(SheetName);
			Row = ExcelSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
			if(Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			}
			else {
				Cell.setCellValue(Result);
			}
			FileOutputStream fileOut = new FileOutputStream(Path);
			ExcelBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Function: TODO
	 * @param RowNum
	 * @param ColNum
	 * @param SheetName
	 * @return
	 */
	public static String getCellData(int RowNum, int ColNum, String SheetName) {
		ExcelSheet = ExcelBook.getSheet(SheetName);
		Cell = ExcelSheet.getRow(RowNum).getCell(ColNum);
		String cellData = Cell.getStringCellValue();
		return cellData;
	}
	
	/**
	 * @Function: TODO
	 * @param SheetName
	 * @return
	 */
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