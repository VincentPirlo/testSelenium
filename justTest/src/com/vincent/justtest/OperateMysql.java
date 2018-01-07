/**   
* @Title: OperateMysql.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018��1��7�� ����5:41:47 
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
 * @date: 2018��1��7������5:41:47
 */
public class OperateMysql {
	
	//����Connection����
	Connection con;
	//����������
	String driver = "com.mysql.jdbc.Driver";
	//URLָ��Ҫ���ʵ����ݿ���test
	String url = "jdbc:mysql://10.10.40.50:3306/test";
	//MySQL����ʱ���û���
	String username = "root";
	//MySQL����ʱ������
	String password = "kdc";
	
	public void connectAndRead() {
		
		//������ѯ���
		try {
			//������������
			Class.forName(driver);
			//getConnection()����������MySQL���ݿ�
			con = DriverManager.getConnection(url, username, password);
			if(!con.isClosed()) {
				System.out.println("Succeeded connecting to the Database!");
			}
			//����statement���������ִ��SQL���
			Statement statement = con.createStatement();
			//Ҫִ�е�SQL���
			String sql = "select *from employee";
			//ResultSet�࣬������Ż�ȡ�Ľ����
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("------------------------");
			System.out.println("ִ�н��������ʾ��");
			System.out.println("------------------------");
			System.out.println("����" + "\t" + "ְ��");
			System.out.println("------------------------");
			
			String job = null;
			String ename = null;
			while(rs.next()) {
				//��ȡjob��
				job = rs.getString("job");
				//��ȡename��
				ename = rs.getString("ename");
				//������
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
			System.out.println("���ݿ����ݳɹ���ȡ������");
		}
	}
	
	
	public void addData(int empno, String ename, String job, String hiredate, float sal) {
		try {
			System.out.println("==========��ʼ��������===========");
			System.out.println("���ӵ�����Ϊ��" + "����-" + empno + " ����-" + ename 
					+ " ְλ-" + job + " ��ְ����-" + hiredate + " н��-" + sal);
			PreparedStatement psql;
			con = DriverManager.getConnection(url, username, password);
			
			//Ԥ����������ݣ���������������--"?"
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
			System.out.println("==========�������ݳɹ�==========");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	//���ݹ��Ÿ�����Ӧ��ֵ
	public void updateData(int index, int empno, String data) {
		try {
			System.out.println("==========��ʼ��������==========");
			if(index<2 || index>5) {
				System.out.println("index of your update data is wrong, please set number in [2,5].");
				System.out.println("==========��������ʧ��==========");
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
				System.out.println("==========�������ݳɹ�==========");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//��������ɾ������
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
