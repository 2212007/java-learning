package day09;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message) {
        super(message);
    }
}
