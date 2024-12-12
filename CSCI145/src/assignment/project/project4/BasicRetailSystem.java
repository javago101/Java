package assignment.project.project4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Basic Person class
class Person implements Comparable<Person> {
    private final String name;
    private final String phone;
    private final String email;

    // Constructor
    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Basic getters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // Compare persons by name
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

// Basic Employee class
class Employee extends Person {
    private final int id;
    private final double payRate;
    private double hours;

    public Employee(String name, String phone, String email, int id, double payRate) throws Exception {
        super(name, phone, email);
        if (id < 0 || id > 999) {
            throw new Exception("ID must be between 0 and 999");
        }
        this.id = id;
        this.payRate = payRate;
        this.hours = 0;
    }

    public void addHours(double hours) {
        this.hours += hours;
    }

    public double calculatePay() {
        double pay = hours * payRate;
        hours = 0;  // Reset hours
        return pay;
    }

    public String toString() {
        return super.toString() + ", ID: " + id + ", Pay Rate: $" + payRate + ", Hours: " + hours;
    }
}

// Basic Customer class
class Customer extends Person {
    protected ArrayList<Double> purchases;
    protected double totalSpent;

    public Customer(String name, String phone, String email) {
        super(name, phone, email);
        purchases = new ArrayList<>();
        totalSpent = 0;
    }

    public void makePurchase(double amount) {
        purchases.add(amount);
        totalSpent += amount;
    }

    public String toString() {
        return super.toString() + ", Total Spent: $" + totalSpent;
    }
}

// Basic PreferredCustomer class
class PreferredCustomer extends Customer {
    public PreferredCustomer(String name, String phone, String email) {
        super(name, phone, email);
    }

    public void makePurchase(double amount) {
        // Simple discount system
        double discount = 0;
        if (totalSpent > 500) {
            discount = 0.05;  // 5% off
        }
        double finalAmount = amount * (1 - discount);
        super.makePurchase(finalAmount);
    }
}

// Main class
public class BasicRetailSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Employee");
            System.out.println("3. Record Purchase");
            System.out.println("4. Add Hours");
            System.out.println("5. Print All");
            System.out.println("6. Quit");
            System.out.println("Enter your choice here: ");

            int choice = input.nextInt();
            input.nextLine(); // Clear buffer

            if (choice == 1) {
                System.out.println("Enter name:");
                String name = input.nextLine();
                System.out.println("Enter phone:");
                String phone = input.nextLine();
                System.out.println("Enter email:");
                String email = input.nextLine();
                System.out.println("Preferred customer? (y/n):");
                String preferred = input.nextLine();

                Customer c;
                if (preferred.equals("y")) {
                    c = new PreferredCustomer(name, phone, email);
                } else {
                    c = new Customer(name, phone, email);
                }
                customers.add(c);
                Collections.sort(customers);
            } else if (choice == 2) {
                try {
                    System.out.println("Enter name:");
                    String name = input.nextLine();
                    System.out.println("Enter phone:");
                    String phone = input.nextLine();
                    System.out.println("Enter email:");
                    String email = input.nextLine();
                    System.out.println("Enter ID (0-999):");
                    int id = input.nextInt();
                    System.out.println("Enter pay rate:");
                    double pay = input.nextDouble();

                    Employee e = new Employee(name, phone, email, id, pay);
                    employees.add(e);
                    Collections.sort(employees);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice == 3) {
                System.out.println("Customer index:");
                int index = input.nextInt();
                System.out.println("Purchase amount:");
                double amount = input.nextDouble();
                if (index < customers.size()) {
                    customers.get(index).makePurchase(amount);
                }
            } else if (choice == 4) {
                System.out.println("Employee index:");
                int index = input.nextInt();
                System.out.println("Hours worked:");
                double hours = input.nextDouble();
                if (index < employees.size()) {
                    employees.get(index).addHours(hours);
                }
            } else if (choice == 5) {
                System.out.println("\nCustomers:");
                for (Customer c : customers) {
                    System.out.println(c);
                }
                System.out.println("\nEmployees:");
                for (Employee e : employees) {
                    System.out.println(e);
                }
            } else if (choice == 6) {
                break;
            }
        }
        input.close();
    }
}
