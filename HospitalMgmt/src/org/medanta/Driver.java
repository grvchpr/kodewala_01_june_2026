package org.medanta;

public class Driver {

	public static void main(String[] args) {

		/*
		 * PatientInfo emergencyWard = new Emergency();
		 * emergencyWard.displayPatientInfo();
		 * emergencyWard.teleConsultation();
		 * 
		 * emergencyWard.registerPatient();
		 * emergencyWard.checkAppointment();
		 * emergencyWard.checkPatientHistory();
		 * 
		 * emergencyWard.dischargePatient();
		 */

		PatientInfo generalWard = new GeneralWard();
		generalWard.displayPatientInfo();
		generalWard.teleConsultation();
		/*
		 * generalWard.registerPatient();
		 * generalWard.checkAppointment();
		 * generalWard.checkPatientHistory();
		 */
		generalWard.dischargePatient();
		
		System.out.println();

		PatientInfo icu = new ICU();
		icu.displayPatientInfo();
		icu.teleConsultation();
		/*
		 * icu.registerPatient();
		 * icu.checkAppointment();
		 * icu.checkPatientHistory();
		 */
		icu.dischargePatient();

		/*
		 * System.out.println();
		 * 
		 * PatientInfo opd = new OPD();
		 * opd.displayPatientInfo();
		 * opd.registerPatient();
		 * opd.checkAppointment();
		 * opd.checkPatientHistory();
		 * opd.dischargePatient();
		 */
	}

}
