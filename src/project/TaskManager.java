package project;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();
    private int counter = 1;

    //добавить задачу1
    public void addTask(String title) {
        Task task = new Task(counter++, title);
        tasks.add(task);
        System.out.println("Задача добавлена " + task);
    }

        //показать все задачи2
        public void showTasks(){
            if(tasks.isEmpty()) {
                System.out.println("Список задач пуст ");
            } else {
                for (Task task : tasks){
                    System.out.println(task);
                }
            }
        }

        // отметить задачу выполненой 3
    public void markAsDone(int id){
        for(Task task : tasks){
            if(task.getId() == id){
                task.markAsDone();
                System.out.println("Задача " +id + "отмечена выполненой");
                return;
            }
        }
        System.out.println("Задача с id " +id + "не найдена");
    }

    //удалить задачу4
    public void removeTask(int id){
        tasks.removeIf(task -> task.getId() == id);
        System.out.println("Если задача с id " + id + "сущестовала - она удалена ");
    }

}
