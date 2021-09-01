package com.account.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.account.dto.Employee;



public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> empList=new ArrayList<Employee>();
	@Override
	public Employee findEmployeeById(int empId) {
		Connection conn;
		try {
			conn = DBUtil.getDBConnection();
			PreparedStatement pstmt = conn.prepareStatement("select empno, ename, job, hiredate, sal, dept_name"
					+"from emp e, department_master d where empno = ? and e.deptno = d.dept_code");
			pstmt.setInt(1,  empId);
			ResultSet rs = pstmt.executeQuery();
			Employee employee = new Employee();
			while( rs.next()) {
				employee.setEmpNo(rs.getInt("empno"));
				employee.setEmpName(rs.getString("ename"));
				employee.setJob(rs.getString("job"));
				employee.setHireDate(rs.getDate("hireDate").toLocalDate());
				employee.setSalary(rs.getDouble("sal"));
				empList.add(employee);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return null;
	}
	
	public void insertEmployee( Employee e)
	{
		Connection conn = null;
		try {
			conn = DBUtil.getDBConnection();
			String sql = "insert into values(?, ?, ?, ?, ?, ?, ?, ?,)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, e.getEmpNo());
			pstmt.setString(2, e.getEmpName());
			pstmt.setString(3,e.getJob());
			pstmt.setInt(4, e.getMgr());
			pstmt.setDate(5,Date.valueOf(e.getHireDate()));
			pstmt.setDouble(6, e.getSalary());
			pstmt.setDouble(7,0.0);
			pstmt.setInt(8, e.getDeptNo());
			
			int count = pstmt.executeUpdate();
			
			System.out.println("record is inserted successfully ");
			
		}catch(SQLException exp) {
			exp.printStackTrace();
		}finally {
    		if(conn != null) {
    			try {
    				conn.close();
    			}catch(SQLException ep) {
    				ep.printStackTrace();
    			}
    		}
		}		//public List<Employee> getEmployees()
	}
	//{
		//System.out.println("Dao - in getEmployees");
		//	Employee employee=new Employee();
		//employee.setEmpNo(1);
		//employee.setEmpName("hemant");
		//employee.setHireDate(LocalDate.of(2016, 07, 02));
		//employee.setSalary(80000);
		//employee.setJob("Developer");
		//empList.add(employee);
		//employee=new Employee();
		//employee.setEmpNo(2);
		//employee.setEmpName("varsha");
		//employee.setHireDate(LocalDate.of(2016, 07, 02));
		//employee.setSalary(10000);
		//employee.setJob("Developer");
		//empList.add(employee);
		//employereturn empList;
	
		
	//}
	
	
	@Override
	public List<Employee> findEmployeeByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}
    public void insertEmployeeWithValues() {
    	Connection conn = null;
    	try {
    		conn = DBUtil.getDBConnection();
    		Statement stmt = conn.createStatement();
    		int count = stmt.executeUpdate("insert into emp values(5,'sachin','sales',2,'12-jan-2010',1200,12,4)");
    	    System.out.println("record is inserted successfully !!" + count);
    	}catch (SQLException e) {
    		e.printStackTrace();
    	}finally {
    		if(conn != null) {
    			try {
    				conn.close();
    			}catch(SQLException e) {
    				e.printStackTrace();
    		
    			}
    		}
    	}
    	
    }
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}