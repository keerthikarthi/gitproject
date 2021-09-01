package com.account.service;



import java.util.List;

import com.account.dto.Employee;

public interface EmployeeService {
	public default Employee getEmployeeById(int empId) {
		return null;
	}
	public default List<Employee> getEmployees() {
		return null;
	}
	public default List<Employee> getEmployeesByDept() {
		return null;
	}
	public default void deleteEmployee(int empId) {
	}
	public default void insertEmployeeWithValues() {
	}
	public default void insertEmployee( Employee e) {
	}
}

