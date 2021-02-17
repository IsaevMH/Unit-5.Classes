package com.company.entities;

import java.util.Arrays;

enum Binding {
    Hardcover,
    Softcover
}
public class Book {
    /*
    id,
    Название,
    Автор (ы),
    Издательство,
    Год издания,
    Количество страниц,
    Цена,
    Тип переплета.
     */
    private int id;
    private String name;
    private String[] authors;
    private String publishHouse;
    private String date;
    private int pages;
    private double price;
    private Binding binding;
    private Book[] books;

    public Book(){
        books = new Book[] {
                new Book(1, "The Fellowship of the Ring", new String[] {"J. R. R. Tolkien"}, "Allen & Unwin", "1954", 1221, 30, Binding.Hardcover),
                new Book(2, "Pride and Prejudice", new String[] {"Jane Austen"}, "Whitehall", "1813", 1534, 59, Binding.Hardcover),
                new Book(3, "His Dark Materials", new String[] {"Philip Pullman"}, "Scholastic", "1995", 832, 23.99, Binding.Softcover),
                new Book(4, "The Hitchhiker's Guide to the Galaxy", new String[] {"Douglas Adams"}, "Scholastic", "1995", 432, 19.99, Binding.Softcover),
                new Book(5, "Harry Potter and the Goblet of Fire ", new String[] {"J. K. Rowling"}, "Bloomsbury", "2010", 799, 49.99, Binding.Hardcover)
        };
    }
    public Book(int id, String name, String[] authors, String publishHouse, String date, int pages, double price, Binding binding) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishHouse = publishHouse;
        this.date = date;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublishHouse() {
        return publishHouse;
    }
    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    public Binding getBinding() {
        return binding;
    }
    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    public void showInfo(String pubHouse){
        for (Book b : books) {
            if(b.publishHouse.equals(pubHouse)){
                System.out.println(
                        b.name + " "
                        + Arrays.toString(b.authors) + " "
                        + b.publishHouse + " "
                        + b.date + " "
                        + b.pages + " "
                        + b.price + " "
                        + b.binding
                );
            }
        }
    }
    public void showInfo(int date){
        for (Book b : books) {
            if(date == Integer.parseInt(b.date)){
                System.out.println(
                        b.name + " "
                                + Arrays.toString(b.authors) + " "
                                + b.publishHouse + " "
                                + b.date + " "
                                + b.pages + " "
                                + b.price + " "
                                + b.binding
                );
            }
        }
    }
}
