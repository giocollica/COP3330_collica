import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TaskListTest {
    @Test
    public void addingTaskItemsIncreasesSize(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        int size = 0;

        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        assertEquals(newTaskList.getTaskItemList().size(), size + 2);
    }

    @Test
    public void completingTaskItemChangesStatus(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);

        newTaskList.markCompletedHardCode(0);

        assertEquals(newTaskList.getTaskItemList().get(0).getComplete(), true);
    }

    @Test
    public void completingTaskItemFailsWithInvalidIndex(){

    }

    @Test
    public void editingTaskItemChangesValues(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        String newTitle = "This is not a test";

        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);

        newTaskList.getTaskItemList().get(0).setTitle("This is not a test");

        assertEquals(newTaskList.getTaskItemList().get(0).getTitle(), newTitle);
    }

    @Test
    public void editingTaskItemDescriptionChangesValue(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        String newDescription = "This is not a test";

        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);

        newTaskList.getTaskItemList().get(0).setDescription("This is not a test");

        assertEquals(newTaskList.getTaskItemList().get(0).getDescription(), newDescription);
    }

    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex(){

    }

    @Test
    public void editingTaskItemDueDateChangesValue(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        int newDueDateYear = 2021;

        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);

        newTaskList.getTaskItemList().get(0).setDueDateYear(2021);

        assertEquals(newTaskList.getTaskItemList().get(0).getDueDateYear(), newDueDateYear);
    }

    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex(){

    }

    @Test
    public void editingTaskItemTitleChangesValue(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        String newTitle = "This is a test";

        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);

        newTaskList.getTaskItemList().get(0).setTitle("This is a test");

        assertEquals(newTaskList.getTaskItemList().get(0).getTitle(), newTitle);
    }

    @Test
    public void editingTaskItemTitleFailsWithInvalidIndex(){

    }

    @Test
    public void gettingTaskItemDescriptionFailsWithInvalidIndex(){

    }

    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        String expectedDescription = "Test";

        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);

        assertEquals(newTaskList.getTaskItemList().get(0).getDescription(), expectedDescription);
    }

    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){

    }

    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        int expectedDueDateYear = 2020;

        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);

        assertEquals(newTaskList.getTaskItemList().get(0).getDueDateYear(), expectedDueDateYear);
    }

    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){

    }

    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        String expectedTitle = "Test";

        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);
        newTaskList.addItemHardCode("Test", "Test", 2020, 12, 25);

        assertEquals(newTaskList.getTaskItemList().get(0).getTitle(), expectedTitle);
    }

    @Test
    public void newTaskListIsEmpty(){
        ArrayList<TaskItem> taskItemList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskItemList);

        assertEquals(newTaskList.getTaskItemList().size(), 0);
    }

    @Test
    public void removingTaskItemsDecreasesSize(){

    }

    @Test
    public void removingTaskItemsFailsWithInvalidIndex(){

    }

    @Test
    public void savedTaskListCanBeLoaded(){

    }

    @Test
    public void uncompletingTaskItemChangesStatus(){

    }

    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex(){

    }

}
