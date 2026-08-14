package com.kodewala.gourav;

public class Test {

	public static void main(String[] args) {
		try {
			ModuleInfo info = new ModuleInfo("Employee", "com.kodewala", Long.class,
					"/Users/gourav/kodewala_01_june_2026");
			EntityGen.generate(info);
			RepositoryGen.generate(info);
			ServiceGen.generate(info);
			CustomExceptionGen.generate(info);
			ServiceImplGen.generate(info);
			ControllerGen.generate(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("STARTED!!");
	}
}
