package day04;

public class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if(amount<0) return ;
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }


    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("Insufficient balance");
            return;

        }
        balance -= amount;
    }
    BankAccount(){
        count++;
    }

    static int count;
}
