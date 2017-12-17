package com.vincent.poi;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFPrintSetup;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: 打印Excel工作簿的指定区域
 * @author: Vincent
 * @date: 2017年12月17日下午8:43:21
 */
public class PrintArea {
	public static void main(String[] args) throws Exception {
       XSSFWorkbook workbook = new XSSFWorkbook(); 
       XSSFSheet spreadsheet = workbook.createSheet("Print Area");
       //设置打印区域  sheet索引，起始列，结束列，起始行，结束行
       workbook.setPrintArea(0, 0, 5, 0, 5);
       
       //设置纸张大小
       spreadsheet.getPrintSetup().setPaperSize(XSSFPrintSetup.A4_PAPERSIZE);
       
       //set display grid lines or not
       spreadsheet.setDisplayGridlines(true);
       
       //set print grid lines or not
       spreadsheet.setPrintGridlines(true);
       
       FileOutputStream out = new FileOutputStream(new File("printarea.xlsx"));
       workbook.write(out);
       out.close();
       System.out.println("printarea.xlsx written successfully"); 
	}
}
