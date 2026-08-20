package com.kodewala.exception;

import java.lang.RuntimeException;
import java.lang.String;

public class EmployeeNotFoundException extends RuntimeException {
  public EmployeeNotFoundException() {
  }

  public EmployeeNotFoundException(String message) {
    super(message);
  }
}
