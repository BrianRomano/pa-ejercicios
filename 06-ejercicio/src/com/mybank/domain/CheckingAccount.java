package com.mybank.domain;

public class CheckingAccount extends Account {
   
    
    private double overdraftAmount;// representa el monto descubierto, esto es cuando la cuenta tiene un saldo deudor.
    
    public CheckingAccount(double initBalance, double overdraftAmount) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0.0);
    }
    
    public boolean withdraw(double amount) {
        boolean result = true;
        
        if ( balance < amount ) {
            
            // Not enough balance to cover the amount requested to withdraw
            // Check if there is enough in the overdraft protection (if any)
            double overdraftNeeded = amount - balance;
            if ( overdraftAmount < overdraftNeeded ) {
                
                // No overdraft protection or not enough to cover the amount needed
                result = false;
            } else {
                
                // Yes, there is overdraft protection and enough to cover the amount
                balance = 0.0;
                overdraftAmount -= overdraftNeeded;
            }
            
        } else {
            
            // Yes, there is enough balance to cover the amount
            // Proceed as usual
            balance = balance - amount;
        }
        
        return result;
    }
}
