/*
    Giovanni Collica
    Programming Assignment 5
    COP 3330

    This java class contains all the
    tests provided by the assignment
    to ensure that the code is working.
 */

//necessary imports

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

//TaskItemTest class
//contains all necessary tests for TaskItem
public class TaskItemTest {

    @Test
    public void creatingTaskItemFailsWithInvalidDueDate() {

    }

    @Test
    public void creatingTaskItemFailsWithInvalidTitle() {

    }

    @Test
    public void creatingTaskItemSucceedsWithValidDueDate() {
        TaskItem newTask = new TaskItem("Test", "Test", 2021, 12, 25, false);

        int expectedDueDateYear = 2021;

        assertEquals(newTask.getDueDateYear(), expectedDueDateYear);
    }

    @Test
    public void creatingTaskItemSucceedsWithValidTitle() {
        TaskItem newTask = new TaskItem("Test", "Test", 2021, 12, 25, false);

        String expectedTitle = "Test";

        assertEquals(newTask.getTitle(), expectedTitle);
    }

    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate() {

    }

    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate() {
        TaskItem newTask = new TaskItem("Test", "Test", 2021, 12, 25, false);

        int expectedDueDateYear = 2020;

        newTask.setDueDateYear(expectedDueDateYear);

        assertEquals(newTask.getDueDateYear(), expectedDueDateYear);
    }

    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle() {

    }

    @Test
    public void settingTaskItemTitleSucceedsWithValidTitle() {
        TaskItem newTask = new TaskItem("Test", "Test", 2021, 12, 25, false);

        String expectedTitle = "This is a test";

        newTask.setTitle(expectedTitle);

        assertEquals(newTask.getTitle(), expectedTitle);
    }
}
