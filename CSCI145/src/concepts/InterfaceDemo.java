// File: InterfaceDemo.java
package concepts;

// Interface definition
interface Vehicle {
    void start();
    void stop();
}

// Class that implements the Vehicle interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}

// Class that implements the Vehicle interface
class Bicycle implements Vehicle {
    public void start() {
        System.out.println("Bicycle is starting");
    }

    public void stop() {
        System.out.println("Bicycle is stopping");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        vehicle1.start();  // Outputs: Car is starting
        vehicle1.stop();   // Outputs: Car is stopping

        Vehicle vehicle2 = new Bicycle();
        vehicle2.start();  // Outputs: Bicycle is starting
        vehicle2.stop();   // Outputs: Bicycle is stopping
    }
}
