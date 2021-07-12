public class Account {
    private double balance;
    
    /** Creates a new instance of Account */

    public Account(double initBalance) {
        balance = initBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amt) {
        balance = balance + amt;
    }
    
    public void withdraw(double amt) {
        if (amt <= balance) {
            balance = balance - amt;
        }
    }
}
