/**   
* @Title: ReadAndWrite.java 
* @Package com.vincent.randw 
* @Description: TODO
* @author Vincent  
* @date 2017年12月13日 下午10:02:13 
* @version V1.0   
*/ 
package com.vincent.randw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月13日下午10:02:13
 */
public class ReadAndWrite {
	public static void main(String[] args) {
		
	}
	
	/**
	 * @Function: 读指定Excel文件中指定表单指定行列的单元格数据
	 * @param fileName	Excel文件名
	 * @param sheetName	sheet表单名
	 * @param rowNum	行号
	 * @param cloNum	列号
	 * @usage readExcel(fineName, sheetName, rowNum, columnNum)
	 * @return unitValue	单元格的值
	 */
	public String readExcel(String fileName, String sheetName, Integer rowNum, Integer columnNum) {
		//初始化单元格值为空
		String unitValue = null;
		try {
			//建立输入流
			InputStream input = new FileInputStream(new File(fileName));
			Workbook wb = null;
			//根据文件格式（2003或2010）来初始化
			wb = new XSSFWorkbook(input);
			Sheet sheet = wb.getSheet(sheetName);	//获得表单
			//logger.info("开始读取Excel文件：" + fileName + "的sheet表：" + sheetName);
			//Sheet sheet = wb.getSheetAt(0);		//获得第一个表单
			int rowCount = sheet.getPhysicalNumberOfRows();	//获取总行数
			
			//遍历每一行
			for(int i=0; i<rowCount; i++) {
				Row row = sheet.getRow(i);
				int cellCount = row.getPhysicalNumberOfCells();	//获取总列数
				//遍历每一列
				for(int j=0; j<cellCount; j++) {
					Cell cell = row.getCell(j);
					if(i==rowNum && j==columnNum) {
						cell.setCellType(1);
						unitValue = cell.getStringCellValue();
						//logger.info("读取Excel文件:"+fileName+"的sheet表:"+sheetName+"中第"+rowNum+"行"+"第"+columnNum+"列,获取到的值为:"+unitValue); ?
					} else {
						continue;	//继续遍历查找
					}
				}
			}
			if(unitValue.equals("")) {
				//logger.info("读取Excel文件:"+fileName+"的sheet表"+sheetName+"中第"+rowNum+"行"+"第"+columnNum+"列,获取到的值为空,将返回\"\"");  
                unitValue="";  
			}
		} catch (IOException e) {
			e.printStackTrace();
			//logger.error("读取Excel文件:"+fileName+"的sheet表:"+sheet
		}
		return unitValue;
	}
	
	
	/**
	 * @Function: 将字符串写入指定文件的指定行列中
	 * @param fileName		待写入的Excel路径文件名
	 * @param sheetName		sheet表单名
	 * @param unitValue		待写入的字符串
	 * @param rowNum		待写入的行号
	 * @param columnNum		待写入的行号
	 * @usage writeExcel(fileName, sheetName, unitValue, rowNum, columnNum)
	 */
	public void writeExcel(String fileName, String sheetName, String unitValue, int rowNum, int columnNum) {
		try {
			InputStream input = new FileInputStream(new File(fileName));	//建立输入流
			Workbook wb = null;
			//根据文件个会（2003或2010）来初始化
			wb = new XSSFWorkbook(input);
			Sheet sheet = wb.getSheet(sheetName);	//获得表单
			//Sheet sheet = wb.getSheetAt(0);			//获得第一个表单
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(columnNum);
			cell.setCellType(1);
			cell.setCellValue(unitValue);
			//logger.info("向Excel文件:"+fileName+"的sheet表:"+sheetName+"中第"+rowNum+"行第"+column+"列写入数据:"+unitValue+"成功!");
			
			//写入后保存到Excel
			OutputStream os = null;
			try {
				os = new FileOutputStream(new File(fileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				wb.write(os);
				//logger.info("向Excel文件:"+fileName+"的sheet表:"+sheetName+"写入数据完成!");  
			} catch (IOException e) {
				e.printStackTrace();
				//logger.error("向Excel文件:"+fileName+"的sheet表:"+sheetName+"写入数据失败!"); 
			}
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Function: 将字符串写入指定文件的指定列中
	 * @param fileName		待写入的Excel路径文件名
	 * @param sheetName		sheet表单名
	 * @param unitValue		待写入的字符串链表
	 * @param rowNum		从哪一行开始
	 * @param columnNum		待写入的列号
	 * @usage writeExcelCol(fileName, sheetName, unitValue, rowNum, columnNum)
	 */
	public void writeExcelCol(String fileName, String sheetName, List unitValue, int rowNum, int columnNum) {
		try {
			InputStream input = new FileInputStream(new File(fileName));	//建立输入流
			Workbook wb = null;
			//根据文件格式（2003或2010）来初始化
			Sheet sheet = wb.getSheet(sheetName);		//获得表单
			//Sheet sheet = wb.getSheetAt(0);			//获得第一个表单
			//根据读取的columnNum来决定写入哪一列
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Function: TODO
	 * @param fileName
	 * @param sheetName
	 * @param unitValue
	 * @param rowNum
	 * @param columnNum
	 */
	public void writeExcelRow(String fileName, String sheetName, List unitValue, int rowNum, int columnNum) {
		 try {  
	            InputStream input = new FileInputStream(new File(fileName));    //建立输入流  
	            Workbook wb  = null;  
	            //根据文件格式(2003或者2010)来初始化  
	            wb = new XSSFWorkbook(input);  
	            Sheet sheet = wb.getSheet(sheetName);        //获得表单  
	            //Sheet sheet = wb.getSheetAt(0);    //获得第一个表单  
	            //根据读取的rowNum来决定写入哪一行  
	            Row row = sheet.createRow(rowNum);  
	            for (int c = 0; c < unitValue.size(); c++){  
	                Cell cell = row.createCell(c+columnNum);  
	                cell.setCellType(1);  
	                cell.setCellValue((String)unitValue.get(c));  
	                //logger.info("向Excel文件:"+fileName+"的sheet表:"+sheetName+"中第"+rowNum+"行第"+(c+colNum)+"列写入数据:"+unitValue.get(c)+"成功!");  
	            }  
	          
	        //写入后保存到Excel  
	        OutputStream os = null;  
	        try {  
	            os = new FileOutputStream(new File(fileName));  
	        } catch (FileNotFoundException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	        try {  
	            wb.write(os);  
	            //logger.info("向Excel文件:"+fileName+"的sheet表:"+sheetName+"写入数据完成!");  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	            //logger.error("向Excel文件:"+fileName+"的sheet表:"+sheetName+"写入数据失败!");  
	        }  
	        try {  
	            os.close();  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	        } catch (IOException ex) {  
	            ex.printStackTrace();  
	        }  
	    }  
	}

