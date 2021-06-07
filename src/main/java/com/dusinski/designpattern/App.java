package com.dusinski.designpattern;

import com.dusinski.designpattern.builder.BankAccount;

public class App {
    public static void main(String[] args) {

//        double aa = 2.2;
//        double bb = 2.3;
//        BigDecimal a = new BigDecimal(aa+"");
//        BigDecimal b = new BigDecimal(bb+"");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.add(b).doubleValue());


        BankAccount account1 = new BankAccount.BankAccountBuilder(12345).build();
        System.out.println(account1);


        BankAccount account2 = new BankAccount
                .BankAccountBuilder(54321)
                .atBranch("Warsaw")
                .withOwner("Kowalski")
                .withBalance(120)
                .build();
        System.out.println(account2);


    }
}
