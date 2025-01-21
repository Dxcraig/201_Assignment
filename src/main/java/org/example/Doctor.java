package org.example;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;
    private int patientsTreated;

    public Doctor (String doctorId, String name, String specialization){
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }
}
