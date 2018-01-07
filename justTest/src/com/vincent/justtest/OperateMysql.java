/**   
* @Title: OperateMysql.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018年1月7日 下午5:41:47 
* @version V1.0   
*/ 
package com.vincent.justtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月7日下午5:41:47
 */
public class OperateMysql {
	
	//创建Connection对象
	Connection con;
	//驱动程序名
	String driver = "com.mysql.jdbc.Driver";
	//URL指向要访问的数据库名test
	String url = "jdbc:mysql://10.10.40.50:3306/test";
	//MySQL配置时的用户名
	String username = "root";
	//MySQL配置时的密码
	String password = "kdc";
	
	public void connectAndRead() {
		
		//遍历查询结果
		try {
			//加载驱动程序
			Class.forName(driver);
			//getConnection()方法，链接MySQL数据库
			con = DriverManager.getConnection(url, username, password);
			if(!con.isClosed()) {
				System.out.println("Succeeded connecting to the Database!");
			}
			//创建statement类对象，用来执行SQL语句
			Statement statement = con.createStatement();
			//要执行的SQL语句
			String sql = "select *from employee";
			//ResultSet类，用来存放获取的结果集
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("------------------------");
			System.out.println("执行结果如下所示：");
			System.out.println("------------------------");
			System.out.println("姓名" + "\t" + "职称");
			System.out.println("------------------------");
			
			String job = null;
			String ename = null;
			while(rs.next()) {
				//获取job列
				job = rs.getString("job");
				//获取ename列
				ename = rs.getString("ename");
				//输出结果
				System.out.println(ename + "\t" + job);
			}
			rs.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("数据库数据成功获取！！！");
		}
	}
	
	
	public void addData(int empno, String ename, String job, String hiredate, float sal) {
		try {
			System.out.println("==========开始增加数据===========");
			System.out.println("增加的数据为：" + "工号-" + empno + " 姓名-" + ename 
					+ " 职位-" + job + " 入职日期-" + hiredate + " 薪资-" + sal);
			PreparedStatement psql;
			con = DriverManager.getConnection(url, username, password);
			
			//预处理添加数据，其中有两个参数--"?"
			psql = con.prepareStatement("insert into employee(empno, ename, job, "
					+ "hiredate, sal) values(?,?,?,?,?)");
			psql.setInt(1, empno);
			psql.setString(2, ename);
			psql.setString(3, job);
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date myDate = dateFormat.parse(hiredate);
			psql.setDate(4, new java.sql.Date(myDate.getTime()));
			psql.setFloat(5, (float) sal);
			psql.executeUpdate();
			System.out.println("==========增加数据成功==========");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	//根据工号更新相应的值
	public void updateData(int index, int empno, String data) {
		try {
			System.out.println("==========开始更新数据==========");
			if(index<2 || index>5) {
				System.out.println("index of your update data is wrong, please set number in [2,5].");
				System.out.println("==========更新数据失败==========");
			} else {
				PreparedStatement psql;
				con = DriverManager.getConnection(url, username, password);
				switch(index) {
					case 2:
						System.out.println("update ename of empno=" + empno +" to " + data);
						psql = con.prepareStatement("update employee set ename = ? where empno=" + empno);
						psql.setString(1, data);
						psql.executeUpdate();
						break;
					case 3:
						System.out.println("update job of empno=" + empno +" to " + data);
						psql = con.prepareStatement("update employee set job=? where empno=" + empno);
						psql.setString(1, data);
						psql.executeUpdate();
						break;
					case 4:
						System.out.println("update hiredate of empno=" + empno +" to " + data);
						psql = con.prepareStatement("update employee set hiredate=? where empno=" + empno);
						psql.setString(1, data);
						psql.executeUpdate();
						break;
					case 5:
						System.out.println("update salary of empno=" + empno +" to " + data);
						psql = con.prepareStatement("update employee set sal=? where empno=" + empno);
						psql.setString(1, data);
						psql.executeUpdate();
						break;
					default:
						break;
				}
				System.out.println("==========更新数据成功==========");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//根据名字删除数据
	public void deleteData(String ename) {
		try {
			PreparedStatement psql;
			con = DriverManager.getConnection(url, username, password);
			Statement statement = con.createStatement();
			String sql = "select ename from employee";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				if(rs.getString("ename").equals(ename)) {
					System.out.println("begin to delete " + ename +"\'s record from test.employee");
					psql = con.prepareStatement("delete from employee where ename = ?");
					psql.setString(1, ename);
					psql.executeUpdate();
					System.out.println("delete " + ename + "\'s record succeeded.");
				} else {
					System.out.println("there is no employee named: " + ename);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
