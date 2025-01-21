package org.example;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("P001", "John Smith", 45, "Fever");
        Doctor doctor1 = new Doctor("D101", "Dr. Alice", "General Medicine");


        try {
            patient1.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            patient1.setDiagnosis("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }



        patient1.updateDiagnosis("Flu");
        doctor1.treatPatient();

    }
}