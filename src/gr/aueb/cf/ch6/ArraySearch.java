package gr.aueb.cf.ch6;

/**
 * Αναζητά εάν στοιχείο σε ένα πίνακα και
 * επιστρέφει τη θέση του στοιχείου στον πίνακα
 * ή -1 αν δεν υπάρχει το στοιχείο.
 */
public class ArraySearch {

    public static void main(String[] args) {

    }

    /**
     * Επιστρέφει το 1ο στοιχείο του πίνακα που ισούται
     * με την τιμή αναζήτησης. Αν δεν υπάρχει το στοιχείο, επιστρέψει
     * -1.
     * @param arr       o input πίνακας.
     * @param value     η τιμή αναζήτησης.
     * @return          το position του πίνακα που βρέθηκε το στοιχείο,
     *                  -1 otherwise.
     */
    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

}
