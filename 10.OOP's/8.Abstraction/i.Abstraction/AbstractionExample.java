/*
# What is Abstraction? 

Abstraction is the process of hiding the implementation details of a system and exposing 
only the essential features. It allows a user to interact with an object without knowing how it 
works internally. 
Key Features of Abstraction:-

1. Focus on Essentials: Only the necessary details are exposed to the user. 
2. Hides Complexity: The implementation is hidden, and only the interface is visible. 
3. Implemented Using: 
    o Abstract Classes: Classes with at least one abstract method. 
    o Interfaces: Fully abstract blueprints for classes.
*/
abstract class Vehicle {
    String brandName; // Single Variable

    // Abstract Method
    abstract void start(); // No Body

    // Concrete method
    void displayBrand() {
        // body
        System.out.println("BrandName: " + brandName);
    }

}

class Car extends Vehicle {
    // Constructor Function
    Car(String brand) {
        this.brandName = brand;
    }

    @Override
    void start() {
        System.out.println(brandName + " is starting.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // create an object of Car class
        Car car1 = new Car("Honda"); // Abstraction: using abstract class
        car1.displayBrand();// concrete method
        car1.start();// Abstract method implementation
    }
}

/*
 * Output:-
 * BrandName: Honda
 * Honda is starting.
 */