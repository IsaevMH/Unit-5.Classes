package com.company.task1;

import com.company.entities.Student;
import java.util.GregorianCalendar;

public class TaskOne {
    public void RunTaskOne(){
        //TASK1
        Student student = new Student();
        //TASK1.1
        student.showInfo("Математика");
        System.out.println("==========================================");
        //TASK1.2
        student.showInfo("Информатика", 1);
        System.out.println("==========================================");
        //TASK1.3
        student.showInfo(new GregorianCalendar(1991, 0, 0));
        System.out.println("==========================================");
        //TASK1.4
        student.showInfo(1011);
    }
}
