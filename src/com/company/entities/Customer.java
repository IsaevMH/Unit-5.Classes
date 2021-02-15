package com.company.entities;
import javax.swing.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String lastName;
    private String address;
    private String creditCardNumber;
    private String bankAccountNumber;
    private Customer[] customers;

    public Customer(){
        customers = new Customer[]{
                new Customer(1, "Андреев", "Андрей", "Андреевич", "Москва", "4214 5231 4231 4234" , "5473 2742"),
                new Customer(2, "Бабаев", "Антон", "Анатольевич", "Санкт-Петербург", "4214 5600 3131 2134" , "1234 2742"),
                new Customer(2, "Коломин", "Валерий", "Васильевич", "Пятигорск", "4214 5631 2241 2030" , "1432 2142")
        };
    }
    public Customer(int id, String surname, String name, String lastName, String address, String creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
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

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void getInfo() {
        System.out.println(Arrays.toString(customers));
    }
}
