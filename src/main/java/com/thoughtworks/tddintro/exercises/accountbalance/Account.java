package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public Integer balance = 0;

    public void deposit(Integer amount){
        balance += amount;
    }
}
