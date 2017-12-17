package com.vincent.poi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: ��Excel������
 * @author: Vincent
 * @date: 2017��12��17������8:40:04
 */
public class OpenWorkBook {
	public static void main(String[] args) throws Exception {
		File file = new File("openworkbook.xlsx");
		FileInputStream fIP = new FileInputStream(file);
		//get the workbook instance for xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(fIP);
		if(file.isFile() && file.exists())
		{
			System.out.println("openworkbook.xlsx file open successfully.");
		}
		else
		{
			System.out.println("Error to open openworkbook.xlsx file.");
		}
	}
}
