import java.util.*;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100100);
        ATM atm = new ATM(account);
        atm.start();
    }
}