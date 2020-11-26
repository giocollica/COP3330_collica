/*
    Giovanni Collica
    Programming Assignment 5
    COP 3330

    This java class contains the constructor
    and necessary methods for TaskItem
 */

//TaskItem class
public class TaskItem {
    private String title;
    private String description;
    private int dueDateYear;
    private int dueDateMonth;
    private int dueDateDay;
    private boolean complete;

    //constructor
    public TaskItem(String title, String description, int dueDateYear, int dueDateMonth, int dueDateDay, boolean complete) {
        this.title = title;
        this.description = description;
        this.dueDateYear = dueDateYear;
        this.dueDateMonth = dueDateMonth;
        this.dueDateDay = dueDateDay;
        this.complete = complete;
    }

    //method to get the title
    public String getTitle() {
        return this.title;
    }

    //method to get the description
    public String getDescription() {
        return this.description;
    }

    //method to get the due date year
    public int getDueDateYear() {
        return this.dueDateYear;
    }

    //method to get the due date month
    public int getDueDateMonth() {
        return this.dueDateMonth;
    }

    //method to get the due date day
    public int getDueDateDay() {
        return this.dueDateDay;
    }

    //method to get if the task is complete or not
    //based on boolean true or false
    public boolean getComplete() {
        return this.complete;
    }

    //method to set the title
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    //method to set the description
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    //method to set the due date year
    public void setDueDateYear(int newDueDateYear) {
        this.dueDateYear = newDueDateYear;
    }

    //method to set the due date month
    public void setDueDateMonth(int newDueDateMonth) {
        this.dueDateMonth = newDueDateMonth;
    }

    //method to set the due date day
    public void setDueDateDay(int newDueDateDay) {
        this.dueDateDay = newDueDateDay;
    }

    //method to set if the task is complete or not
    //based on boolean true or false
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
