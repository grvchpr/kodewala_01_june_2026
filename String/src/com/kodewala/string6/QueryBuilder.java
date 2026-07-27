package com.kodewala.string6;

public class QueryBuilder {
	static String query = "select * from employee";

	public static String buildQuery(Employee employee) {
		StringBuilder finalQuery = new StringBuilder(query);
		boolean isFirstCondition = false;
		if (employee.getEmpId() != 0) {
			finalQuery.append(" where empId=").append("'").append(employee.getEmpId()).append("'");
			isFirstCondition = true;
		}
		if (isFirstCondition) {
			finalQuery.append(" and salary>").append("'").append(employee.getSalary()).append("'");
		} else {
			finalQuery.append(" where salary>").append("'").append(employee.getSalary()).append("'");
		}
		return finalQuery.append(";").toString();
	}
}
