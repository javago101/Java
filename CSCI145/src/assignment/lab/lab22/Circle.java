package assignment.lab.lab22;

public class Circle implements Measurable {
    private double radius;

    // Constructor to set the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing getArea to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;  // Area of the circle (πr²)
    }

    // Implementing getType to return the type of the shape
    @Override
    public String getType() {
        return "Circle";
    }
}

