public class TaskItem {
    private String title;
    private String description;
    private int dueDateYear;
    private int dueDateMonth;
    private int dueDateDay;
    private boolean complete;


    public TaskItem(String title, String description, int dueDateYear, int dueDateMonth, int dueDateDay, boolean complete){
        this.title = title;
        this.description = description;
        this.dueDateYear = dueDateYear;
        this.dueDateMonth = dueDateMonth;
        this.dueDateDay = dueDateDay;
        this.complete = complete;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }

    public String getDueDate(){
        return this.dueDate;
    }

    public boolean getComplete(){
        return this.complete;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    public void setDueDate(String newDueDate){
        this.dueDate = newDueDate;
    }

    public void setComplete(boolean complete){
        this.complete = complete;
    }
}
