package gr.aueb.cf.ch2;

import java.util.Scanner;

/** Δίνει έναν διψήφιο ακέραιο και προσθέτει τα ψηφία του.
 * Για παράδειγμα, 32, 3 + 2 = 5.
 */
public class DigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;
        int inputNum = 0;

        System.out.println("Παρακαλώ εισάγετε ένα διψήφιο ακέραιο");
        inputNum = scanner.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sumOfDigits = leftDigit + rightDigit;

        System.out.printf("Input number: %d, Left digit: %d, Right digit: %d, Sum of digits: %d", inputNum, leftDigit, rightDigit, sumOfDigits);

    }
}
