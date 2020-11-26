/*
    Giovanni Collica
    Programming Assignment 5
    COP 3330

    This java class contains the constructor
    and necessary methods for ContactItem
 */

public class ContactItem {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String emailAddress;

    //constructor
    public ContactItem(String firstName, String lastName, long phoneNumber, String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    //Get and set methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
