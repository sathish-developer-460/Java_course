/*
Multilevel Inheritance (Level by level):-  ex:- Grand Father->Father->Son

A child class inherits from a parent class, and that parent class itself inherits from another class. 
Example: Sedan inherits from Car, which inherits from Vehicle. 
*/

class Vehicle {
    // method
    void start() {
        System.out.println("Vehicle is started"); // 1st Layer
    }
}

// Child of Vehicle parent1 class
class Car extends Vehicle {
    // method
    void fuel() {
        System.out.println("Car is being refueled.");// 2nd Layer
    }
}

// Child of Car parent2 class
class Sedan extends Car {
    int speed = 180;

    // method
    void luxuryFeatures() {
        System.out.println("Sedan has luxury features."); // 3rd Layer
    }

    // method
    void displaySpeed() {
        System.out.println("Sedan speed is: " + speed + " km/h");
    }
}

// Driver class
public class CarExample {
    // Main Function
    public static void main(String[] args) {
        // creating an object of Sedan class and accessing methods from both parents
        Sedan sedan1 = new Sedan();
        sedan1.start(); // From vehicle class
        sedan1.fuel(); // From Car class
        sedan1.luxuryFeatures(); // From Sedan class
        sedan1.displaySpeed(); // From Sedan class

    }
}

/*
 * Output:
 * Vehicle is started
 * Car is being refueled.
 * Sedan has luxury features.
 * Sedan speed is: 180 km/h
 */