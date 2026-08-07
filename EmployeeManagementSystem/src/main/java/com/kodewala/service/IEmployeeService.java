package com.kodewala.service;

import java.util.List;

import com.kodewala.entity.Employee;
import com.kodewala.exception.EmployeeNotFoundException;

public interface IEmployeeService {
	Long saveEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(Long id) throws EmployeeNotFoundException;

	Employee getOneEmployee(Long id) throws EmployeeNotFoundException;

	List<Employee> getAllEmployees();
}
