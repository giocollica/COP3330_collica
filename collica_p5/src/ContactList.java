import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<ContactItem> contactList = new ArrayList<>();

    public ContactList(ArrayList<ContactItem> contactList) {
        this.contactList = contactList;
    }

    //method to add item to the contactList
    public void addItem() {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);
                Scanner inputInt = new Scanner(System.in);
                ContactItem newItem = new ContactItem("null", "null", 1111111111, "email@email.com");

                System.out.println();

                System.out.print("First name: ");
                String newFirstName = input.nextLine();
                newItem.setFirstName(newFirstName);

                System.out.print("Last name: ");
                String newLastName = input.nextLine();
                newItem.setLastName(newLastName);

                System.out.print("Phone number (XXXXXXXXXX): ");
                long newPhoneNumber = inputInt.nextLong();
                newItem.setPhoneNumber(newPhoneNumber);

                System.out.print("Email address (x@y.z): ");
                String newEmailAddress = input.next();
                newItem.setEmailAddress(newEmailAddress);

                this.contactList.add(newItem);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }
    }

    //method to add item to the contactlist for testing purposes
    public void addItemHardCode(String firstName, String lastName, long phoneNumber, String emailAddress) {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);
                ContactItem newItem = new ContactItem(firstName, lastName, phoneNumber, emailAddress);

                this.contactList.add(newItem);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }
    }

    //method to remove item from a contactlist
    public void removeItem() {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println();

                System.out.print("Which contact will you remove? ");
                String taskToRemoveString = input.next();
                int taskToRemove = Integer.parseInt(taskToRemoveString);

                this.contactList.remove(taskToRemove);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }
    }

    //method to remove item from a contactlist for testing purposes
    public void removeItemHardCode(int taskToRemove) throws IndexOutOfBoundsException {
        this.contactList.remove(taskToRemove);
    }

    //method to edit an item of a contact list
    public void editItem() {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println();

                System.out.println("Which contact will you edit? ");
                int contactToEdit = input.nextInt();

                System.out.println("Enter a new first name for contact " + contactToEdit + ":");
                String newFirstName = input.nextLine();
                this.contactList.get(contactToEdit).setFirstName(newFirstName);

                System.out.println("Enter a new last name for contact " + contactToEdit + ":");
                String newLastName = input.nextLine();
                this.contactList.get(contactToEdit).setLastName(newLastName);

                System.out.println("Enter a new phone number (XXXXXXXXXX) for contact " + contactToEdit + ":");
                int newPhoneNumber = input.nextInt();
                this.contactList.get(contactToEdit).setPhoneNumber(newPhoneNumber);

                System.out.println("Enter a new email address (x@y.z) for contact " + contactToEdit + ":");
                String newEmailAddress = input.nextLine();
                this.contactList.get(contactToEdit).setEmailAddress(newEmailAddress);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }
    }

    public ArrayList<ContactItem> getContactList() {
        return contactList;
    }
}
