// File: PolymorphismDemo.java
package concepts;

// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Child class 2
class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Polymorphism
        shape.draw();  // Outputs: Drawing a circle

        shape = new Square(); // Polymorphism
        shape.draw();  // Outputs: Drawing a square
    }
}
