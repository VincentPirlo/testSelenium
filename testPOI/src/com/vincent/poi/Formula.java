package com.vincent.poi;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: Excel表格中公式的使用
 * @author: Vincent
 * @date: 2017年12月17日下午2:42:59
 */
public class Formula {
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook(); 
		XSSFSheet spreadsheet = workbook.createSheet("formula");
		XSSFRow row = spreadsheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("A =" );	
		cell = row.createCell(1);
		cell.setCellValue(2);
		
		row = spreadsheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("B =");
		cell = row.createCell(1);
		cell.setCellValue(4);
		
		//求和
		row = spreadsheet.createRow(2);
		cell = row.createCell(0);
		cell.setCellValue("Total =");
		cell = row.createCell(1);
		cell.setCellType(CellType.FORMULA);
		cell.setCellFormula("SUM(B1:B2)" );
		cell = row.createCell(2);
		cell.setCellValue("SUM(B1:B2)");
		
		//求幂
		row = spreadsheet.createRow(3);
		cell = row.createCell(0);
		cell.setCellValue("POWER =");
		cell=row.createCell(1);
		cell.setCellType(CellType.FORMULA);
		cell.setCellFormula("POWER(B1,B2)");
		cell = row.createCell(2);
		cell.setCellValue("POWER(B1,B2)");

		//求最大值
		row = spreadsheet.createRow(4);
		cell = row.createCell(0);
		cell.setCellValue("MAX =");
		cell = row.createCell(1);
		cell.setCellType(CellType.FORMULA);
		cell.setCellFormula("MAX(B1,B2)");
		cell = row.createCell(2);
		cell.setCellValue("MAX(B1，B2)");
		
		//求阶乘
		row = spreadsheet.createRow(5);
		cell = row.createCell(0);
		cell.setCellValue("FACT =");
		cell = row.createCell(1);
		cell.setCellType(CellType.FORMULA);
		cell.setCellFormula("FACT(B2)");
		cell = row.createCell(2);
		cell.setCellValue("FACT(B2)");
		
		//求平方根
      	row = spreadsheet.createRow(6);
      	cell = row.createCell(0);
      	cell.setCellValue("SQRT =");
      	cell = row.createCell(1);
      	cell.setCellType(CellType.FORMULA);
      	cell.setCellFormula("SQRT(B4)");
      	cell = row.createCell(2);
      	cell.setCellValue("SQRT(B4)");
      	
      	workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
      	FileOutputStream out = new FileOutputStream(new File("formula.xlsx"));
      	workbook.write(out);
      	out.close();
      	System.out.println("fromula.xlsx written successfully");
	}
}