/*
 * # What is a Class?
 * A class is a blueprint or template that defines the structure and behavior
 * (data and methods)
 * of objects. It is like a recipe that describes how to create objects of a
 * particular type.
 * Key Points about Classes:
 * 1. A class defines:
 * o Attributes (variables) that represent the data.
 * o Methods (functions) that represent behavior.
 * 2. Classes do not occupy memory until objects are created from them.
 * 
 * Here:
 * • Car is the class.
 * • brand and speed are attributes.
 * • accelerate() is a method that defines behavior.
 */

class Car {
    String brand = "Audi"; // attribute1
    int speed = 120; // attribute2

    // method
    void accelerate() {
        System.out.println(brand + " is accelerating at " + speed + " km/h. ");
        // Toyota is accelerating at 160 km/h.
    }
}

class ClassExample {
    public static void main(String[] args) {
        // creating a new object
        Car car1 = new Car();
        car1.brand = "Toyota"; // Setting attributes
        car1.speed = 160;
        car1.accelerate(); // Calling method
        // System.out.println(car1.brand + " is accelerating at " + car1.speed + " km/h.
        // ");
        // Toyota is accelerating at 160 km/h.
    }
}