package com.kodewala.service.impl;

import com.kodewala.entity.Employee;
import com.kodewala.repo.EmployeeRepository;
import com.kodewala.service.IEmployeeService;
import java.lang.Long;
import java.lang.Override;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author:GOURAV CHOPRA 
 *  Generated F/w:SHWR-Framework 
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {
  @Autowired
  private EmployeeRepository repo;

  @Override
  @Transactional
  public Long saveEmployee(Employee employee) {
    return repo.save(employee).getId();
  }

  @Override
  @Transactional
  public void updateEmployee(Employee employee) {
    repo.save(employee);
  }

  @Override
  @Transactional
  public void deleteEmployee(Long id) {
    repo.deleteById(id);
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public Employee getOneEmployee(Long id) {
    return repo.findById(id).get();
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public List<Employee> getAllEmployees() {
    return repo.findAll();
  }
}
