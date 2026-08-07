package com.kodewala.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.entity.Employee;
import com.kodewala.exception.EmployeeNotFoundException;
import com.kodewala.repository.IEmployeeRepository;
import com.kodewala.service.IEmployeeService;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepository;

	@Override
	@Transactional
	public Long saveEmployee(Employee employee) {
		return employeeRepository.save(employee).getEmpId();
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(Long id) throws EmployeeNotFoundException {
		if (!employeeRepository.existsById(id)) {
			throw new EmployeeNotFoundException("Employee not found with Id:" + id);
		}
		employeeRepository.deleteById(id);
	}

	@Override
	// @Transactional(readOnly = true)
	public Employee getOneEmployee(Long id) throws EmployeeNotFoundException {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with Id:" + id));
	}

	@Override
	// @Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
}
