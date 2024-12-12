package assignment.finalLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


    class Task implements Comparable<Task> {
        private final int priority;
        private final String description;
        private final int hours;

        public Task(int priority, String description, int hours) throws IllegalArgumentException {
            if (priority < 1 || priority > 5) {
                throw new IllegalArgumentException("Priority must be between 1 and 5");
            }
            this.priority = priority;
            this.description = description;
            this.hours = hours;
        }

        public int getPriority() {
            return priority;
        }

        public int getHours() {
            return hours;
        }

        public boolean isSpecialTask() {
            return priority == 1;
        }

        @Override
        public int compareTo(Task other) {
            return Integer.compare(this.priority, other.priority);
        }

        @Override
        public String toString() {
            return "Task{priority=" + priority + ", description='" + description + "', hours=" + hours + "}";
        }
    }

    class Worker {
        protected String name;
        protected int hoursWorked;
        protected ArrayList<Task> tasks;

        public Worker(String name) {
            this.name = name;
            this.hoursWorked = 0;
            this.tasks = new ArrayList<>();
        }

        public void addTask(Task task) throws IllegalArgumentException {
            if (task.isSpecialTask()) {
                throw new IllegalArgumentException("Regular workers cannot be assigned special tasks");
            }
            tasks.add(task);
            Collections.sort(tasks);
        }

        public void completeNextTask() {
            if (!tasks.isEmpty()) {
                Task task = tasks.remove(0);
                hoursWorked += task.getHours();
            }
        }

        public double calculatePay() {
            return hoursWorked * 40;
        }

        @Override
        public String toString() {
            return "Worker{name='" + name + "', hoursWorked=" + hoursWorked + ", tasks=" + tasks + "}";
        }
    }

    class SkilledWorker extends Worker {
        private int specialTasksCompleted;

        public SkilledWorker(String name) {
            super(name);
            this.specialTasksCompleted = 0;
        }

        @Override
        public void addTask(Task task) {
            tasks.add(task);
            Collections.sort(tasks);
        }

        @Override
        public void completeNextTask() {
            if (!tasks.isEmpty()) {
                Task task = tasks.remove(0);
                hoursWorked += task.getHours();
                if (task.isSpecialTask()) {
                    specialTasksCompleted++;
                }
            }
        }

        @Override
        public double calculatePay() {
            return super.calculatePay() + (specialTasksCompleted * 100);
        }

        @Override
        public String toString() {
            return "SkilledWorker{name='" + name + "', hoursWorked=" + hoursWorked +
                    ", specialTasksCompleted=" + specialTasksCompleted + ", tasks=" + tasks + "}";
        }
    }

    public class TaskManager {
        private static final ArrayList<Worker> workers = new ArrayList<>();
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.println("\n1. Add Worker");
                System.out.println("2. Assign Task");
                System.out.println("3. Complete Next Tasks");
                System.out.println("4. Calculate Pay");
                System.out.println("5. Display Workers");
                System.out.println("6. Quit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        addWorker();
                        break;
                    case 2:
                        assignTask();
                        break;
                    case 3:
                        completeNextTasks();
                        break;
                    case 4:
                        calculatePay();
                        break;
                    case 5:
                        displayWorkers();
                        break;
                    case 6:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        private static void addWorker() {
            System.out.print("Enter worker name: ");
            String name = scanner.nextLine();
            System.out.print("Is this a skilled worker? (y/n): ");
            String skilled = scanner.nextLine();

            Worker worker = skilled.equalsIgnoreCase("y") ? new SkilledWorker(name) : new Worker(name);
            workers.add(worker);
            System.out.println("Worker added successfully.");
        }

        private static void assignTask() {
            if (workers.isEmpty()) {
                System.out.println("No workers available. Please add a worker first.");
                return;
            }

            System.out.print("Enter task priority (1-5): ");
            int priority = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter task description: ");
            String description = scanner.nextLine();
            System.out.print("Enter task hours: ");
            int hours = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            Task task;
            try {
                task = new Task(priority, description, hours);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }

            System.out.println("Available workers:");
            for (int i = 0; i < workers.size(); i++) {
                System.out.println(i + ": " + workers.get(i).name);
            }
            System.out.print("Choose a worker (enter number): ");
            int workerIndex = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            try {
                workers.get(workerIndex).addTask(task);
                System.out.println("Task assigned successfully.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        private static void completeNextTasks() {
            for (Worker worker : workers) {
                worker.completeNextTask();
            }
            System.out.println("All workers have completed their next task (if they had one).");
        }

        private static void calculatePay() {
            System.out.println("Pay owed to workers:");
            for (Worker worker : workers) {
                System.out.printf("%s: $%.2f%n", worker.name, worker.calculatePay());
            }
        }

        private static void displayWorkers() {
            for (Worker worker : workers) {
                System.out.println(worker);
            }
        }
    }
