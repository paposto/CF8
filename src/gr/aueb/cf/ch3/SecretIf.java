package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο και προσπαθεί
 * να μαντέψει ένα secret num. Αν το μαντέψει, τότε
 * κάνει Bingo!
 */
public class SecretIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 10;
        int inputNum;

        System.out.println("Παρακαλώ εισάγετε το μαγικό κλειδί");
        inputNum = scanner.nextInt();

        if (inputNum == SECRET) {
            System.out.println("Bingo!");
        }
    }
}
