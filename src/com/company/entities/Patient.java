package com.company.entities;

import java.util.GregorianCalendar;

public class Patient {
    private int id;
    private String surname;
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private int numberOfMedicalCard;
    private String diagnosis;
    private Patient[] patients;

    public Patient(){
        patients = new Patient[]{
                new Patient(1, "Васильев", "Василий", "Васильевич", "Москва", "89642124351", 100, "Гастрит"),
                new Patient(2, "Леонтьев", "Василий", "Андреевич", "Санкт-Петербург", "89622120051", 101, "Панкреатит"),
                new Patient(3, "Оденцов", "Андрей", "Витальевич", "Москва", "89642124351", 102, "Грипп"),
                new Patient(5, "Кондратьев", "Иван", "Витальевич", "Санкт-Петербург", "89052314351", 103, "Грипп"),
                new Patient(6, "Алтуфьев", "Петр", "Витальевич", "Саратов", "89652121321", 104, "Ковид"),
                new Patient(7, "Калинин", "Кирилл", "Витальевич", "Волгоград", "89441124252", 105, "Гастрит"),
                new Patient(8, "Воложин", "Олег", "Витальевич", "Москва", "89642114153", 106, "Гастрит")
        };
    }
    public Patient(int id, String surname, String name, String lastName, String address, String phone, int numberOfMedicalCard, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.numberOfMedicalCard = numberOfMedicalCard;
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void showInfo(String diag) {
        for (Patient patient : patients) {
            if(patient.getDiagnosis().equals(diag))
                System.out.println(patient.surname
                        + " " + patient.name
                        + " " + patient.lastName
                        + " " + patient.diagnosis);
        }
    }

    public void showInfo(int start, int end){
        for (Patient patient : patients) {
            if(patient.numberOfMedicalCard > start && patient.numberOfMedicalCard < end){
                System.out.println(patient.surname
                        + " " + patient.name
                        + " " + patient.lastName
                        + " " + patient.numberOfMedicalCard);
            }
        }
    }
}
