package edu.vsit.cj.pracs.prac3.bank;

public class SavingsAccount extends Account {
    private double interest; // Rate of Interest

    public SavingsAccount(int a, double interest) {
        super(a);
        this.interest = interest;
    }

    public void addInterest() {
        this.deposit(this.interest / 100.0 * this.getBalance());
    }
}
