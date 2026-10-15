package day04;

public class TestBankAccount {

    public static void main(String[] args){
        BankAccount account = new BankAccount();
        System.out.println(account.count);
        System.out.println(BankAccount.count);
        BankAccount account1 = new BankAccount();
        System.out.println(account1.count);
        System.out.println(BankAccount.count);
        BankAccount account2 = new BankAccount();
        System.out.println(account2.count);
        System.out.println(BankAccount.count);



    }
}
