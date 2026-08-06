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

// //Example1:-

// class Car {
//     String brand; // attribute1
//     int speed = 120; // attribute2

//     // method
//     void accelerate() {
//         System.out.println(brand + " is accelerating at " + speed + " km/hr ");
//         // null is accelerating at 120 km/hr
//     }
// }

// class ClassExample {
//     public static void main(String[] args) {
//         // creating a new object
//         Car car1 = new Car(); // creating an object of the class Car
//         car1.accelerate(); // calling the method of the object
//         System.out.println(car1.brand + " is accelerating at " + car1.speed + " km/hr ");
//         // null is accelerating at 120 km/hr

//     }
// }

// //Example2:-
// class Car {
//     String brand; // attribute1
//     int speed = 120; // attribute2

//     // method
//     void accelerate() {
//         System.out.println(brand + " is accelerating at " + speed + " km/hr ");
//         // null is accelerating at 120 km/hr
//     }
// }

// class ClassExample {
//     public static void main(String[] args) {
//         // creating a new object
//         Car car1 = new Car(); // creating an object of the class Car
//         car1.accelerate(); // calling the method of the object
//         car1.brand = "Audi";
//         car1.speed = 180;
//         System.out.println(car1.brand + " is accelerating at " + car1.speed + " km/hr ");
//         // null is accelerating at 180 km/hr

//     }
// }

// Example3:-

// class Car {
// String brand = "Audi"; // attribute1
// int speed = 120; // attribute2

// // method
// void accelerate() {
// System.out.println(brand + " is accelerating at " + speed + " km/h. ");
// // Toyota is accelerating at 160 km/h.
// }
// }

// class ClassExample {
// public static void main(String[] args) {
// // creating a new object
// Car car1 = new Car();
// car1.brand = "Toyota"; // Setting attributes
// car1.speed = 160;
// car1.accelerate(); // Calling method
// // System.out.println(car1.brand + " is accelerating at " + car1.speed + "
// km/h.
// // ");
// // Toyota is accelerating at 160 km/h.
// }
// }

// Example4:-

class Car {
    String brand; // attribute1
    int speed = 120; // attribute2

    // methods
    // i. no-arg version — uses the object's own fields
    void accelerate() {
        System.out.println(brand + " is accelerating at " + speed + " km/hr ");
        // null is accelerating at 120 km/hr
    }

    // ii. two-arg version — uses whatever is passed in
    void accelerate(String brand, int speed) {
        System.out.println(brand + " is accelerating at " + speed + " km/hr ");
        // BMW is accelerating at 200 km/hr
    }
}

class ClassExample {
    public static void main(String[] args) {
        // creating a new object
        Car car1 = new Car(); // creating an object of the class Car
        car1.accelerate(); // calling the no-arg method
        // Output: null is accelerating at 120 km/hr

        car1.brand = "Audi";
        car1.speed = 180;
        System.out.println(car1.brand + " is accelerating at " + car1.speed + " km/hr ");
        // Output: Audi is accelerating at 180 km/hr

        car1.brand = "BMW";
        car1.speed = 200;
        car1.accelerate(car1.brand, car1.speed); // calling the two-arg method
        // Output: BMW is accelerating at 200 km/hr
    }
}
// output:
// null is accelerating at 120 km/hr
// Audi is accelerating at 180 km/hr
// BMW is accelerating at 200 km/hr