/**   
* @Title: CompareJxlPOI.java 
* @Package com.vincent.compare 
* @Description: TODO
* @author Vincent  
* @date 2018年1月9日 下午9:24:48 
* @version V1.0   
*/ 
package com.vincent.compare;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**
 * @Function: 对比POI和jxl的性能（未完成）
 * http://blog.csdn.net/jarvis_java/article/details/4924099
 * @author: Vincent
 * @date: 2018年1月9日下午9:24:48
 */
public class CompareJxlPOI {
	
	public void writePOI() {
		try {
			long dir = (long) Math.round(Math.floor(Math.random() * 10000000));
			String dirPath = "c://11//".concat(String.valueOf(dir));
			File file = new File(dirPath);
			if(file.exists()) {
				System.out.println(file.getName() + "存在");
				if(file.delete()) {
					file.mkdir();
				}
			} else {
				file.mkdir();
			}
			//创建excel
			HSSFWorkbook newbook = new HSSFWorkbook();
			int j = 0;
			while(j<sheet) {
				HSSFSheet sheet = newbook.createSheet("test" +j);
				HSSFRow row = null;
				HSSFCell cell1 = null;
				HSSFCell cell2 = null;
				for(int i=0; i<leng; i++) {
					row = sheet.createRow(i);
					cell1 = row.createCell(0);
					cell2 = row.createCell(1);
					if(cell1 == null) {
						System.out.println("cell1 null");
					}
					cell1.setCellType(HSSFCell.CELL_TYPE_STRING);
					cell1.setCellValue("A数OI" + i);
					cell2.setCellType(HSSFCell.CELL_TYPE_STRING);
					cell2.setCellValue("B数OI" + i);
				}
				j++;
			}
			long l = (long) Math.round(Math.floor(Math.random() * 10000000));
			String name = "poi_".concat(String.valueOf(l)).concat(".xls");
			FileOutputStream fp = new FileOutputStream(dirPath.concat("//").concat(name));
			newbook.write(fp);
			fp.flush();
			fp.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void writeJXL() {
		try {
			long dir = (long) Math.round(Math.floor(Math.random() * 10000000));
			String dirPath = "c://11//".concat(String.valueOf(dir));
			File file = new File(dirPath);
			if(file.exists()) {
				System.out.println(file.getName() + "存在");
				if(file.delete()) {
					file.mkdir();
				}
			} else {
				file.mkdir();
			}
			
			long l = (long) Math.round(Math.floor(Math.random() * 10000000));
			String name = "jxl_".concat(String.valueOf(l)).concat(".xls");
			WritableWorkbook book =Workbook.createWorkbook(new File(dirPath.concat("//").concat(name)));
			int j = 0;
			while(j < sheet) {
				WritableSheet sheet = book.createSheet("test"+j, j);
				Label label1 = null;
				Label label2 = null;
				for(int i=0; i<leng; i++) {
					label1 = new Label(0, i, "A数xl" + i);
					label2 = new Label(1, i, "A数xl" + i);
					sheet.addCell(label1);
					sheet.addCell(label2);
				}
				j++;
			}
			book.write();
			book.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch ( WriteException e) {
			e.printStackTrace();
		}
	}
}
