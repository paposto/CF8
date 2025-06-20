package gr.aueb.cf.ch3;

/**
 * Ελέγχει όλες τις περιπτώσει με if-then-else.
 */
import java.util.Scanner;

public class SecretIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 10;
        int inputNum;

        System.out.println("Παρακαλώ εισάγετε το μαγικό κλειδί");
        inputNum = scanner.nextInt();

        if (inputNum == SECRET) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Fail. Please try again!");
        }
    }
}
