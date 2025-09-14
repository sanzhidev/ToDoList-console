package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n--- ToDo List ---");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать все задачи");
            System.out.println("3. Отметить задачу выполненной");
            System.out.println("4. Удалить задачу");
            System.out.println("0. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();


            switch(choice){
                case 1 -> {
                    System.out.println("Введите название задачи: ");
                    String title = scanner.next();
                    manager.addTask(title);
                }
                case 2 -> manager.showTasks();
                case 3 -> {
                    System.out.println("Введите id задачи");
                    int doneId = scanner.nextInt();
                    manager.markAsDone(doneId);
                    break;

                }

                case 4 -> {
                    System.out.println("Ведите id задачи ");
                    int id = scanner.nextInt();
                    manager.removeTask(id);
                }

                default -> {
                    System.out.println("Неверный ввод, попробуйте снова");
                }
            }
            }
    }
}
