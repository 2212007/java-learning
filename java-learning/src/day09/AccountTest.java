package day09;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(100);
        // extends RuntimeException时编译器不逼着加try
        // account.withdraw(50);
        try {
            account.withdraw(30);
        } catch (InsufficientBalanceException e) {
            throw new RuntimeException(e);
        }
        System.out.println(account.getBalance());
        try {
            account.withdraw(200);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(account.getBalance());
    }
}
