
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account acc = new Account("Horace", 100);
        acc.deposit(20);
        System.out.println(acc);
    }

}
