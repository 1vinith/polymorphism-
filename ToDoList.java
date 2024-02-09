package todolist.com;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the To-Do List App!");

        while (running) {
            System.out.println("\n1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    if (todoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("Tasks in the to-do list:");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting the To-Do List App. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        scanner.close();
    }
}
