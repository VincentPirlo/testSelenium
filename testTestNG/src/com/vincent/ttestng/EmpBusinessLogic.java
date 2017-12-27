/**   
* @Title: EmpBusinessLogic.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月27日 下午10:27:45 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: 业务逻辑类
 * EmployeeDetails.java & EmpBusinessLogic.java & TestEmployeeDetails.java & employeetest-testng.xml
 * @author: Vincent
 * @date: 2017年12月27日下午10:27:45
 */
public class EmpBusinessLogic {
	//Calculate the yearly salary of employee
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}
	
	//Calculate the appraisal amount of employee
	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		double appraisal = 0;
		if(employeeDetails.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		return appraisal;
	}
}
