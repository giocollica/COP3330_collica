/*
    Giovanni Collica
    Programming Assignment 5
    COP 3330

    This java class is designed to be
    the main app class. It contains
    all the menus and necessary methods
    to ensure that each of the functions
    within each menu work properly.
 */

//necessary imports

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//app class
public class App {

    //main method
    public static void main(String[] args) {
        //call applicationMenu method
        applicationMenu();
    }

    //method to print out the application menu
    public static void printApplicationMenu(){
        System.out.println();
        System.out.println("Select Your Application");
        System.out.println("_______________________\n");
        System.out.println("1) task list");
        System.out.println("2) contact list");
        System.out.println("3) quit");
    }

    //method for application menu logic
    public static void applicationMenu() {
        printApplicationMenu();

        Scanner input = new Scanner(System.in);
        int choice = -1;

        //loop until valid choice is made by the user
        while (choice < 1 || choice > 3) {
            boolean continueLoop = true;

            do {
                try {
                    String choiceString = input.next();
                    choice = Integer.parseInt(choiceString);
                    continueLoop = false;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You must enter integers. Please try again.");
                    input.nextLine();
                }
            } while (continueLoop);


            if (choice == 1) {
                taskMainMenu();
            } else if (choice == 2) {
                contactMainMenu();
            } else if (choice == 3) {
                //exit the program
                System.exit(0);
            } else {
                System.out.println("Invalid input Try again");
                printApplicationMenu();
            }
        }
    }

    //print out Contact Main Menu for user
    public static void printContactMainMenu() {
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("_________\n");
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) quit");
    }

    //Contact Main Menu logic
    public static void contactMainMenu() {
        printContactMainMenu();

        Scanner input = new Scanner(System.in);
        int choice = -1;

        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList mainList = new ContactList(contactItemList);

        //loop until valid choice is made by the user
        while (choice < 1 || choice > 3) {
            boolean continueLoop = true;

            do {
                try {
                    String choiceString = input.next();
                    choice = Integer.parseInt(choiceString);
                    continueLoop = false;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You must enter integers. Please try again.");
                    input.nextLine();
                }
            } while (continueLoop);


            if (choice == 1) {
                //create a new list
                mainList = createNewContactList();
                contactOperationMenu(mainList);
            } else if (choice == 2) {
                try {
                    //load an existing list from a file
                    mainList = loadExistingContactList();
                    contactOperationMenu(mainList);
                } catch (FileNotFoundException fileNotFoundException) {
                    System.out.println("File was not found");
                    contactMainMenu();
                }

            } else if (choice == 3) {
                //exit the program
                applicationMenu();
            } else {
                System.out.println("Invalid input Try again");
                printContactMainMenu();
            }
        }
    }

    //method to create a new contact list
    public static ContactList createNewContactList() {
        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newList = new ContactList(contactItemList);
        return newList;
    }

    //method to load an existing contact list from a file
    public static ContactList loadExistingContactList() throws FileNotFoundException {
        //take user input on what file to load
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the file to load: ");
        String textFile = input.nextLine();

        ArrayList<ContactItem> contactItemList = new ArrayList<>();
        ContactList newList = new ContactList(contactItemList);

        File contactList = new File(textFile);

        Scanner sc = new Scanner(contactList);

        //run through the file to make sure every task is loaded into list
        while (sc.hasNext()) {
            String taskNumberRaw = sc.next();
            char taskNumberString = taskNumberRaw.charAt(0);
            int taskNumber = Integer.parseInt(String.valueOf(taskNumberString));
            System.out.println(taskNumber);

            //skip over Name:
            sc.next();

            String firstName = sc.next();
            String lastName = sc.next();

            System.out.println(firstName);
            System.out.println(lastName);

            //skip over Phone:
            sc.next();

            String numberString = sc.next();
            long phoneNumber = Long.parseLong(numberString);

            //skip over Email:
            sc.next();

            String email = sc.next();

            newList.addItemHardCode(firstName, lastName, phoneNumber, email);


        }

        return newList;
    }

    //print the contact operations menu
    public static void printContactOperationMenu() {
        System.out.println();
        System.out.println("List Operation Menu");
        System.out.println("___________________\n");
        System.out.println("1) view the list");
        System.out.println("2) add an item");
        System.out.println("3) edit an item");
        System.out.println("4) remove an item");
        System.out.println("5) save the current list");
        System.out.println("6) quit to the main menu");
    }

    //operations contact menu logic
    public static void contactOperationMenu(ContactList mainList) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        //loop until a valid choice is made
        while (choice != 8) {
            printContactOperationMenu();

            boolean continueLoop = true;

            do {
                try {
                    String choiceString = input.next();
                    choice = Integer.parseInt(choiceString);
                    continueLoop = false;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You must enter integers. Please try again.");
                    input.nextLine();
                }
            } while (continueLoop);


            if (choice == 1) {
                viewCurrentContactList(mainList);
            } else if (choice == 2) {
                mainList.addItem();
            } else if (choice == 3) {
                viewCurrentContactList(mainList);
                mainList.editItem();
            } else if (choice == 4) {
                viewCurrentContactList(mainList);
                mainList.removeItem();
            } else if (choice == 5) {
                saveToFileContact(mainList);
            } else if (choice == 6) {
                taskMainMenu();
            } else {
                System.out.println("Invalid input Try again");
                printContactOperationMenu();
            }
        }
    }

    //print out the current contact list
    public static void viewCurrentContactList(ContactList mainList) {
        System.out.println();
        System.out.println("Current Contacts");
        System.out.println("________________");

        for (int i = 0; mainList.getContactList().size() > i; i++) {
            System.out.println(i + ") Name: " + mainList.getContactList().get(i).getFirstName() + " " + mainList.getContactList().get(i).getLastName());
            System.out.println("Phone: " + mainList.getContactList().get(i).getPhoneNumber());
            System.out.println("Email: " + mainList.getContactList().get(i).getEmailAddress());
        }
    }

    //method to save the contact list to a file
    public static void saveToFileContact(ContactList mainList) {
        System.out.println("Enter the filename to save as: ");

        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();

        try (FileWriter savedListFile = new FileWriter(fileName)) {
            PrintWriter printWriter = new PrintWriter(savedListFile);
            for (int i = 0; mainList.getContactList().size() > i; i++) {
                printWriter.println(i + ") Name: " + mainList.getContactList().get(i).getFirstName() + " " + mainList.getContactList().get(i).getLastName());
                printWriter.println("Phone: " + mainList.getContactList().get(i).getPhoneNumber());
                printWriter.println("Email: " + mainList.getContactList().get(i).getEmailAddress());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File was not found");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    //print out Task Main Menu for user
    public static void printTaskMainMenu() {
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("_________\n");
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) quit");
    }

    //Task Main Menu logic
    public static void taskMainMenu() {
        printTaskMainMenu();

        Scanner input = new Scanner(System.in);
        int choice = -1;

        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList mainList = new TaskList(taskItemList);

        //loop until valid choice is made by the user
        while (choice < 1 || choice > 3) {
            boolean continueLoop = true;

            do {
                try {
                    String choiceString = input.next();
                    choice = Integer.parseInt(choiceString);
                    continueLoop = false;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You must enter integers. Please try again.");
                    input.nextLine();
                }
            } while (continueLoop);


            if (choice == 1) {
                //create a new list
                mainList = createNewTaskList();
                taskOperationMenu(mainList);
            } else if (choice == 2) {
                try {
                    //load an existing list from a file
                    mainList = loadExistingTaskList();
                    taskOperationMenu(mainList);
                } catch (FileNotFoundException fileNotFoundException) {
                    System.out.println("File was not found");
                    taskMainMenu();
                }

            } else if (choice == 3) {
                //exit the program
                applicationMenu();
            } else {
                System.out.println("Invalid input Try again");
                printTaskMainMenu();
            }
        }
    }

    //method to create a new task list
    public static TaskList createNewTaskList() {
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newList = new TaskList(taskItemList);
        return newList;
    }

    //method to load an existing task list from a file
    public static TaskList loadExistingTaskList() throws FileNotFoundException {
        //take user input on what file to load
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the file to load: ");
        String textFile = input.nextLine();

        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newList = new TaskList(taskItemList);

        File taskList = new File(textFile);

        Scanner sc = new Scanner(taskList);

        //run through the file to make sure every task is loaded into list
        while (sc.hasNext()) {
            String taskNumberRaw = sc.next();
            char taskNumberString = taskNumberRaw.charAt(0);
            int taskNumber = Integer.parseInt(String.valueOf(taskNumberString));
            System.out.println(taskNumber);

            String dueDateRaw = sc.next();
            String[] dueDateFirstStringArray = dueDateRaw.split("\\[", 2);
            String dueDateFirstIteration = dueDateFirstStringArray[1];

            String[] dueDateSecondStringArray = dueDateFirstIteration.split("-", 5);
            String dueDateSecondIteration = dueDateSecondStringArray[2];

            String dueDateYearString = dueDateSecondStringArray[0];
            int dueDateYear = Integer.parseInt(dueDateYearString);

            String dueDateMonthString = dueDateSecondStringArray[1];
            int dueDateMonth = Integer.parseInt(dueDateMonthString);

            String[] dueDateThirdStringArray = dueDateSecondIteration.split("\\]", 2);
            String dueDateDayString = dueDateThirdStringArray[0];
            int dueDateDay = Integer.parseInt(dueDateDayString);

            String titleRaw = sc.next();
            String[] titleStringArray = titleRaw.split(":", 2);
            String title = titleStringArray[0];

            String description = sc.next();

            newList.addItemHardCode(title, description, dueDateYear, dueDateMonth, dueDateDay);
        }

        return newList;
    }

    //print the task operations menu
    public static void printTaskOperationMenu() {
        System.out.println();
        System.out.println("List Operation Menu");
        System.out.println("___________________\n");
        System.out.println("1) view the list");
        System.out.println("2) add an item");
        System.out.println("3) edit an item");
        System.out.println("4) remove an item");
        System.out.println("5) mark an item as completed");
        System.out.println("6) unmark an item as completed");
        System.out.println("7) save the current list");
        System.out.println("8) quit to the main menu");
    }

    //operations task menu logic
    public static void taskOperationMenu(TaskList mainList) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        //loop until a valid choice is made
        while (choice != 8) {
            printTaskOperationMenu();

            boolean continueLoop = true;

            do {
                try {
                    String choiceString = input.next();
                    choice = Integer.parseInt(choiceString);
                    continueLoop = false;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You must enter integers. Please try again.");
                    input.nextLine();
                }
            } while (continueLoop);


            if (choice == 1) {
                viewCurrentTaskList(mainList);
            } else if (choice == 2) {
                mainList.addItem();
            } else if (choice == 3) {
                viewCurrentTaskList(mainList);
                mainList.editItem();
            } else if (choice == 4) {
                viewCurrentTaskList(mainList);
                mainList.removeItem();
            } else if (choice == 5) {
                viewUncompleteTasks(mainList);
                mainList.markCompleted();
            } else if (choice == 6) {
                viewCompleteTasks(mainList);
                mainList.markUncompleted();
            } else if (choice == 7) {
                saveToFileTask(mainList);
            } else if (choice == 8) {
                taskMainMenu();
            } else {
                System.out.println("Invalid input Try again");
                printTaskOperationMenu();
            }
        }
    }

    //print out the current task list
    public static void viewCurrentTaskList(TaskList mainList) {
        System.out.println();
        System.out.println("Current Tasks");
        System.out.println("_____________");

        for (int i = 0; mainList.getTaskItemList().size() > i; i++) {
            if (mainList.getTaskItemList().get(i).getComplete()) {
                System.out.println(i + ")" + " " + "*** " + "[" + mainList.getTaskItemList().get(i).getDueDateYear() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateMonth() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateDay() + "] "
                        + mainList.getTaskItemList().get(i).getTitle() + ": "
                        + mainList.getTaskItemList().get(i).getDescription());
            } else {
                System.out.println(i + ")" + "  " + "[" + mainList.getTaskItemList().get(i).getDueDateYear() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateMonth() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateDay() + "] "
                        + mainList.getTaskItemList().get(i).getTitle() + ": "
                        + mainList.getTaskItemList().get(i).getDescription());
            }
        }
    }

    //print out all uncomplete tasks
    public static void viewUncompleteTasks(TaskList mainList) {
        System.out.println();
        System.out.println("Uncompleted Tasks");
        System.out.println("_________________");

        for (int i = 0; mainList.getTaskItemList().size() > i; i++) {
            if (!mainList.getTaskItemList().get(i).getComplete()) {
                System.out.println(i + ")" + "  " + "[" + mainList.getTaskItemList().get(i).getDueDateYear() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateMonth() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateDay() + "] "
                        + mainList.getTaskItemList().get(i).getTitle() + ": "
                        + mainList.getTaskItemList().get(i).getDescription());
            }
        }
    }

    //print out all complete tasks
    public static void viewCompleteTasks(TaskList mainList) {
        System.out.println();
        System.out.println("Completed Tasks");
        System.out.println("_______________");

        for (int i = 0; mainList.getTaskItemList().size() > i; i++) {
            if (mainList.getTaskItemList().get(i).getComplete()) {
                System.out.println(i + ")" + "  " + "[" + mainList.getTaskItemList().get(i).getDueDateYear() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateMonth() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateDay() + "] "
                        + mainList.getTaskItemList().get(i).getTitle() + ": "
                        + mainList.getTaskItemList().get(i).getDescription());
            }
        }
    }

    //method to save the task list to a file
    public static void saveToFileTask(TaskList mainList) {
        System.out.println("Enter the filename to save as: ");

        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();

        try (FileWriter savedListFile = new FileWriter(fileName)) {
            PrintWriter printWriter = new PrintWriter(savedListFile);
            for (int i = 0; mainList.getTaskItemList().size() > i; i++) {
                printWriter.println(i + ")" + "  " + "[" + mainList.getTaskItemList().get(i).getDueDateYear() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateMonth() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateDay() + "] "
                        + mainList.getTaskItemList().get(i).getTitle() + ": "
                        + mainList.getTaskItemList().get(i).getDescription());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File was not found");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
