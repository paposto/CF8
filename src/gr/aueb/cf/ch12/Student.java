package gr.aueb.cf.ch12;

/**
 * very simple data class
 */

public class Student {
    public int id;
    public String firstname;
    public String lastname;

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
