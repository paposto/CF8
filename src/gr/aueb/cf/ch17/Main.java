package gr.aueb.cf.ch17;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book.Builder(1, "12889")
                .author("Petros")
                .title("Java Intro")
                .build();
    }
}
