package com.kodewala.service;

import com.kodewala.entity.Employee;
import java.lang.Long;
import java.util.List;

/**
 * @author:GOURAV CHOPRA 
 *  Generated F/w:SHWR-Framework 
 */
public interface IEmployeeService {
	Long saveEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(Long id);

	Employee getOneEmployee(Long id);

	List<Employee> getAllEmployees();
}
