package lecture.interfaceIntro;

// File: GroceryItem.java
public class GroceryItem implements RetailItem {
    private String name;
    private double price;
    private String description;
    private String expirationDate;

    // Constructor to initialize the fields
    public GroceryItem(String name, double price, String description, String expirationDate) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.expirationDate = expirationDate;
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

    // Additional method specific to GroceryItem
    public String getExpirationDate() {
        return expirationDate;
    }
}

