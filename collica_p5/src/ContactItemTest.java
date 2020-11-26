/*
    Giovanni Collica
    Programming Assignment 5
    COP 3330

    This java class contains all the
    tests provided by the assignment
    to ensure that the code is working.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactItemTest {
    @Test
    public void creationFailsWithAllBlankValues(){

    }

    @Test
    public void creationSucceedsWithBlankEmail(){
        ContactItem newContact = new ContactItem("Test", "Test", 2020, "");

        String expectedEmail = "";

        assertEquals(newContact.getEmailAddress(), expectedEmail);
    }

    @Test
    public void creationSucceedsWithBlankFirstName(){
        ContactItem newContact = new ContactItem("", "Test", 2020, "Test");

        String expectedFirstName = "";

        assertEquals(newContact.getFirstName(), expectedFirstName);
    }

    @Test
    public void creationSucceedsWithBlankLastName(){
        ContactItem newContact = new ContactItem("Test", "", 2020, "Test");

        String expectedLastName = "";

        assertEquals(newContact.getLastName(), expectedLastName);
    }

    @Test
    public void creationSucceedsWithBlankPhone(){
        ContactItem newContact = new ContactItem("Test", "Test", 0, "Test");

        long expectedPhoneNumber = 0;

        assertEquals(newContact.getPhoneNumber(), expectedPhoneNumber);
    }

    @Test
    public void creationSucceedsWithNonBlankValues(){
        ContactItem newContact = new ContactItem("Test", "Test", 2020, "Test");

        String expectedFirstName = "Test";
        String expectedLastName = "Test";
        long expectedPhoneNumber = 2020;
        String expectedEmail = "Test";

        assertEquals(newContact.getFirstName(), expectedFirstName);
        assertEquals(newContact.getLastName(), expectedLastName);
        assertEquals(newContact.getPhoneNumber(), expectedPhoneNumber);
        assertEquals(newContact.getEmailAddress(), expectedEmail);
    }

    @Test
    public void editingFailsWithAllBlankValues(){

    }

    @Test
    public void editingSucceedsWithBlankEmail(){
        ContactItem newContact = new ContactItem("Test", "Test", 2020, "Test");

        String expectedEmail = "";

        newContact.setEmailAddress(expectedEmail);

        assertEquals(newContact.getEmailAddress(), expectedEmail);
    }

    @Test
    public void editingSucceedsWithBlankFirstName(){
        ContactItem newContact = new ContactItem("Test", "Test", 2020, "Test");

        String expectedFirstName = "";

        newContact.setFirstName("");

        assertEquals(newContact.getFirstName(), expectedFirstName);
    }

    @Test
    public void editingSucceedsWithBlankLastName(){
        ContactItem newContact = new ContactItem("Test", "Test", 2020, "Test");

        String expectedLastName = "";

        newContact.setLastName("");

        assertEquals(newContact.getLastName(), expectedLastName);
    }

    @Test
    public void editingSucceedsWithBlankPhone(){
        ContactItem newContact = new ContactItem("Test", "Test", 2020, "Test");

        long expectedPhoneNumber = 0;

        newContact.setPhoneNumber(0);

        assertEquals(newContact.getPhoneNumber(), expectedPhoneNumber);
    }

    @Test
    public void editingSucceedsWithNonBlankValues(){
        ContactItem newContact = new ContactItem("Test", "Test", 2020, "Test");

        String expectedFirstName = "This is a test";
        String expectedLastName = "This is a test";
        long expectedPhoneNumber = 2021;
        String expectedEmail = "This is a test";

        newContact.setFirstName(expectedFirstName);
        newContact.setLastName(expectedLastName);
        newContact.setEmailAddress(expectedEmail);
        newContact.setPhoneNumber(expectedPhoneNumber);

        assertEquals(newContact.getFirstName(), expectedFirstName);
        assertEquals(newContact.getLastName(), expectedLastName);
        assertEquals(newContact.getPhoneNumber(), expectedPhoneNumber);
        assertEquals(newContact.getEmailAddress(), expectedEmail);
    }

    @Test
    public void testToString(){

    }
}
