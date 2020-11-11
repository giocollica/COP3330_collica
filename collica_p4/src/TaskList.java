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
        String newTitle = input.next();
        newItem.setTitle(newTitle);

        System.out.print("Task description: ");
        String newDescription = input.next();
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

    public ArrayList<TaskItem> getTaskItemList(){
        return this.taskItemList;
    }
}
