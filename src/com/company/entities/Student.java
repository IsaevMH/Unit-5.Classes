package com.company.entities;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String lastName;
    private Calendar birth;
    private String address;
    private long phone;
    private String faculty;
    private int course;
    private int group;
    private Student[] studentsFaculty;

    public Student() {
        studentsFaculty = new Student[]{
                new Student(1, "Васильев", "Василий", "Васильевич", new GregorianCalendar(1994, 0, 15), "Информатика", 1, 1011),
                new Student(2, "Леонтьев", "Василий", "Андреевич", new GregorianCalendar(1995, 0, 15), "Информатика", 1, 1011),
                new Student(3, "Оденцов", "Андрей", "Витальевич", new GregorianCalendar(1994, 0, 15), "Математика", 1, 2011),
                new Student(5, "Кондратьев", "Иван", "Витальевич", new GregorianCalendar(1990, 0, 15), "Математика", 4, 2014),
                new Student(6, "Алтуфьев", "Петр", "Витальевич", new GregorianCalendar(1990, 0, 15), "Математика", 4, 2014),
                new Student(7, "Калинин", "Кирилл", "Витальевич", new GregorianCalendar(1993, 0, 15), "Математика", 2, 2012),
                new Student(8, "Воложин", "Олег", "Витальевич", new GregorianCalendar(1992, 0, 15), "Математика", 3, 2013)
        };
    }

    public Student(int id, String surname, String name, String lastName, Calendar birth, String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.birth = birth;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
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

    public int getCourse() {
        return course;
    }

    public Calendar getBirth() {
        return birth;
    }

    public int getGroup() {
        return group;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirth(Calendar birth) {
        this.birth = birth;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Student[] getStudentsFaculty() {
        return studentsFaculty;
    }

    public void showInfo(String faculty) {
        for (Student student : getStudentsFaculty()) {
            if (student.getFaculty().equals(faculty))
                System.out.println(student.name
                        + " " + student.surname
                        + " " + student.lastName
                        + " " + student.faculty);
        }
    }

    public void showInfo(String faculty, int course) {
        for (Student student : getStudentsFaculty()) {
            if (student.getFaculty().equals(faculty) && student.getCourse() == course)
                System.out.println(student.name
                        + " " + student.surname
                        + " " + student.lastName
                        + " " + student.faculty
                        + " " + student.course);
        }
    }

    public void showInfo(Calendar year) {
        for (Student student : getStudentsFaculty()) {
            if (student.getBirth().compareTo(year) > 0) {
                System.out.println(student.name
                        + " " + student.surname
                        + " " + student.lastName
                        + " " + student.birth.getTime());
            }
        }
    }

    public void showInfo(int group) {
        for (Student student : getStudentsFaculty()) {
            if (student.getGroup() == group) {
                System.out.println(student.name
                        + " " + student.surname
                        + " " + student.lastName
                        + " " + student.group);
            }
        }
    }
}
