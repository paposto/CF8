package gr.aueb.cf.ch6;

/**
 * Βρίσκει το ελάχιστο ή το μέγιστο ενός πίνακα
 * υποθέτοντας ότι το αρχικό min είναι το MAXINT
 * (Integer.MAX_VALUE) και αντίστοιχα για το max,
 * το αρχικό max είναι το MIN Integer Value.
 */
public class ArrayMInMax2 {
    public static void main(String[] args) {

    }

    public static int getMinPosition (int[] arr) {
        if (arr == null || arr.length < 1) return  -1;

        int maxValue = Integer.MAX_VALUE;
        int maxPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
