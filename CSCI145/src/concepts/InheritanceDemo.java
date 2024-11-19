// File: InheritanceDemo.java
package concepts;

// Parent class
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

// Child class that inherits from Animal
class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();  // Outputs: Animal speaks

        Dog dog = new Dog();
        dog.speak();  // Outputs: Dog barks
    }
}
