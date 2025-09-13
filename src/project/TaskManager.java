package project;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();
    private int counter = 1;

    //добавить задачу
    public void addTask(String title) {
        Task task = new Task(counter++, title);
        tasks.add(task);
        System.out.println("Задача добавлена " + task);
    }

        //показать все задачи
        public void showTasks(){
            if(tasks.isEmpty()) {
                System.out.println("Список задач пуст ");
            } else {
                for (Task task : tasks){
                    System.out.println(task);
                }
            }
        }





}
