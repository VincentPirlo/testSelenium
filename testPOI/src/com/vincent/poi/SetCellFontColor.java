/**   
* @Title: SetCellFontColor.java 
* @Package com.vincent.poi 
* @Description: TODO
* @author Vincent  
* @date 2018��1��7�� ����11:11:38 
* @version V1.0   
*/ 
package com.vincent.poi;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.hssf.util.HSSFColor;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.CreationHelper;

import org.apache.poi.ss.usermodel.Font;

import org.apache.poi.ss.usermodel.RichTextString;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
/**
 * @Function: //���õ�Ԫ��������ɫ
 * @author: Vincent
 * @date: 2018��1��7������11:11:38
 */
public class SetCellFontColor {

public static void main(String[] args) {

Workbook workbook = new HSSFWorkbook();

Sheet sheet = workbook.createSheet();

Cell cell = sheet.createRow(0).createCell(0);

CreationHelper helper = workbook.getCreationHelper();

RichTextString str = helper.createRichTextString("a\nb\nc\nd\ne\n");// ������ʹ��\n��ʾ�س�

Font[] fonts = new Font[5];

fonts[0] = workbook.createFont();

fonts[0].setColor(HSSFColor.YELLOW.index);

fonts[1] = workbook.createFont();

fonts[1].setColor(HSSFColor.RED.index);

fonts[2] = workbook.createFont();

fonts[2].setColor(HSSFColor.BLUE.index);

fonts[3] = workbook.createFont();

fonts[3].setColor(HSSFColor.ROSE.index);

fonts[4] = workbook.createFont();

fonts[4].setColor(HSSFColor.BLACK.index);

for (int i = 0; i < 5; i++) {

str.applyFont(i * 2, (i + 1) * 2, fonts[i]);

}

cell.setCellValue(str);

try {

FileOutputStream out = new FileOutputStream(new File("d:\\1.xls"));

workbook.write(out);

out.close();

} catch (FileNotFoundException e) {

e.printStackTrace();

} catch (IOException e) {

e.printStackTrace();

}

}

}