/**   
* @Title: ExcelData.java 
* @Package com.vincent.datadriveno 
* @Description: TODO
* @author Vincent  
* @date 2018年1月6日 下午9:57:39 
* @version V1.0   
*/ 
package com.vincent.datadriveno;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月6日下午9:57:39
 */
public class ExcelData implements Iterator<Object[]> {
	private Workbook book = null;
	private Sheet sheet = null;
	private int rowNum = 0;//行数
	private int curRowNo = 0;//当前行数
	private int columnNum = 0;//列数
	private String[] columnName;//列名
	
	/*在TestNG中，由@DataProvider（dataProvider="name"）修饰的方法读取Exel时，调用此类的构造方法（此方法会得到列名并将当前行移到下一行）执行完后， 
	*转到TestNG自己的方法中去，然后由他们调用此类实现的hasNext()、next() 方法； 
	*得到一行数据，然后返回给由@Test（dataProvider="name"）修饰的方法，如此反复到数据读完为止。 
	* @param fileName Excel文件名 
	* @param casename用例名 
	 */
	public ExcelData(String fileName, String sheetName) {
		try {
			File directory = new File(".");
			String ss = "";
			book = Workbook.getWorkbook(new File(directory.getCanonicalFile() 
					+ "\\src\\com\\vincent\\datadriveno\\" + fileName));//(new File(this.getClass().getResource("/").getPath() + fileName));
			this.sheet = book.getSheet(sheetName);
			this.rowNum = sheet.getRows();
			Cell[] cell = sheet.getRow(0);
			this.columnNum = cell.length;
			columnName = new String[cell.length];
			for(int i=0; i<cell.length; i++) {
				columnName[i] = cell[i].getContents().toString();
			}
			this.curRowNo++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean hasNext() {
	/** 
	*方法功能：是否有下一条数据 
	*如果行数为0即空sheet或者 当前行数大于总行数 
	*就关闭对excel的操作返回false，否则返回true 
	*/  	
		if(this.rowNum == 0 || this.curRowNo >= this.rowNum) {
			try {
				book.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public Object[] next() {
	/* 方法功能：得到并返回下一行数据 
	* 使用for将一行的数据放入TreeMap中（TreeMap默认按照Key值升序排列，HashMap没有排序） 
	*然后将Map装入Object[]并返回，且将curRowNo当前行下移 
	*/ 
		Cell[] cell = sheet.getRow(this.curRowNo);
		Map<String, String> s = new TreeMap<String, String>();
		for(int i=0; i<this.columnNum; i++) {
			String temp = "";
			try {
				temp = cell[i].getContents().toString();
			} catch (ArrayIndexOutOfBoundsException e) {
				temp = "";
			}
			s.put(this.columnName[i], temp);
		}
		
		Object r[] = new Object[1];
		r[0] = s;
		this.curRowNo++;
		return r;
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove unsupported.");
	}	
}
