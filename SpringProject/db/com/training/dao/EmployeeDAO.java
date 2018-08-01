package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;
import com.training.mappers.EmployeeMapper;

public class EmployeeDAO implements IEmployeeDAO{
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;
	
	
	

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		
		
		String sql="select empid, empname, empsal from employee where empid=?";
		
	//	Employee employee = jdbcTemplateObject.queryForObject(sql, new Object[] {empId},new BeanPropertyRowMapper<Employee>(Employee.class));
		
		Employee employee = jdbcTemplateObject.queryForObject(sql, new Object[] {empId},new EmployeeMapper());
		
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		
		
		
		String sql="select * from employee";
		
		List<Employee> employee = jdbcTemplateObject.query(sql, new Object[] {},new BeanPropertyRowMapper<Employee>(Employee.class));
		return employee;
		
/*		List<Employee> list = new ArrayList<>();
		
		List<Map<String,Object>> employees = jdbcTemplateObject.queryForList(sql);
		
		
		for(Map row : employees) {
			
			Employee emp= new Employee();
			emp.setEmpId(Integer.parseInt(row.get("empid").toString()));
			emp.setEmpName(row.get("empname").toString());
			emp.setEmpSal(Double.parseDouble(row.get("empsal").toString()));

			
			
			list.add(emp);
			
			
		}
		
		
		
		return list;  */
	}

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		
		String sql="insert into employee (empid,empname,empsal)"+"values(?,?,?)";
		jdbcTemplateObject.update(sql, employee.getEmpId(),employee.getEmpName(),employee.getEmpSal());
		
		System.out.println("Record created "+employee);
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
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		
		
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
		
		
	}

}
