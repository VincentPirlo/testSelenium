/**   
* @Title: ReadExcelUtil.java 
* @Package com.vincent.pandeobject 
* @Description: TODO
* @author Vincent  
* @date 2017年12月10日 下午9:09:24 
* @version V1.0   
*/ 
package com.vincent.pandeobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月10日下午9:09:24
 */
public class ReadExcelUtil {
	
	public static String path;
	
	public static String[][] getLocatorMap() throws IOException {
		path = "";
		File f1 = new File(path);
		FileInputStream in = new FileInputStream(f1);
		HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(in));
		Sheet sheet = wb.getSheetAt(0);
		Row header = sheet.getRow(0);
		String[][] locatorMap = new String[sheet.getLastRowNum() + 1][header.getLastCellNum()];
		for(int rownum=0; rownum<=sheet.getLastRowNum(); rownum++) {
			Row row = sheet.getRow(rownum);
			if(row == null) {
				continue;
			}
			String value;
			for(int cellnum=0; cellnum<=row.getLastCellNum(); cellnum++) {
				Cell cell = row.getCell(cellnum);
				if(cell == null) {
					continue;
				} else {
					value = "";
				}
				switch(cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					value = cell.getRichStringCellValue().getString();
					break;
				case Cell.CELL_TYPE_NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						value = cell.getDateCellValue().toString();
					} else {
						value = Double.toString((int) cell.getNumericCellValue());
					}
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					value = Boolean.toString(cell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_FORMULA:
					value = cell.getCellFormula().toLowerCase();
					break;
				default:
					value = " ";
					System.out.println();
				}
				locatorMap[rownum][cellnum] = value;
			}
		}
		in.close();
		wb.close();
		return locatorMap;
	}
}
