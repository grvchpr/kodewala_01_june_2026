package com.kodewala.string5;

public class QueryBuilder {
	public static String query = "SELECT * FROM Employee ";

	public String buildQuery(String empId, int salary) {
		StringBuilder sqlQuery = new StringBuilder(query);
		if (empId != null) {
			sqlQuery.append("WHERE empId= " + empId);
		} else if (salary > 0) {
			sqlQuery.append("WHERE salary> " + salary);
		}
		sqlQuery.append(";");
		return sqlQuery.toString();
	}
}
