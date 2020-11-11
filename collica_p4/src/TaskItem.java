public class TaskItem {
    private String title;
    private String description;
    private String dueDate;


    public TaskItem(String title, String description, String dueDate){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
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
    
    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    public void setDueDate(String newDueDate){
        this.dueDate = newDueDate;
    }
}
