package com.account.dao;

import java.util.List;

import com.account.dto.Employee;
public interface EmployeeDao {
	public Employee findEmployeeById(int empId);
	public List<Employee> getEmployees();
	public List<Employee> findEmployeeByDept();
	public void deleteEmployee(Employee emp);
	public void insertEmployeeWithValues();
	public void insertEmployee( Employee e);
}
