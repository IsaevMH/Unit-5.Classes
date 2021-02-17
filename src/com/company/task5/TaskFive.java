package com.company.task5;

import com.company.entities.Book;

public class TaskFive {
    public void runTaskFive(){
        Book book = new Book();
        book.showInfo(1813);
        System.out.println("========================");
        book.showInfo("Allen & Unwin");
    }
}
