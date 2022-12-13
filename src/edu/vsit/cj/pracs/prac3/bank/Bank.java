package edu.vsit.cj.pracs.prac3.bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<Account>();
    }

    public void update() {
        for(Account account: this.accounts) {
            if(account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            }
            if(account instanceof CurrentAccount) {
                if(((CurrentAccount) account).inOverdraft()) {
                    System.out.println("Overdraft Email Sent to Account " + account.getAccountNumber());
                }
            }
        }
    }

    public void openAccount(Account account) {
        this.accounts.add(account);
    }

    public void closeAccount(int accnum) {
        for(Account account: this.accounts) {
            if(account.getAccountNumber() == accnum) {
                this.accounts.remove(account);
                break;
            }
        }
    }

    public void payDividend(double amount) {
        for(Account account: this.accounts) {
            account.deposit(amount);
        }
    }
}
