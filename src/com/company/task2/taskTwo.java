package com.company.task2;

import com.company.entities.Customer;

import java.math.BigInteger;

public class taskTwo {
    public void runTaskTwo(){
        Customer customer = new Customer();
        customer.getInfo();
        customer.getInfo(new BigInteger("40000000000000"), new BigInteger("50000000000000"));
    }
}
