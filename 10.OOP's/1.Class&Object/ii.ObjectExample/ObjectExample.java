/*
What is an Object? 
An object is an instance of a class. It is a real-world entity created from a class and has: 
• State (data) represented by attributes. 
• Behavior (functionality) defined by methods. 
Key Points about Objects: 
1. Objects are created using the new keyword. 
2. Multiple objects can be created from the same class.
 */

class Car {
    String brand; // attribute1
    int speed = 100; // attribute2

    // method
    void accelerate(String brand, int speed) {
        System.out.println(brand + " is accelerating at " + speed + " km/h. ");
        // BMW is accelerating at 180 km/h.
    }
}

class ObjectExample {
    public static void main(String[] args) {
        // creating a new object
        Car car1 = new Car();
        car1.brand = "Toyota"; // Setting attributes
        car1.speed = 160;
        car1.accelerate("BMW", 180); // Calling method
        System.out.println(car1.brand + " is accelerating at " + car1.speed + " km/h. ");
        // Toyota is accelerating at 160 km/h.
    }
}