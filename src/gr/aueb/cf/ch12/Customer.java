package gr.aueb.cf.ch12;

public class Customer {
    private int id;
    private String firstname;
    private String lastname;
    private String vat;
    private String phoneNo;
    private String region;
    private String prefecture;
    private String city;
    private String street;
    private String streetNo;
    private String zipCode;

    public Customer () {

    }

    public Customer(int id, String firstname, String lastname, String vat, String phoneNo, String region, String prefecture, String city, String street, String streetNo, String zipCode) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.vat = vat;
        this.phoneNo = phoneNo;
        this.region = region;
        this.prefecture = prefecture;
        this.city = city;
        this.street = street;
        this.streetNo = streetNo;
        this.zipCode = zipCode;
    }

}
