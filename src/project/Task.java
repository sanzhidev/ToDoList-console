package project;

public class Task {
    private int id;
    private String title;
    private boolean isDone;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return isDone;
    }

    public  Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isDone = false;
    }


    public void markAsDone() {
        this.isDone = true;
    }


    @Override
    public String toString() {
        return id + ". " + title + " (выполнена: " + isDone + ")";
    }
}

