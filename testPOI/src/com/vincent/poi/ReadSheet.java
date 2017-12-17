package com.vincent.poi;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: 读取Excel工作簿并输出
 * @author: Vincent
 * @date: 2017年12月17日下午9:25:10
 */
public class ReadSheet {
	static XSSFRow row;
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("WriteSheet.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet spreadsheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = spreadsheet.iterator();
		while (rowIterator.hasNext()) 
		{
			row = (XSSFRow) rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while ( cellIterator.hasNext()) 
			{
				Cell cell = cellIterator.next();
				switch (cell.getCellTypeEnum()) 
				{
				case NUMERIC:
					System.out.print( cell.getNumericCellValue() + "\t\t" );
					break;
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t\t" );
					break;
				default:
					break;
				}
			}
			System.out.println();
		}
		fis.close();
		workbook.close();
	}
}