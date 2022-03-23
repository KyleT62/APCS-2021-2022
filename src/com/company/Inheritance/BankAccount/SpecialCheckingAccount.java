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
        if(super.currentBalance() > minimumBalance){
            return (super.currentBalance()*interest)/12;
        }
            return super.monthlyInterest();
    }
    public void clearCheck(double amount)
    {
        if(super.currentBalance() > minimumBalance){
            super.decreaseBalance(amount);
        } else {
            super.clearCheck(amount);
        }
    }
}
