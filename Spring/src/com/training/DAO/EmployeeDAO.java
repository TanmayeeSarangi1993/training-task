package com.training.DAO;

import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.Employee;
import com.training.entity.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO  {

	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateobject;
	
	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		String sql = "select empid,empname,empsal from employee where empid=?";
		Employee employee = jdbcTemplateobject.queryForObject(sql, new Object[] {empId},new BeanPropertyRowMapper<Employee>(Employee.class));
		return employee;
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		String sql = "select empid,empname,empsal from employee";
		
		List<Employee> list = new ArrayList<>();
		List<Map<String,Object>> rows = jdbcTemplateobject.queryForList(sql);
		
		for(Map row : rows) {
			Employee employee = new Employee();
			employee.setEmpId(Integer.parseInt(row.get("empid").toString()));
			employee.setEmpName(row.get("empname").toString());
			employee.setEmpsal(Double.parseDouble(row.get("empsal").toString()));
			list.add(employee);
		}
		
		return list;
	}

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
	 String sql = "insert into employee(empid,empname,empsal)" + "values(?,?,?)";
	 jdbcTemplateobject.update(sql,
			 employee.getEmpId(),
			 employee.getEmpName(),
			 employee.getEmpsal());
	 System.out.println("record created"+employee);
	 return;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(int empId, double empNewSalary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDataSource(DataSource datasource) {
		// TODO Auto-generated method stub
		this.dataSource = datasource;
		this.jdbcTemplateobject = new JdbcTemplate(datasource); 
		
	}

}
