package doctors;


import human.Human;
import patients.Patient;

public class Doctor extends Human {

    public void curePatient(Patient patient) {
        System.out.println("curing... patient " + patient);


    }

}
