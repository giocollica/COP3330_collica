import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private ArrayList<TaskItem> TaskList = new ArrayList<>();

    public void addItem(){
        Scanner input = new Scanner(System.in);
        TaskItem newItem = new TaskItem("null", "null", "null", false);

        System.out.print("Task title: ");
        String newTitle = input.next();
        newItem.setTitle(newTitle);

        System.out.println("Task description: ");
        String newDescription = input.next();
        newItem.setDescription(newDescription);

        System.out.println("Task due date (YYYY-MM-DD): ");
        String newDueDate = input.next();
        newItem.setDueDate(newDueDate);

        this.TaskList.add(newItem);
    }
}
