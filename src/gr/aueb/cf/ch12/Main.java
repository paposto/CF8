package gr.aueb.cf.ch12;

public class Main {

    public static void main(String[] args) {

        Student alice = new Student();

        alice.id = 10;
        alice.firstname = "Alice";
        alice.lastname = "W";

        System.out.println("ID: " + alice.id);                  //get id
        System.out.println("Firstname " + alice.firstname);     //get firstname
        System.out.println("Lastname " + alice.lastname);       //get lastname
    }
}
