package assignment.lab.lab22;

public class Square implements Measurable {
    private double side;

    // Constructor to set the side length
    public Square(double side) {
        this.side = side;
    }

    // Implementing getArea to calculate the area of the square
    @Override
    public double getArea() {
        return side * side;  // Area of the square (side²)
    }

    // Implementing getType to return the type of the shape
    @Override
    public String getType() {
        return "Square";
    }
}

