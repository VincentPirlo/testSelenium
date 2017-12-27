/**   
* @Title: EmployeeDetails.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月27日 下午10:15:28 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: 实用类
 * EmployeeDetails.java & EmpBusinessLogic.java & TestEmployeeDetails.java & employeetest-testng.xml
 * @author: Vincent
 * @date: 2017年12月27日下午10:15:28
 */
public class EmployeeDetails {
	private String name;
	private double monthlySalary;
	private int age;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name  the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	/**
	 * @param monthlySalary  the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
