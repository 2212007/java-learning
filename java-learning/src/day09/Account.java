package day09;

public class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                throw new InsufficientBalanceException("余额不足，差" + (amount-balance));
            }
        }
    }
}
