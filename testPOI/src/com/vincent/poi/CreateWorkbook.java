package com.vincent.poi;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: 创建工作簿
 * @author: Vincent
 * @date: 2017年12月16日下午5:34:11
 */
public class CreateWorkbook 
{
   public static void main(String[] args)throws Exception 
   {
      //Create Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook(); 
      
      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(new File("createworkbook.xlsx"));
      
      //write operation workbook using file out object 
      workbook.write(out);
      workbook.close();
      out.close();
      System.out.println("createworkbook.xlsx written successfully");
   }
}