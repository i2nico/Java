package com.banking;

public class Saver extends Account{

    private float interestRate;

    public Saver(double balance, int accountNumber) {
        super(balance, accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    public double withdraw(double amount) {
        if (amount > 0 && 0 < (getBalance() - amount)) {
            setBalance(getBalance() - amount);
            return getBalance();
        }
        else {
            System.out.println("U cannot withdraw more money than u have.");
            return -1;
        }
    }

    @Override
    public double deposit(double amount) {
        if (amount > 0){
            setBalance(getBalance() + amount);
            return getBalance();
        }
        else {
            System.out.println("U cannot deposit negative amount of money.");
            return -1;
        }
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
}
