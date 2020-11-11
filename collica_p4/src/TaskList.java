import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private ArrayList<TaskItem> taskItemList = new ArrayList<>();

    public TaskList(ArrayList<TaskItem> taskItemList){
        this.taskItemList = taskItemList;
    }

    public void addItem(){
        Scanner input = new Scanner(System.in);
        TaskItem newItem = new TaskItem("null", "null", "null", false);

        System.out.print("Task title: ");
        String newTitle = input.next();
        newItem.setTitle(newTitle);

        System.out.print("Task description: ");
        String newDescription = input.next();
        newItem.setDescription(newDescription);

        System.out.print("Task due date (YYYY-MM-DD): ");
        String newDueDate = input.next();
        newItem.setDueDate(newDueDate);

        this.taskItemList.add(newItem);
    }

    public ArrayList<TaskItem> getTaskItemList(){
        return this.taskItemList;
    }
}
