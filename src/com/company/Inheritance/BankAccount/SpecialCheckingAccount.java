package com.company.Inheritance.BankAccount;

public class SpecialCheckingAccount extends CheckingAccount{
    private double interest;
    private double minimumBalance;
    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double inter, double minBal){
        super(idNumber,startBal,cc);
        interest = inter;
        minimumBalance = minBal;
    }
    public double monthlyInterest(){
        double ret = (super.currentBalance()*interest)/12;
        if(super.currentBalance() > minimumBalance){
            return ret;
        }
            return super.monthlyInterest();
    }
}
