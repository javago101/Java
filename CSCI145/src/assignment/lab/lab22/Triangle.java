package assignment.lab.lab22;

public class Triangle implements Measurable {
    private double base;
    private double height;

    // Constructor to set the base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementing getArea to calculate the area of the triangle
    @Override
    public double getArea() {
        return 0.5 * base * height;  // Area of the triangle (0.5 * base * height)
    }

    // Implementing getType to return the type of the shape
    @Override
    public String getType() {
        return "Triangle";
    }
}

