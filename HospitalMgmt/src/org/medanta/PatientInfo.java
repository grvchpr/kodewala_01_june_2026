package org.medanta;

public interface PatientInfo {
	public void displayPatientInfo();

	public void registerPatient();

	public void checkAppointment();

	public void checkPatientHistory();

	public void dischargePatient();

	public default void teleConsultation() {
		System.out.println("Teleconsultation is not available for this ward");
	}
}
