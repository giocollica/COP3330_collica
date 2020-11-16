import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private ArrayList<TaskItem> taskItemList = new ArrayList<>();

    public TaskList(ArrayList<TaskItem> taskItemList){
        this.taskItemList = taskItemList;
    }

    public void addItem(){
        Scanner input = new Scanner(System.in);
        TaskItem newItem = new TaskItem("null", "null", 0000,
                                            00, 00, false);

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
    }

    public void addItemHardCode(String title, String description, int dueDateYear, int dueDateMonth, int dueDateDay){
        Scanner input = new Scanner(System.in);
        TaskItem newItem = new TaskItem(title, description, dueDateYear,
                dueDateMonth, dueDateDay, false);

        this.taskItemList.add(newItem);
    }

    public void removeItem(){
        Scanner input = new Scanner(System.in);

        System.out.print("Which task will you remove? ");
        String taskToRemoveString = input.next();
        int taskToRemove = Integer.parseInt(taskToRemoveString);

        this.taskItemList.remove(taskToRemove);
    }

    public void editItem(){
        Scanner input = new Scanner(System.in);

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
    }

    public void markCompleted(){
        Scanner input = new Scanner(System.in);

        System.out.println("Which task will you mark as completed? ");
        int taskToEdit = input.nextInt();

        this.taskItemList.get(taskToEdit).setComplete(true);
    }

    public void markUncompleted(){
        Scanner input = new Scanner(System.in);

        System.out.println("Which task will you unmark as completed? ");
        int taskToEdit = input.nextInt();

        this.taskItemList.get(taskToEdit).setComplete(false);
    }

    public ArrayList<TaskItem> getTaskItemList(){
        return this.taskItemList;
    }
}
