/*
    Giovanni Collica
    Programming Assignment 5
    COP 3330

    This java class contains the constructor
    and necessary methods for TaskList
 */

//necessary imports

import java.util.ArrayList;
import java.util.Scanner;

//TaskList class
public class TaskList {
    private ArrayList<TaskItem> taskItemList = new ArrayList<>();

    //constructor
    public TaskList(ArrayList<TaskItem> taskItemList) {
        this.taskItemList = taskItemList;
    }

    //method to add item to the tasklist
    public void addItem() {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);
                TaskItem newItem = new TaskItem("null", "null", 0000,
                        00, 00, false);

                System.out.println();

                System.out.print("Task title: ");
                String newTitle = input.nextLine();
                newItem.setTitle(newTitle);

                System.out.print("Task description: ");
                String newDescription = input.nextLine();
                newItem.setDescription(newDescription);

                System.out.print("Task due date year (YYYY): ");
                String newDueDateYear = input.next();
                newItem.setDueDateYear(Integer.parseInt(newDueDateYear));
                System.out.print("Task due date month (MM): ");
                String newDueDateMonth = input.next();
                newItem.setDueDateMonth(Integer.parseInt(newDueDateMonth));
                System.out.print("Task due date day (DD): ");
                String newDueDateDay = input.next();
                newItem.setDueDateDay(Integer.parseInt(newDueDateDay));

                this.taskItemList.add(newItem);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }


    }

    //method to add item to the tasklist for testing purposes
    public void addItemHardCode(String title, String description, int dueDateYear, int dueDateMonth, int dueDateDay) {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);
                TaskItem newItem = new TaskItem(title, description, dueDateYear,
                        dueDateMonth, dueDateDay, false);

                this.taskItemList.add(newItem);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }


    }

    //method to remove item from a tasklist
    public void removeItem() {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println();

                System.out.print("Which task will you remove? ");
                String taskToRemoveString = input.next();
                int taskToRemove = Integer.parseInt(taskToRemoveString);

                this.taskItemList.remove(taskToRemove);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }


    }

    //method to remove item from a tasklist for testing purposes
    public void removeItemHardCode(int taskToRemove) throws IndexOutOfBoundsException {
        this.taskItemList.remove(taskToRemove);
    }

    //method to edit an item of a task list
    public void editItem() {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println();

                System.out.println("Which task will you edit? ");
                int taskToEdit = input.nextInt();

                System.out.println("Enter a new title for task " + taskToEdit + ":");
                String newTitle = input.nextLine();
                this.taskItemList.get(taskToEdit).setTitle(newTitle);

                System.out.println("Enter a new description for task " + taskToEdit + ":");
                String newDescription = input.nextLine();
                this.taskItemList.get(taskToEdit).setDescription(newDescription);

                System.out.println("Enter a new due date year (YYYY) for task " + taskToEdit + ":");
                int newDueDateYear = input.nextInt();
                this.taskItemList.get(taskToEdit).setDueDateYear(newDueDateYear);
                System.out.println("Enter a new due date month (MM) for task " + taskToEdit + ":");
                int newDueDateMonth = input.nextInt();
                this.taskItemList.get(taskToEdit).setDueDateMonth(newDueDateMonth);
                System.out.println("Enter a new due date day (DD) for task " + taskToEdit + ":");
                int newDueDateDay = input.nextInt();
                this.taskItemList.get(taskToEdit).setDueDateDay(newDueDateDay);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }


    }

    //method to mark a task as completed
    public void markCompleted() {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println();

                System.out.println("Which task will you mark as completed? ");
                int taskToEdit = input.nextInt();

                this.taskItemList.get(taskToEdit).setComplete(true);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }
    }

    //method to mark a task as completed for testing purposes
    public void markCompletedHardCode(int taskNumber) throws IndexOutOfBoundsException {
        this.taskItemList.get(taskNumber).setComplete(true);
    }

    //method to mark a task as uncompleted
    public void markUncompleted() {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println();

                System.out.println("Which task will you unmark as completed? ");
                int taskToEdit = input.nextInt();

                this.taskItemList.get(taskToEdit).setComplete(false);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }


    }

    //method to mark a task as uncompleted for testing purposes
    public void markUncompletedHardCode(int taskNumber) {
        boolean continueLoop = true;

        //loop to ensure that valid input is given
        //if not the user can try again
        while (continueLoop) {
            try {
                this.taskItemList.get(taskNumber).setComplete(false);

                continueLoop = false;
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index does not exist. Please try again.");
            }
        }
    }

    //method to get the task item list
    public ArrayList<TaskItem> getTaskItemList() {
        return this.taskItemList;
    }
}