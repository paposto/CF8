package gr.aueb.cf.ch2;

/**
 * Προσομειώνει ένα τυχαίο ζάρι. Δηλαδή παράγει
 * ένα τυχαίο ακέραιο μεταξύ 1-6.
 */

public class RandomApp {

    public static void main(String[] args) {
        int dice = 0;

        // (max - min + 1) + min
        dice = (int) (Math.random() * 6) + 1;
        // (type) value
        System.out.println(dice);
    }
}
