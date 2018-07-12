package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private final Account account = new Account();

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        assertThat(account.balance, is(0));

        account.deposit(100);
        assertThat(account.balance, is(100));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.deposit(100);
        assertThat(account.balance, is(100));

        account.withdraw(50);
        assertThat(account.balance, is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account.deposit(30);
        assertThat(account.balance, is(30));

        account.withdraw(50);
        assertThat(account.balance, is(30));
    }
}
