import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        mainMenu();
    }

    public static void printMainMenu(){
        System.out.println("Main Menu");
        System.out.println("_________\n");
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) quit");
    }

    public static void mainMenu(){
        printMainMenu();

        Scanner input = new Scanner(System.in);
        int choice = -1;

        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList mainList = new TaskList(taskItemList);

        while(choice < 1 || choice > 3){
            boolean continueLoop = true;

            do{
                try{
                    String choiceString = input.next();
                    choice = Integer.parseInt(choiceString);
                    continueLoop = false;
                }catch(NumberFormatException numberFormatException){
                    System.out.println("You must enter integers. Please try again.");
                    input.nextLine();
                }
            }while(continueLoop);


            if(choice == 1){
                mainList = createNewList();
                operationMenu(mainList);
            }else if(choice == 2){
                try{
                    mainList = loadExistingList();
                    operationMenu(mainList);
                }catch (FileNotFoundException fileNotFoundException) {
                    System.out.println("File was not found");
                    mainMenu();
                }

            }else if(choice == 3){
                System.exit(0);
            }else{
                System.out.println("Invalid input Try again");
                printMainMenu();
            }
        }
    }

    public static TaskList createNewList(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newList = new TaskList(taskItemList);
        return newList;
    }

    public static TaskList loadExistingList() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the file to load: ");
        String textFile = input.nextLine();

        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newList = new TaskList(taskItemList);

        File taskList = new File(textFile);

        Scanner sc = new Scanner(taskList);

        while (sc.hasNext()){
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

    public static void operationMenu(TaskList mainList){
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while(choice != 8){
            printOperationMenu();

            boolean continueLoop = true;

            do{
                try{
                    String choiceString = input.next();
                    choice = Integer.parseInt(choiceString);
                    continueLoop = false;
                }catch(NumberFormatException numberFormatException){
                    System.out.println("You must enter integers. Please try again.");
                    input.nextLine();
                }
            }while(continueLoop);


            if(choice == 1){
                viewCurrentList(mainList);
            }else if(choice == 2){
                mainList.addItem();
            }else if(choice == 3){
                viewCurrentList(mainList);
                mainList.editItem();
            }else if(choice == 4){
                viewCurrentList(mainList);
                mainList.removeItem();
            }else if(choice == 5){
                viewUncompleteTasks(mainList);
                mainList.markCompleted();
            }else if(choice == 6){
                viewCompleteTasks(mainList);
                mainList.markUncompleted();
            }else if(choice == 7){
                saveToFile(mainList);
            }else if(choice == 8){
                mainMenu();
            }else{
                System.out.println("Invalid input Try again");
                printMainMenu();
            }
        }
    }

    public static void viewCurrentList(TaskList mainList){
        System.out.println("Current Tasks");
        System.out.println("_____________");

        for(int i = 0; mainList.getTaskItemList().size() > i; i++) {
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

    public static void viewUncompleteTasks(TaskList mainList){
        System.out.println("Uncompleted Tasks");
        System.out.println("_________________");

        for(int i = 0; mainList.getTaskItemList().size() > i; i++){
            if(!mainList.getTaskItemList().get(i).getComplete()){
                System.out.println(i + ")" + "  "+ "[" + mainList.getTaskItemList().get(i).getDueDateYear() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateMonth() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateDay() + "] "
                        + mainList.getTaskItemList().get(i).getTitle() + ": "
                        + mainList.getTaskItemList().get(i).getDescription());
            }
        }
    }

    public static void viewCompleteTasks(TaskList mainList){
        System.out.println("Completed Tasks");
        System.out.println("_______________");

        for(int i = 0; mainList.getTaskItemList().size() > i; i++){
            if(mainList.getTaskItemList().get(i).getComplete()){
                System.out.println(i + ")" + "  "+ "[" + mainList.getTaskItemList().get(i).getDueDateYear() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateMonth() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateDay() + "] "
                        + mainList.getTaskItemList().get(i).getTitle() + ": "
                        + mainList.getTaskItemList().get(i).getDescription());
            }
        }
    }

    public static void saveToFile(TaskList mainList){
        try(FileWriter savedListFile = new FileWriter("savedtasklist.txt")){
            PrintWriter printWriter = new PrintWriter(savedListFile);
            for(int i = 0; mainList.getTaskItemList().size() > i; i++){
                printWriter.println(i + ")" + "  "+ "[" + mainList.getTaskItemList().get(i).getDueDateYear() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateMonth() + "-"
                        + mainList.getTaskItemList().get(i).getDueDateDay() + "] "
                        + mainList.getTaskItemList().get(i).getTitle() + ": "
                        + mainList.getTaskItemList().get(i).getDescription());
            }
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("File was not found");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

}
