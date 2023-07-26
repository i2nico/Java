package com.banking;
import java.util.ArrayList;
import java.util.Collection.*;

public class Main {
    public static void main(String[] args) {

        Account s1 = new Saver(0.0, 0);
        Account s2 = new Saver(10.0, 1);

        s1.deposit(10000.0);

        s2.deposit(-10000.0);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(s1);
        accounts.add(s2);

        for (int i = 0; i < accounts.size(); i++){
            System.out.println(accounts.get(i).getBalance());
        }

    }
}