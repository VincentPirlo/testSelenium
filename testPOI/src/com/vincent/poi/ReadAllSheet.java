/**   
* @Title: ReadAllSheet.java 
* @Package com.vincent.poi 
* @Description: TODO
* @author Vincent  
* @date 2017��12��21�� ����12:02:22 
* @version V1.0   
*/ 
package com.vincent.poi;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/**
 * @Function: ��ȡExcel����������sheetҳ���������ݣ������пյ�Ԫ��
 * @author: Vincent
 * @date: 2017��12��21������12:02:22
 */
public class ReadAllSheet {

   public static void main(String[] args) {
           try {
               showExcel();
           } catch (Exception e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
   }
   public static  void showExcel() throws Exception {
       HSSFWorkbook workbook=new HSSFWorkbook(new FileInputStream(new File("D:\\test-workspace\\testPOI\\MultiSheet.xls")));
       HSSFSheet sheet=null;
       for (int i = 0; i < workbook.getNumberOfSheets(); i++) {//��ȡÿ��Sheet��
            sheet=workbook.getSheetAt(i);
            System.out.println(sheet.getSheetName());
            for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {//��ȡÿ��
               HSSFRow row=sheet.getRow(j);
               for (int k = 0; k < row.getPhysicalNumberOfCells(); k++) {//��ȡÿ����Ԫ��
                   System.out.print(row.getCell(k)+"\t");
               }
               System.out.println();
           }
            System.out.println("---Sheet��"+i+"�������---");
       }
   }
}