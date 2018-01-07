/**   
* @Title: SetStyleFontColor.java 
* @Package com.vincent.poi 
* @Description: TODO
* @author Vincent  
* @date 2018��1��7�� ����11:07:13 
* @version V1.0   
*/ 
package com.vincent.poi;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018��1��7������11:07:13
 */
public class SetStyleFontColor {

	  /**  
	  * @param args  
	  */  
	  public static void main(String[] args) throws IOException {   
	 
	      try {   
	          HSSFWorkbook wb = new HSSFWorkbook();   
	          HSSFSheet sheet = wb.createSheet("new   sheet");   
	          HSSFCellStyle style = wb.createCellStyle(); // ��ʽ����   
	 
	          style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// ��ֱ   
	          style.setAlignment(HSSFCellStyle.ALIGN_CENTER);// ˮƽ   
	          /**����begin*/
	          style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
	          //������ɫ
//	          style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
//	          style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
//	          style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
//	          style.setBorderRight(HSSFCellStyle.BORDER_THIN);
//	          style.setBorderTop(HSSFCellStyle.BORDER_THIN);
//	          style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
	         
	          //����һ������
	          HSSFFont font=wb.createFont();
	          font.setColor(HSSFColor.BLACK.index);//HSSFColor.VIOLET.index //������ɫ
	          font.setFontHeightInPoints((short)12);
	          font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);         //��������
	         //������Ӧ�õ���ǰ����ʽ
	          style.setFont(font);
	          /**����end*/
	          HSSFRow row = sheet.createRow((short) 0);   
	          HSSFRow row2 = sheet.createRow((short) 1);   
	         
	          // �ĸ������ֱ��ǣ���ʼ�У���ʼ�У������У�������   
	          sheet.addMergedRegion(new CellRangeAddress(0, (short) 0, 5, (short) 0));   
	          HSSFCell ce = row.createCell((short) 0);   
	          ce.setCellValue("��Ŀ\\����"); // ���ĵ�һ�е�һ����ʾ������   
	          ce.setCellStyle(style); // ��ʽ������   
	          int num = 0;   
	          for (int i = 0; i < 9; i++) { // ѭ��9�Σ�ÿһ�ζ�Ҫ�絥Ԫ����ʾ   
	              // ������Ǹ���Ԫ��絽��һ��   
	              int celln = 0;   
	              int celle = 0;   
	              if (i == 0) {   
	                  celln = 0;   
	                  celle = 1;   
	              } else {   
	                  celln = (i * 2);   
	                  celle = (i * 2 + 1);   
	              }   
	              // ��Ԫ��ϲ�   
	              // �ĸ������ֱ��ǣ���ʼ�У���ʼ�У������У�������   
	              sheet.addMergedRegion(new CellRangeAddress(0, (short) (celln + 1), 0,   
	                      (short) (celle + 1)));   
	              HSSFCell cell = row.createCell((short) (celln + 1));   
	              cell.setCellValue("merging" + i); // �絥Ԫ����ʾ������   
	              cell.setCellStyle(style); // ��ʽ   
	              // ���絥Ԫ����ʾ�����ݣ��磺�����У���һ�зֱ�����Ϊһ����һ�о�Ϊ���񣬡�������������   
	              HSSFCell cell1 = row2.createCell((short) celle);   
	              HSSFCell cell2 = row2.createCell((short) (celle + 1));   
	              cell1.setCellValue("����");   
	              cell1.setCellStyle(style);   
	              cell2.setCellValue("���");   
	              cell2.setCellStyle(style);   
	              num++;   
	          }   
	 
	          // �ں�����Ϻϼưٷֱ�   
	 
	          // �ϼ� �������ϣ���Ҫ��һ����Ԫ��     //�ĸ������ֱ��ǣ���ʼ�У���ʼ�У������У�������   
	          sheet.addMergedRegion(new CellRangeAddress(0, (short) (2 * num + 1), 0,   
	                  (short) (2 * num + 2)));   
	          HSSFCell cell = row.createCell((short) (2 * num + 1));   
	          cell.setCellValue("�ϼ�");   
	          cell.setCellStyle(style); 
	          HSSFCell cell1 = row2.createCell((short) (2 * num + 1));   
	          HSSFCell cell2 = row2.createCell((short) (2 * num + 2));   
	          cell1.setCellValue("����");   
	          cell1.setCellStyle(style);   
	          cell2.setCellValue("���");   
	          cell2.setCellStyle(style);   
	 
	          // �ٷֱ� ͬ��   
	          sheet.addMergedRegion(new CellRangeAddress(0, (short) (2 * num + 3), 0,   
	                  (short) (2 * num + 4)));   
	          HSSFCell cellb = row.createCell((short) (2 * num + 3));   
	          cellb.setCellValue("�ٷֱ�");   
	          cellb.setCellStyle(style);   
	          HSSFCell cellb1 = row2.createCell((short) (2 * num + 3));   
	          HSSFCell cellb2 = row2.createCell((short) (2 * num + 4));   
	          cellb1.setCellValue("����");   
	          cellb1.setCellStyle(style);   
	          cellb2.setCellValue("���");   
	          cellb2.setCellStyle(style); 
	         
	          //���һЩ���� Ȼ���������ͷ
	         
	          FileOutputStream fileOut = new FileOutputStream("D://workbook.xls");   
	          wb.write(fileOut);   
	          fileOut.close();   
	          System.out.print("OK");   
	      } catch (Exception ex) {   
	          ex.printStackTrace();   
	      }   
	  }
}