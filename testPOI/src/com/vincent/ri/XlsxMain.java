/**   
* @Title: XlsxMain.java 
* @Package com.vincent.ri 
* @Description: TODO
* @author Vincent  
* @date 2017年12月10日 下午3:09:36 
* @version V1.0   
*/ 
package com.vincent.ri;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月10日下午3:09:36
 */
public class XlsxMain {
	public static void main(String[] args) throws IOException {
		XlsxMain xlsxMain = new XlsxMain();
		XlsDto xls = null;
		List<XlsDto> list = xlsxMain.readXlsx();
		
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
	
	private List<XlsDto> readXlsx() throws IOException {
		InputStream is = new FileInputStream("xlsx.xlsx");
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
		XlsDto xlsDto = null;
		List<XlsDto> list = new ArrayList<XlsDto>();
		for(int numSheet=0; numSheet<xssfWorkbook.getNumberOfSheets(); numSheet++) {
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
			if(xssfSheet == null) {
				continue;
			}
			for(int rowNum=1; rowNum<=xssfSheet.getLastRowNum(); rowNum++) {
				XSSFRow xssfRow = xssfSheet.getRow(rowNum);
				if(xssfRow == null) {
					continue;
				}
				xlsDto = new XlsDto();
				XSSFCell xh = xssfRow.getCell(0);
				if(xh == null) {
					continue;
				}
				xlsDto.setXh(getValue(xh));
				XSSFCell xm = xssfRow.getCell(1);
                if (xm == null) {
                    continue;
                }
                xlsDto.setXm(getValue(xm));
                XSSFCell yxsmc = xssfRow.getCell(2);
                if (yxsmc == null) {
                    continue;
                }
                xlsDto.setYxsmc(getValue(yxsmc));
                XSSFCell kcm = xssfRow.getCell(3);
                if (kcm == null) {
                    continue;
                }
                xlsDto.setKcm(getValue(kcm));
                XSSFCell cj = xssfRow.getCell(4);
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
	 * @param xssfCell
	 * @return
	 */
	@SuppressWarnings("static-access")
	private String getValue(XSSFCell xssfCell) {
		if(xssfCell.getCellType() == xssfCell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(xssfCell.getBooleanCellValue());
		} else if(xssfCell.getCellType() == xssfCell.CELL_TYPE_NUMERIC) {
			return String.valueOf(xssfCell.getNumericCellValue());
		} else {
			return String.valueOf(xssfCell.getStringCellValue());
		}
	}
}
