package org.example;

public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient (String patientId, String name, int age, String diagnosis){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        if (diagnosis == null || diagnosis.isEmpty()){
            throw new IllegalArgumentException("Diagnosis cannot be empty");
        }
        this.diagnosis = diagnosis;
    }

    public void updateDiagnosis(String newDiagnosis){
        this.diagnosis = newDiagnosis;
        System.out.println("Diagnosis updated successfully to: " + newDiagnosis);
    }
}
