package gr.aueb.cf.ch7;

/**
 * Ελέγχει αν ένα string είναι παλινδρομικό.
 * Για παράδειγμα, το "AttA" είναι παλινδρομικό.
 * Hint. Ο StringBuilder παρέχει την sb.reverse().
 * Hint. Ο StringBuilder παρέχει την sb.toString().
 */
public class StrPalindrome {
    public static void main(String[] args) {
        String s = "AttAB";
        System.out.println(isPalidrome(s));

    }

    public static boolean isPalidrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}

