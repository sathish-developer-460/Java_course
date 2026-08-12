/*
 * Hierarchical Inheritance:
 * Multiple child classes inherit from a single parent class(Base class).
 * Example: Car and Bike inherit from Vehicle.
 */

class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

// Car is the child of the Vehicle Parent class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Bike is the child of the Vehicle Parent class
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        /*
         * creating an object of Car class and accessing the Methods of Vehicle Parent
         * class
         */
        Car car1 = new Car();
        car1.drive();// calling the method
        car1.start();// calling the parent class method
        /*
         * creating an object of Bike Class and accessing the Methods of Vehicle parent
         * class
         */
        Bike bike1 = new Bike();
        bike1.ride(); // calling the child method
        bike1.start(); // calling the parent class method
    }
}
/*
 * Output:
 * Car is driving.
 * Vehicle started.
 * Bike is riding.
 * Vehicle started.
 */