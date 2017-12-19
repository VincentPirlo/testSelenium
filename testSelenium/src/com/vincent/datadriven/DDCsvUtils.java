/**   
* @Title: DDCsvUtils.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017年12月19日 下午11:43:16 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;



/**
 * @Function: 实现csv驱动的方法（使用csv文件的实用类）
 * @author: Vincent
 * @date: 2017年12月19日下午11:43:16
 */
public class DDCsvUtils {
	@SuppressWarnings("resource")
	public static List driverCSV(String path) {
		List list = new ArrayList();
		InputStream in = null;
		BufferedReader buf = null;
		try {
			in = new FileInputStream(path);
			buf = new BufferedReader(new InputStreamReader(in));
			String temp;
			String info[];
			int count = 0;
			while(!(temp = StringUtils.trimToEmpty(buf.readLine())).equals("")) {
				if(count == 0) {
					count = 1;
					continue;
				}
				info = temp.split(",");
				list.add(info);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
