package com.kodewala.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.entity.Employee;
import com.kodewala.exception.EmployeeNotFoundException;
import com.kodewala.service.IEmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = { "http://localhost:4200", "http://127.0.0.1:4200" })
@Tag(name = "Employee API", description = "Endpoints for frontend CRUD testing")
public class EmployeeRestController {

	private final IEmployeeService employeeService;

	public EmployeeRestController(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping
	@Operation(summary = "Get all employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return ResponseEntity.ok(employeeService.getAllEmployees());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get employee by id")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) throws EmployeeNotFoundException {
		return ResponseEntity.ok(employeeService.getOneEmployee(id));
	}

	@PostMapping
	@Operation(summary = "Create employee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		// Ignore any incoming id during create to prevent stale-update behavior.
		employee.setEmpId(null);
		Long id = employeeService.saveEmployee(employee);
		employee.setEmpId(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}

	@PutMapping("/{id}")
	@Operation(summary = "Update employee")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee)
			throws EmployeeNotFoundException {
		// Validate existence before update so frontend gets a clear 404 for bad ids.
		employeeService.getOneEmployee(id);
		employee.setEmpId(id);
		employeeService.updateEmployee(employee);
		return ResponseEntity.ok(employee);
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Delete employee")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id) throws EmployeeNotFoundException {
		employeeService.deleteEmployee(id);
		return ResponseEntity.ok("Employee deleted with Id:" + id);
	}
}
