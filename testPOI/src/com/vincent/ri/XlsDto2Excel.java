/**   
* @Title: XlsDto2Excel.java 
* @Package com.vincent.ri 
* @Description: TODO
* @author Vincent  
* @date 2017年12月10日 下午3:09:24 
* @version V1.0   
*/ 
package com.vincent.ri;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月10日下午3:09:24
 */
public class XlsDto2Excel {
	public static void xlsDto2Excel(List<XlsDto> xls) throws Exception {
		int CountColumnNum = xls.size();
		HSSFWorkbook hwb = new HSSFWorkbook();
		XlsDto xlsDto = null;
		HSSFSheet sheet = hwb.getSheet("xls");
		HSSFRow firstrow = sheet.createRow(0);
		HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
		String[] names = new String[CountColumnNum];
		names[0] = "学号";
		names[1] = "姓名";
		names[2] = "学院";
		names[3] = "课程名";
		names[4] = "成绩";
		
		for(int j=0; j<CountColumnNum; j++) {
			firstcell[j] = firstrow.createCell(j);
			firstcell[j].setCellValue(new HSSFRichTextString(names[j]));
		}
		
		for(int i=0; i<xls.size(); i++) {
			HSSFRow row = sheet.createRow(i+1);
			xlsDto = xls.get(i);
			for(int colu=0; colu<=4; colu++) {
				HSSFCell xh = row.createCell(0);
				xh.setCellValue(xlsDto.getXh());
				HSSFCell xm = row.createCell(1);
				xm.setCellValue(xlsDto.getXm());
				HSSFCell yxsmc = row.createCell(2);
				yxsmc.setCellValue(xlsDto.getYxsmc());
				HSSFCell kcm = row.createCell(3);
				kcm.setCellValue(xlsDto.getKcm());
				HSSFCell cj = row.createCell(4);
				cj.setCellValue(xlsDto.getCj());
			}
		}
		OutputStream out = new FileOutputStream("D:\\test-workspace\\testPOI\\src\\com\\vincent\\ri\\outputxls.xls");
		hwb.write(out);
		out.close();
		System.out.println("数据库导出成功");
	}
}
