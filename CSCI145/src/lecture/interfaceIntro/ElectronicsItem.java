package lecture.interfaceIntro;

// File: ElectronicsItem.java
public class ElectronicsItem implements RetailItem {
    private String name;
    private double price;
    private String description;
    private String brand;

    // Constructor to initialize the fields
    public ElectronicsItem(String name, double price, String description, String brand) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.brand = brand;
    }

    // Implementing getName() method from RetailItem interface
    @Override
    public String getName() {
        return name;
    }

    // Implementing getPrice() method from RetailItem interface
    @Override
    public double getPrice() {
        return price;
    }

    // Implementing getDescription() method from RetailItem interface
    @Override
    public String getDescription() {
        return description;
    }

    // Additional method specific to ElectronicsItem
    public String getBrand() {
        return brand;
    }
}

