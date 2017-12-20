/**   
* @Title: DDDBUtils.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017年12月20日 下午9:51:38 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Function: 工具类
 * @author: Vincent
 * @date: 2017年12月20日下午9:51:38
 */

public class DDDBUtils {
	public static List driverJDBC(String URL, String dbusername, String dbpassword) {
		List list = new ArrayList();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select username,password from userinfo where id<=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, dbusername, dbpassword);
			ps = con.prepareStatement(sql);
			ps.setInt(1, 6);
			rs = ps.executeQuery();
			while(rs.next()) {
				String[] tmp = new String[2];
				tmp[0] = rs.getString("username");
				tmp[1] = rs.getString("password");
				list.add(tmp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
