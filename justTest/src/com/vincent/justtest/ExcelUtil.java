package com.vincent.justtest;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	private XSSFSheet ExcelWSheet;
	private XSSFWorkbook ExcelWBook;
	
	public ExcelUtil(String Path, String SheetName) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			throw(e);
		}
	}
	
	public int excelGetRows() throws Exception {
		try {
			return ExcelWSheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			throw(e);
		}
	}
	
	public String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			String CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
			System.out.println("The value of CellData "+CellData);
			return CellData;
		} catch (Exception e) {
			return "Errors in Getting Cell Data";
		}
	}
	
	public double getCellDataNumber(int RowNum, int ColNum) throws Exception {
		try {
			double CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
			System.out.println("The value of CellData "+ CellData);
			return CellData;
		} catch (Exception e) {
			return 0.00; 
		}
	}
}
