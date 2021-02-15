package com.company.task2;

import com.company.entities.Customer;

import java.math.BigInteger;

public class TaskTwo {
    public void runTaskTwo(){
        Customer customer = new Customer();
        //customer.getInfo();
        customer.getInfo(new BigInteger("420000000000000"), new BigInteger("430000000000000"));
    }
}
