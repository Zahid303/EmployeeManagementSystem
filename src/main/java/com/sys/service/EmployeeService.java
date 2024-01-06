package com.sys.service;

import java.util.List;

import com.sys.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);
}
