package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Chat input as byter (Latin).
 */
public class CharlInput1 {

    public static void main(String[] args) throws IOException {
        int inputChar = ' ';

        System.out.println("Παρακαλώ εισάγετε ένα χαρακτήρα");
        inputChar = System.in.read();

        System.out.println("char: " + (char) inputChar);
    }
}
