package org.medanta;

public class ICU implements PatientInfo {

	@Override
	public void displayPatientInfo() {
		System.out.println("Displaying patient information in ICU");
	}

	@Override
	public void registerPatient() {
		System.out.println("Registering patient in ICU");
	}

	@Override
	public void checkAppointment() {
		System.out.println("Checking appointment in ICU");
	}

	@Override
	public void checkPatientHistory() {
		System.out.println("Checking patient history in ICU");
	}

	@Override
	public void dischargePatient() {
		System.out.println("Discharging patient from ICU");
	}

}
