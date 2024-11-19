// File: OverrideDemo.java
package concepts;





// Another subclass overrides the sound method
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.speak();  // Outputs: Dog barks

        Animal myCat = new Cat();
        myCat.speak();  // Outputs: Cat meows
    }
}
