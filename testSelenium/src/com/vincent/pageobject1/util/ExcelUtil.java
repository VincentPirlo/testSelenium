/**   
* @Title: ExcelUtil.java 
* @Package com.vincent.pageobject1.util 
* @Description: TODO
* @author Vincent  
* @date 2017��12��23�� ����11:14:10 
* @version V1.0   
*/
package com.vincent.pageobject1.util;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: ������ʵ�ֲ���ָ��Excel�ļ��е�ָ��sheetҳ����ȡָ���ĵ�Ԫ�����ݡ���ȡsheet�����һ�е��кŵĹ���
 * @author: Vincent
 * @date: 2017��12��23������11:14:10
 */
public class ExcelUtil {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell cell;

	// �趨Ҫ��д��Excel�ļ���·����sheet����
	// �ڶ���дExcel�ļ�ʱ�������ȵ��ô˷������趨Ҫ������Excel�ļ�·����Ҫ������sheet����
	public static void setExcelFile(String filePath, String sheetName) {
		FileInputStream ExcelFile;

		try {
			// ʵ����Excel�ļ���FileInputStream����
			ExcelFile = new FileInputStream(filePath);

			// ʵ����Excel�ļ���XSSFWorkbook����
			ExcelWBook = new XSSFWorkbook(ExcelFile);

			// ʵ����XSSFCell����ָ��Excel�ļ��е�sheet���ƣ���������sheet���Ǹ��С��к͵�Ԫ��Ĳ���
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��ȡexcel�ļ���ָ����Ԫ��ĺ���
	public static String getCellData(int rowNum, int colNum) throws Exception {
		try {
			//ͨ����������ָ���ĵ�Ԫ����кź��кã���ȡָ���ĵ�Ԫ�����
			cell = ExcelWSheet.getRow(rowNum).getCell(colNum);
			
			//�����Ԫ�����ݵ�����Ϊ�ַ����ͣ���ʹ��getStringCellValue��������ȡ��Ԫ������
			//�����Ԫ�������Ϊ�������ͣ���ʹ��getNumericCellValue��������ȡ��Ԫ������
			String cellData = cell.getCellType() == XSSFCell.CELL_TYPE_STRING ? cell.getStringCellValue() + "":String.valueOf(Math.round(cell.getNumericCellValue()));
			return cellData;
		} catch (Exception e) {
			e.printStackTrace();
			//��ȡ�����쳣���򷵻ؿ��ַ���
			return "Wrong!!!";
		} 
	}
	
	//��ȡExcel�ļ������һ�е��к�
	public static int getLastRowNum() {
		//��������sheet�����һ�е��к�
		return ExcelWSheet.getLastRowNum();
	}
}
