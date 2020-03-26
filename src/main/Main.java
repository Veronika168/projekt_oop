package main;

import doctors.Doctor;
import patients.Patient;

public class Main {
    public static void main(String[] args) {
    Doctor doctor = new Doctor();
    Patient patient = new Patient();
    doctor.curePatient(patient);
}

}
