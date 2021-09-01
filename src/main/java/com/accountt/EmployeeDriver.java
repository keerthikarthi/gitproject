package com.accountt;

import java.sql.Connection;

import com.account.dao.EmployeeDao;
import com.account.dao.EmployeeDaoImpl;
import com.account.dto.Employee;
import com.account.service.EmployeeService;
import com.account.service.EmployeeServiceImpl;

public class EmployeeDriver {
	Employee emp;
	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		EmployeeService employeeService =new EmployeeServiceImpl(employeeDao);
		//List<Employee>emplist=employeeService.getEmployees();
		//System.out.println("Back with Employee List - "+emplist.size());
		//for(Employee employee:emplist)
		//{
			//System.out.println(employee);
		//}
		employeeService.insertEmployeeWithValues();
	}
}