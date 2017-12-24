/**   
* @Title: ExcelData.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017年12月3日 下午3:16:03 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * @Function: TODO
 * 数据驱动测试是相同的测试脚本使用不同的测试数据执行，测试数据和测试行为完全分离。
 * @author: Vincent
 * @date: 2017年12月3日下午3:16:03
 */

public class ExcelData implements Iterator<Object[]> {
	private Workbook workbook = null;
	private Sheet sheet = null;
	private int rowNum = 0;
	private int curRowNo = 0;
	private int columnNum = 0;
	private String[] columnName;
	
	/**
	 * 在TestNG中，由@DataProvider(dataProvider="name")修饰的方法读取Excel时，调用此类的构造方法
	 * （此方法会得到列名并将当前行移到下一行）执行完后，转到TestNG自己的方法找那个去，然后由他们调用此类实现的hasNext()、
	 * next()方法；得到一行数据，然后返回给由@Test(dataProvider="name")修饰的方法，如此反复直到数据读完为止
	 * @param filepath
	 * @param casename
	 */
	public ExcelData(String filepath, String casename) {
		try {
			File directory = new File(".");
			workbook = Workbook.getWorkbook(new File(directory.getCanonicalFile()
					+ "\\src\\com\\vincent\\datadriven\\"
					+ filepath + ".xls"));
			this.sheet = workbook.getSheet(casename);
			this.rowNum = sheet.getRows();
			
			Cell[] c = sheet.getRow(0);
			this.columnNum = c.length;
			columnName = new String[c.length];
			for(int i=0; i<c.length; i++) {
				columnName[i] = c[i].getContents().toString();
			}
			
			this.curRowNo++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Function: 判断是否由下一条数据，如果行数为0即空sheet或者当前行数大于总行数，就关闭对excel的操作返回
	 * false，否则返回true
	 * @return
	 */
	@Override
	public boolean hasNext() {
		if(this.rowNum == 0 || this.curRowNo >= this.rowNum) {
			try {
				workbook.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return false;
		} else
			return true;
	}
	
	/**
	 * @Function: 得到并返回下一行数据
	 * 使用for将一行的数据放入TreeMap中(TreeMap默认按照Key值升序排列，HashMap没有排序)
	 * 然后将Map装入Object[]并返回，且将curRowNo当前行下移
	 * @return
	 */
	@Override
	public Object[] next() {
		Cell[] c = sheet.getRow(this.curRowNo);
		Map<String, String> s = new TreeMap<String, String>();
		for(int i=0; i<this.columnNum; i++) {
			String temp = "";
			try {
				temp = c[i].getContents().toString();
			} catch (ArrayIndexOutOfBoundsException ex) {
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
