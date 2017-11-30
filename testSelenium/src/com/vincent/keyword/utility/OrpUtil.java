/**   
* @Title: OrpUtil.java 
* @Package com.vincent.keyword.utility 
* @Description: TODO
* @author Vincent  
* @date 2017年11月28日 下午9:48:15 
* @version V1.0   
*/ 
package com.vincent.keyword.utility;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年11月28日下午9:48:15
 */
public class OrpUtil {
	public static String readValue(String a) {
		Properties pro = new Properties();
		String repopath = Contants.ObjectReUrl;
//		System.out.println(repopath);
		String value = null;
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(repopath));
			pro.load(in);
			value = pro.getProperty(a);
//			System.out.println(value);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
//	public static void main(String[] args) {
//		System.out.println(readValue("Userbar_login"));
//	}
}
