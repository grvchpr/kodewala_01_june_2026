package org.medanta;

public class Emergency implements PatientInfo {

	@Override
	public void displayPatientInfo() {
		System.out.println("Displaying patient information in Emergency Ward");
	}

	@Override
	public void registerPatient() {
		System.out.println("Registering patient in Emergency Ward");
	}

	@Override
	public void checkAppointment() {
		System.out.println("Checking appointment in Emergency Ward");
	}

	@Override
	public void checkPatientHistory() {
		System.out.println("Checking patient history in Emergency Ward");
	}

	@Override
	public void dischargePatient() {
		System.out.println("Discharging patient from Emergency Ward");
	}

}
