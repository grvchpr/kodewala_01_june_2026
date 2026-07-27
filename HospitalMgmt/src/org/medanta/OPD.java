package org.medanta;

public class OPD implements PatientInfo {

	@Override
	public void displayPatientInfo() {
		System.out.println("Displaying patient information in OPD");
	}

	@Override
	public void registerPatient() {
		System.out.println("Registering patient in OPD");
	}

	@Override
	public void checkAppointment() {
		System.out.println("Checking appointment in OPD");
	}

	@Override
	public void checkPatientHistory() {
		System.out.println("Checking patient history in OPD");
	}

	@Override
	public void dischargePatient() {
		System.out.println("Discharging patient from OPD");
	}

	@Override
	public void teleConsultation() {
		System.out.println("Teleconsultation is available for OPD patients");
	}

}
