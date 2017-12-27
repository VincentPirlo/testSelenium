/**   
* @Title: TestEmployeeDetails.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月27日 下午10:43:59 
* @version V1.0   
*/ 
package com.vincent.ttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Function: 测试类
 * EmployeeDetails.java & EmpBusinessLogic.java & TestEmployeeDetails.java & employeetest-testng.xml
 * @author: Vincent
 * @date: 2017年12月27日下午10:43:59
 */
public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	
	@Test
	public void testCalculateAppriasal() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		Assert.assertEquals(500, appraisal, 0.0, "500");
	}
	
	//test to check yearly salary
	@Test
	public void testCalculateYearlySalary() {
		employee.setAge(25);
		employee.setName("Rajeev");
		employee.setMonthlySalary(8000);
		
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		Assert.assertEquals(96000, salary, 0.0, "8000");
	}
}
