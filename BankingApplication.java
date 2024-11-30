
package com.mycompany.bankingapplication;


public class BankingApplication {

    public static void main(String[] args) {

        BankAccount Account1 = new BankAccount(12345, 10000);
        BankAccount Account2 = new BankAccount(64789,20000);
        
        System.out.println("Account1 AccountNumber" + " " +Account1.getAccountNumber() + " " + " " + "intialBalance" +  " " + Account1.getCurrentBalance());
        System.out.println("=========================");
        System.out.println("Account2 AccountNumber" + " " +Account2.getAccountNumber() + "  " + " "    + "intialBalance" +  " " +Account2.getCurrentBalance());
        
        Account1.deposit(500);
        Account2.Withdraw(1000);
        
        System.out.println("Deposit Account 1$" + " "  + Account1.getCurrentBalance());
        System.out.println("=========================");
        System.out.println("Deposit Account 2$" + " " +Account2.getCurrentBalance());
        
    }
}
