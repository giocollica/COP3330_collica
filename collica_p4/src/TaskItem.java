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

    public int getDueDateYear(){
        return this.dueDateYear;
    }

    public int getDueDateMonth(){
        return this.dueDateMonth;
    }

    public int getDueDateDay(){
        return this.dueDateDay;
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

    public void setDueDateYear(int newDueDateYear){
        this.dueDateYear = newDueDateYear;
    }

    public void setDueDateMonth(int newDueDateMonth){
        this.dueDateMonth = newDueDateMonth;
    }

    public void setDueDateDay(int newDueDateDay){
        this.dueDateDay = newDueDateDay;
    }

    public void setComplete(boolean complete){
        this.complete = complete;
    }
}
