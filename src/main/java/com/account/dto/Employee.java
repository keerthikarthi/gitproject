package com.account.dto;



import java.time.LocalDate;

public class Employee {
	private int empNo;
	private String empName;
	private String job;
	private LocalDate hireDate;
	private double salary;
	private String deptName;
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String toString() {
		return getEmpNo() + "\t" +getEmpName() + "\t" + getJob() + "\t" + getHireDate() + "\t" + getSalary();
 	}

	public int getMgr() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getDeptNo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
