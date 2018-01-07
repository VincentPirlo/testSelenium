/**   
* @Title: OperateMysqlTest.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018年1月7日 下午7:30:01 
* @version V1.0   
*/ 
package com.vincent.justtest;

import java.sql.SQLException;
import java.text.ParseException;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月7日下午7:30:01
 */
public class OperateMysqlTest {
	public static void main(String[] args) {
		OperateMysql operatemysql = new OperateMysql();
		/*operatemysql.connectAndRead();
		
		operatemysql.addData(9999, "caoshan", "dongshi", "2013-07-08", 10000.3f);*/
		
		//operatemysql.updateData(5, 8964, "5000");
		
		operatemysql.deleteData("luobo");
	}
}
