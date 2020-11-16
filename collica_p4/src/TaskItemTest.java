import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskItemTest {

    @Test
    public void creatingTaskItemFailsWithInvalidDueDate(){

    }

    @Test
    public void creatingTaskItemFailsWithInvalidTitle(){

    }

    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){
        TaskItem newTask = new TaskItem("Test", "Test", 2021, 12, 25, false);

        int expectedDueDateYear = 2021;

        assertEquals(newTask.getDueDateYear(), expectedDueDateYear);
    }

    @Test
    public void creatingTaskItemSucceedsWithValidTitle(){
        TaskItem newTask = new TaskItem("Test", "Test", 2021, 12, 25, false);

        String expectedTitle = "Test";

        assertEquals(newTask.getTitle(), expectedTitle);
    }

    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate(){

    }

    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){
        TaskItem newTask = new TaskItem("Test", "Test", 2021, 12, 25, false);

        int expectedDueDateYear = 2020;

        newTask.setDueDateYear(expectedDueDateYear);

        assertEquals(newTask.getDueDateYear(), expectedDueDateYear);
    }

    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle(){

    }

    @Test
    public void settingTaskItemTitleSucceedsWithValidTitle(){
        TaskItem newTask = new TaskItem("Test", "Test", 2021, 12, 25, false);

        String expectedTitle = "This is a test";

        newTask.setTitle(expectedTitle);

        assertEquals(newTask.getTitle(), expectedTitle);
    }
}
