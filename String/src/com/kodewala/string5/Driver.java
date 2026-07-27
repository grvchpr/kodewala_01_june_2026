package com.kodewala.string5;

public class Driver {

	public static void main(String[] args) {
		QueryBuilder builder = new QueryBuilder();

		String query = builder.buildQuery(null, 10000);

		System.out.println("\nGenerated SQL Query:");
		System.out.println(query + ";");
	}

}
