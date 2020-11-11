import java.util.ArrayList;

public class App {

    public static void main(String[] args){
        printMainMenu();
        printOperationMenu();
        TaskList mainList = createNewList();

        mainList.addItem();

        viewCurrentList(mainList);
    }

    public static void printMainMenu(){
        System.out.println("Main Menu");
        System.out.println("_________\n");
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) quit");
    }

    public static TaskList createNewList(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newList = new TaskList(taskItemList);
        return newList;
    }

    public static void printOperationMenu(){
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

    public static void viewCurrentList(TaskList mainList){
        for(int i = 0; mainList.getTaskItemList().size() > i; i++){
            System.out.println("[" + mainList.getTaskItemList().get(i).getDueDateYear() + "-"
                                + mainList.getTaskItemList().get(i).getDueDateMonth() + "-"
                                + mainList.getTaskItemList().get(i).getDueDateDay() + "] "
                                + mainList.getTaskItemList().get(i).getTitle() + ": "
                                + mainList.getTaskItemList().get(i).getDescription());
        }
    }

}
