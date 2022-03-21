package com.company.Inheritance.BankAccount;

public class SavingsAccount extends Account{
    public double interest;
    public SavingsAccount(int id, double startBal,double inter){
        super(id,startBal);
        interest = inter;
    }
    public double monthlyInterest(){
        return (super.currentBalance()*interest)/12;
    }
    public void withdraw(double amount){
        if(super.currentBalance() >= amount){
            decreaseBalance(amount);
        }
    }
}
