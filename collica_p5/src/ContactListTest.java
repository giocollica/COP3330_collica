/*
    Giovanni Collica
    Programming Assignment 5
    COP 3330

    This java class contains all the
    tests provided by the assignment
    to ensure that the code is working.
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactListTest {
    @Test
    public void addingItemsIncreasesSize(){
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newContactList = new ContactList(contactItemList);

        int size = 0;

        newContactList.addItemHardCode("Test", "Test", 2020, "Test");
        newContactList.addItemHardCode("Test", "Test", 2020, "Test");
        assertEquals(newContactList.getContactList().size(), size + 2);
    }


    @Test
    public void editingItemsFailsWithAllBlankValues(){

    }


    @Test
    public void editingItemsFailsWithInvalidIndex(){
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newContactList = new ContactList(contactItemList);

        newContactList.addItemHardCode("Test", "Test", 2020, "Test");
        newContactList.addItemHardCode("Test", "Test", 2020, "Test");

        assertThrows(IndexOutOfBoundsException.class, () -> newContactList.getContactList().get(2).setFirstName("This is a test"));
    }


    @Test
    public void editingSucceedsWithBlankFirstName(){
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newContactList = new ContactList(contactItemList);

        newContactList.addItemHardCode("Test", "Test", 2020, "Test");
        newContactList.addItemHardCode("Test", "Test", 2020, "Test");

        newContactList.getContactList().get(0).setFirstName("");

        assertEquals(newContactList.getContactList().get(0).getFirstName(), "");
    }


    @Test
    public void editingSucceedsWithBlankLastName(){
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newContactList = new ContactList(contactItemList);

        newContactList.addItemHardCode("Test", "Test", 2020, "Test");
        newContactList.addItemHardCode("Test", "Test", 2020, "Test");

        newContactList.getContactList().get(0).setLastName("");

        assertEquals(newContactList.getContactList().get(0).getLastName(), "");
    }


    @Test
    public void editingSucceedsWithBlankPhone(){
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newContactList = new ContactList(contactItemList);

        newContactList.addItemHardCode("Test", "Test", 2020, "Test");
        newContactList.addItemHardCode("Test", "Test", 2020, "Test");

        newContactList.getContactList().get(0).setPhoneNumber(0);

        assertEquals(newContactList.getContactList().get(0).getPhoneNumber(), 0);
    }


    @Test
    public void editingSucceedsWithNonBlankValues(){
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newContactList = new ContactList(contactItemList);

        newContactList.addItemHardCode("Test", "Test", 2020, "Test");
        newContactList.addItemHardCode("Test", "Test", 2020, "Test");

        newContactList.getContactList().get(0).setFirstName("This is a test");
        newContactList.getContactList().get(0).setLastName("This is a test");

        assertEquals(newContactList.getContactList().get(0).getFirstName(), "This is a test");
        assertEquals(newContactList.getContactList().get(0).getLastName(), "This is a test");
    }


    @Test
    public void newListIsEmpty(){
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newContactList = new ContactList(contactItemList);

        assertEquals(newContactList.getContactList().size(), 0);
    }


    @Test
    public void removingItemsDecreasesSize(){
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newContactList = new ContactList(contactItemList);

        int size = 0;

        newContactList.addItemHardCode("Test", "Test", 2020, "Test");
        newContactList.addItemHardCode("Test", "Test", 2020, "Test");

        newContactList.removeItemHardCode(0);

        assertEquals(newContactList.getContactList().size(), size + 1);
    }


    @Test
    public void removingItemsFailsWithInvalidIndex(){
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newContactList = new ContactList(contactItemList);

        int size = 0;

        newContactList.addItemHardCode("Test", "Test", 2020, "Test");
        newContactList.addItemHardCode("Test", "Test", 2020, "Test");

        assertThrows(IndexOutOfBoundsException.class, () -> newContactList.removeItemHardCode(2));
    }


    @Test
    public void savedContactListCanBeLoaded(){

    }
}
