package gr.aueb.cf.ch12;

/**
 * very simple data class
 * Data, Default constructor kaι getters
 * και setters με convention
 * ονομάζονται JavaBean.
 */

public class Student {
    private int id;
    private String firstname;
    private  String lastname;

    /**
     * Default constructor
     */
    public Student() {

    }

    /**
     * Overloaded constructor
     *
     * @param id
     * @param firstname
     * @param lastname
     */
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
