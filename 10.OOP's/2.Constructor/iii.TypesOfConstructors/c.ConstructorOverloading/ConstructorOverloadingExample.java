/*
Constructor Overloading:-

We can define multiple constructors in the same class, each with a different set of parameters. 
This is called constructor overloading.
*/

class Car {
    String brand; // attribute1 or Instance variable
    int speed; // attribute2 or Instance variable

    // creating an overloaded constructor function (Default Constructor)
    Car() {
        this.brand = "audi";
        this.speed = 120;
    }

    // creating an overloaded constructor function (Parameterized Constructor)
    Car(String brandName, int speed) {
        this.brand = brandName;
        this.speed = speed;
    }

    // aclling the method to display the values of the attributes
    void display() {
        System.out.println("Brand: " + brand + " Speed: " + speed + " km/h ");
        // Brand: audi Speed: 120 km/h
        // Brand: BMW Speed: 150 km/h
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        // creating an object of the car class without passing any arguments
        Car car1 = new Car();// Calls default Constructor
        // creating an object of the car class by passing two arguments
        Car car2 = new Car("BMW", 150); // Calls Parameterized Constructor
        car1.display(); // Default constructor is called
        car2.display(); // Parameterized constructor is called
    }
}

/*
 * Ourtput:-
 * 
 * Brand: audi Speed: 120 km/h
 * Brand: BMW Speed: 150 km/h
 */