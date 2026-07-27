package org.medanta;

public class GeneralWard implements PatientInfo {

	@Override
	public void displayPatientInfo() {
		System.out.println("Displaying patient information in General Ward");
	}

	@Override
	public void registerPatient() {
		System.out.println("Registering patient in General Ward");
	}

	@Override
	public void checkAppointment() {
		System.out.println("Checking appointment in General Ward");
	}

	@Override
	public void checkPatientHistory() {
		System.out.println("Checking patient history in General Ward");
	}

	@Override
	public void dischargePatient() {
		System.out.println("Discharging patient from General Ward");
	}

	@Override
	public void teleConsultation() {
		System.out.println("Teleconsultation is available for General Ward patients");
	}

}
