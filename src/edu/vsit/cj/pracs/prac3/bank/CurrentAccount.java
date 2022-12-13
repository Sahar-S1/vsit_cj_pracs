package edu.vsit.cj.pracs.prac3.bank;

public class CurrentAccount extends Account {
    private double limit; // Overdraft Limit

    public CurrentAccount(int a, double limit) {
        super(a);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public boolean inOverdraft() {
        return (this.getBalance() > 0);
    }

    @Override
    public void withdraw(double sum) {
        if((this.getBalance() - sum) + this.limit > 0) {
            super.withdraw(sum);
        } else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }
}
