public class TaskItem {
    private String title;
    private String description;
    private String dueDate;
    private boolean complete;


    public TaskItem(String title, String description, String dueDate, boolean complete){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
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
