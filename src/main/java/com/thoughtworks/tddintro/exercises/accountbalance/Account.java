package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public Integer balance = 0;

    public void deposit(Integer amount){
        balance += amount;
    }

    public void withdraw(Integer amount){
        if (balance - amount > 0){
            balance -= amount;
        }
    }
}
