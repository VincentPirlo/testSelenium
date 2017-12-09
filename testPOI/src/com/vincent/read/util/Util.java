/**   
* @Title: Util.java 
* @Package com.vincent.read.util 
* @Description: TODO
* @author Vincent  
* @date 2017年12月9日 下午10:57:02 
* @version V1.0   
*/ 
package com.vincent.read.util;

import com.vincent.read.common.Common;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月9日下午10:57:02
 */
public class Util {
	
	public static String getPostfix(String path) {
		if(path == null || Common.EMPTY.equals(path.trim())) {
			return Common.EMPTY;
		}
		
		if(path.contains(Common.POINT)) {
			return path.substring(path.lastIndexOf(Common.POINT) + 1, path.length());
		}
		return Common.EMPTY;
	}
}
