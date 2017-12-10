/**   
* @Title: XlsMain.java 
* @Package com.vincent.ri 
* @Description: TODO
* @author Vincent  
* @date 2017年12月10日 下午3:07:14 
* @version V1.0   
*/ 
package com.vincent.ri;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * http://www.cnblogs.com/hongten/archive/2012/02/22/java2poi.html
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月10日下午3:07:14
 */
public class XlsMain {
	public static void main(String[] args) throws IOException {
		XlsMain xlsMain = new XlsMain();
		XlsDto xls = null;
		List<XlsDto> list = xlsMain.readXls();
		
		try {
			XlsDto2Excel.xlsDto2Excel(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0; i<list.size(); i++) {
			xls = (XlsDto) list.get(i);
			System.out.println(xls.getXh() + "    " + xls.getXm() + "    "
					+ xls.getYxsmc() + "    " + xls.getKcm() + "    " + xls.getCj());
		}
	}
	
	private List<XlsDto> readXls() throws IOException {
		InputStream is = new FileInputStream("D:\\test-workspace\\testPOI\\src\\com\\vincent\\ri\\xls.xls");
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		XlsDto xlsDto = null;
		List<XlsDto> list = new ArrayList<XlsDto>();
		for(int numSheet=0; numSheet<hssfWorkbook.getNumberOfSheets(); numSheet++) {
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if(hssfSheet == null) {
				continue;
			}
			for(int rowNum=1; rowNum<=hssfSheet.getLastRowNum(); rowNum++) {
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if(hssfRow == null) {
					continue;
				}
				xlsDto = new XlsDto();
				HSSFCell xh = hssfRow.getCell(0);
				if(xh == null) {
					continue;
				}
				xlsDto.setXh(getValue(xh));
                HSSFCell xm = hssfRow.getCell(1);
                if (xm == null) {
                    continue;
                }
                xlsDto.setXm(getValue(xm));
                HSSFCell yxsmc = hssfRow.getCell(2);
                if (yxsmc == null) {
                    continue;
                }
                xlsDto.setYxsmc(getValue(yxsmc));
                HSSFCell kcm = hssfRow.getCell(3);
                if (kcm == null) {
                    continue;
                }
                xlsDto.setKcm(getValue(kcm));
                HSSFCell cj = hssfRow.getCell(4);
                if (cj == null) {
                    continue;
                }
                
                xlsDto.setCj(Float.parseFloat(getValue(cj)));
                list.add(xlsDto);
			}
		}
		return list;
	}
	
	/**
	 * @Function: TODO
	 * @param hssfCell
	 * @return
	 */
	@SuppressWarnings("static-access")
	private String getValue(HSSFCell hssfCell) {
		if(hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(hssfCell.getBooleanCellValue());
		} else if(hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
			return String.valueOf(hssfCell.getNumericCellValue());
		} else {
			return String.valueOf(hssfCell.getStringCellValue());
		}
	}
}
