package com.vincent.poi;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFPrintSetup;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: ��ӡExcel��������ָ������
 * @author: Vincent
 * @date: 2017��12��17������8:43:21
 */
public class PrintArea {
	public static void main(String[] args) throws Exception {
       XSSFWorkbook workbook = new XSSFWorkbook(); 
       XSSFSheet spreadsheet = workbook.createSheet("Print Area");
       //���ô�ӡ����  sheet��������ʼ�У������У���ʼ�У�������
       workbook.setPrintArea(0, 0, 5, 0, 5);
       
       //����ֽ�Ŵ�С
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
