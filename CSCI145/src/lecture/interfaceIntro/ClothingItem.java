package lecture.interfaceIntro;

// File: ClothingItem.java
public class ClothingItem implements RetailItem {
    private String name;
    private double price;
    private String description;
    private String size;

    // Constructor to initialize the fields
    public ClothingItem(String name, double price, String description, String size) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.size = size;
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

    // Additional method specific to ClothingItem
    public String getSize() {
        return size;
    }
}

