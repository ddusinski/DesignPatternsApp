package com.dusinski.designpattern.builder;

public class BankAccount {
    private long accountNumber;
    private String branch;
    private int balance;
    private String owner;

    private BankAccount() {
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                '}';
    }

    public static class BankAccountBuilder {
        private final long builderAccountNumber;
        private String builderBranch;
        private int builderBalance;
        private String builderOwner;


        public BankAccountBuilder(long number) {
            this.builderAccountNumber = number;
        }

        public BankAccountBuilder atBranch(String branchName) {
            this.builderBranch = branchName;
            return this;
        }

        public BankAccountBuilder withOwner(String ownerName) {
            this.builderOwner = ownerName;
            return this;
        }

        public BankAccountBuilder withBalance(int balance) {
            this.builderBalance = balance;
            return this;
        }

        public BankAccount build() {
            BankAccount newBankAccount = new BankAccount();
            newBankAccount.accountNumber = this.builderAccountNumber;
            newBankAccount.branch = this.builderBranch;
            newBankAccount.balance = this.builderBalance;
            newBankAccount.owner = this.builderOwner;
            return newBankAccount;
        }

    }

}
