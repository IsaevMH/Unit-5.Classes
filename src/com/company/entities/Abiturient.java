package com.company.entities;

import java.util.Arrays;

public class Abiturient {
    private int id;
    private String surname;
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private int[] grades;
    private Abiturient[] abiturients;

    public Abiturient() {
        abiturients = new Abiturient[]{
                new Abiturient(1, "Васильев", "Василий", "Васильевич", "Москва", "89642124351", new int[]{3, 2, 4}),
                new Abiturient(2, "Леонтьев", "Василий", "Андреевич", "Санкт-Петербург", "89622120051", new int[]{4, 5, 4}),
                new Abiturient(3, "Оденцов", "Андрей", "Витальевич", "Москва", "89642124351", new int[]{3, 2, 3}),
                new Abiturient(5, "Кондратьев", "Иван", "Витальевич", "Санкт-Петербург", "89052314351", new int[]{3, 3, 3}),
                new Abiturient(6, "Алтуфьев", "Петр", "Витальевич", "Саратов", "89652121321", new int[]{5, 5, 5}),
                new Abiturient(7, "Калинин", "Кирилл", "Витальевич", "Волгоград", "89441124252", new int[]{4, 5, 5}),
                new Abiturient(8, "Воложин", "Олег", "Витальевич", "Москва", "89642114153", new int[]{3, 2, 2})
        };
    }

    public Abiturient(int id, String surname, String name, String lastName, String address, String phone, int[] grades) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void showInfo() {
        for (Abiturient abiturient : abiturients) {
            for (int grade : abiturient.grades) {
                if (grade < 3 && grade > 1)
                    System.out.println(abiturient.surname
                            + " " + abiturient.name
                            + " " + abiturient.lastName
                            + " " + Arrays.toString(abiturient.grades));
            }
        }
    }

    public void showInfo(int maxValue) {
        for (Abiturient abiturient : abiturients) {
            int summ = 0;
            for (int grade : abiturient.grades)
                summ += grade;
            if (summ > maxValue) {
                System.out.println(abiturient.surname
                        + " " + abiturient.name
                        + " " + abiturient.lastName
                        + " " + summ);
            }
        }
    }

    public void showInfo(double count) {
        sort();
        for (int i = 0; i < count; i++) {
                System.out.println(abiturients[i].surname
                        + " " + abiturients[i].name
                        + " " + abiturients[i].lastName
                        + " " + Arrays.toString(abiturients[i].grades));
        }
    }

    public void sort() {
        for (int i = 0; i < abiturients.length; i++) {
            for (int j = i+1; j < abiturients.length; j++) {
                int ikSum = 0;
                int jkSum = 0;
                for (int ik = 0; ik < abiturients[i].grades.length; ik++)
                    ikSum += abiturients[i].grades[ik];
                for (int jk = 0; jk < abiturients[j].grades.length; jk++)
                    jkSum += abiturients[j].grades[jk];
                if (ikSum < jkSum) {
                    var temp = abiturients[i];
                    abiturients[i] = abiturients[j];
                    abiturients[j] = temp;
                }
            }
        }
    }
}
