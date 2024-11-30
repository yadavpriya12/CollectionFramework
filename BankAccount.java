
package com.mycompany.bankingapplication;


public class BankAccount {
    
    private int AccountNumber ;
    private double CurrentBalance;

    public BankAccount(int AccountNumber, double CurrentBalance) {
        this.AccountNumber = AccountNumber;
        this.CurrentBalance = CurrentBalance;
    }
    
    public BankAccount(){
        this.AccountNumber = 0;
        this.CurrentBalance = 0;
    }
    
    
   public double deposit(double Amount){
       CurrentBalance = CurrentBalance + Amount;
       return CurrentBalance;
   }
   
   
   public double Withdraw(double Amount){
       CurrentBalance = CurrentBalance - Amount;
       return CurrentBalance;
   }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getCurrentBalance() {
        return CurrentBalance;
    }
   
   
}
