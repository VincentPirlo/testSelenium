package com.vincent.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * @Function: ��10.10.40.50���ݿ�test��emp���ж�ȡ�������ݲ�д�뵽exceldatabase.xlsx��������
 * 
 * @author: Vincent
 * @date: 2017��12��16������11:38:10
 */
public class ExcelDatabase 
{
   public static void main(String[] args) throws Exception 
   {
	   //������������
      Class.forName("com.mysql.jdbc.Driver");
      //����MySQL���ݿ�
      Connection connect = DriverManager.getConnection("jdbc:mysql://10.10.40.50:3306/test", "root", "kdc");
      Statement statement = connect.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from emp");
      XSSFWorkbook workbook = new XSSFWorkbook(); 
      XSSFSheet spreadsheet = workbook.createSheet("employe db");
      XSSFRow row=spreadsheet.createRow(0);
      XSSFCell cell;
      cell=row.createCell(0);
      cell.setCellValue("EMP ID");
      cell=row.createCell(1);
      cell.setCellValue("EMP NAME");
      cell=row.createCell(2);
      cell.setCellValue("POSITION");
      cell=row.createCell(3);
      cell.setCellValue("EMP DATE");
      cell=row.createCell(4);
      cell.setCellValue("SALARY");
      int i=1;
      while(resultSet.next())
      {
         row=spreadsheet.createRow(i);
         cell=row.createCell(0);
         cell.setCellValue(resultSet.getInt("empno"));
         cell=row.createCell(1);
         cell.setCellValue(resultSet.getString("ename"));
         cell=row.createCell(2);
         cell.setCellValue(resultSet.getString("job"));
         cell=row.createCell(3);
         cell.setCellValue(resultSet.getString("hiredate"));
         cell=row.createCell(4);
         cell.setCellValue(resultSet.getFloat("sal"));	//getString("sal"));
         i++;
      }
      FileOutputStream out = new FileOutputStream(new File("exceldatabase.xlsx"));
      workbook.write(out);
      out.close();
      System.out.println("exceldatabase.xlsx written successfully");
   }
}