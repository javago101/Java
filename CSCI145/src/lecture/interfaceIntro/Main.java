package lecture.interfaceIntro;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Create instances of RetailItem (ClothingItem, ElectronicsItem, GroceryItem)
        RetailItem shirt = new ClothingItem("T-Shirt", 19.99, "A comfortable cotton t-shirt", "L");
        RetailItem phone = new ElectronicsItem("Smartphone", 699.99, "A high-end smartphone with a 6.5 inch display", "BrandX");
        RetailItem apple = new GroceryItem("Apple", 0.99, "A fresh red apple", "2024-12-31");

        // Polymorphism: Using RetailItem reference to call the methods
        System.out.println(shirt.getName() + " - " + shirt.getPrice() + " - " + shirt.getDescription());
        System.out.println("Size: " + ((ClothingItem) shirt).getSize());  // Access specific method

        System.out.println(phone.getName() + " - " + phone.getPrice() + " - " + phone.getDescription());
        System.out.println("Brand: " + ((ElectronicsItem) phone).getBrand());  // Access specific method

        System.out.println(apple.getName() + " - " + apple.getPrice() + " - " + apple.getDescription());
        System.out.println("Expiration Date: " + ((GroceryItem) apple).getExpirationDate());  // Access specific method
    }
}

