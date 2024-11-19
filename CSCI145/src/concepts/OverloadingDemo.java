// File: OverloadingDemo.java
package concepts;

class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: " + calc.add(10, 20));  // Outputs: 30
        System.out.println("Addition of 3 integers: " + calc.add(10, 20, 30));  // Outputs: 60
        System.out.println("Addition of 2 doubles: " + calc.add(10.5, 20.3));  // Outputs: 30.8
    }
}
