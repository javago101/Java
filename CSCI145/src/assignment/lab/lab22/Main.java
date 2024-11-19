package assignment.lab.lab22;

public class Main {

    // Method that takes a Measurable object and prints its type and area
    public static void printShapeInfo(Measurable shape) {
        System.out.println("Shape type: " + shape.getType());
        System.out.printf("Area: %.2f%n", shape.getArea());
    }

    public static void main(String[] args) {
        // Create instances of Circle, Triangle, and Square
        Circle circle = new Circle(5.0);  // Radius 5
        Triangle triangle = new Triangle(6.0, 4.0);  // Base 6, Height 4
        Square square = new Square(3.0);  // Side 3

        // Call the printShapeInfo method for each shape
        printShapeInfo(circle);
        printShapeInfo(triangle);
        printShapeInfo(square);
    }
}

