/*
What is an Object? 
An object is an instance of a class. It is a real-world entity created from a class and has: 
• State (data) represented by attributes. 
• Behavior (functionality) defined by methods. 
Key Points about Objects: 
1. Objects are created using the new keyword. 
2. Multiple objects can be created from the same class.
 */

//Example 1:-
// class Car {
//     String brand; // attribute1 or Instance variable
//     int speed = 100; // attribute2 or Instance variable

//     // method
//     void accelerate(String brand, int speed) {
//         System.out.println(brand + " is accelerating at " + speed + " km/h. ");
//         // BMW is accelerating at 180 km/h.
//     }
// }

// class ObjectExample {
//     public static void main(String[] args) {
//         // creating a new object
//         Car car1 = new Car();
//         car1.brand = "Toyota"; // Setting attributes
//         car1.speed = 160;
//         car1.accelerate("BMW", 180); // Calling method
//         System.out.println(car1.brand + " is accelerating at " + car1.speed + " km/h. ");
//         // Toyota is accelerating at 160 km/h.
//     }
// }

//Example 2:-
class Car {
    String brand;
    int speed = 120;

    void accelerate() {
        System.out.println(brand + " is accelerate at " + speed + " kmph. ");
        // null is accelerate at 120 kmph.
    }

    void accelerate(String brand, int speed) {
        System.out.println(brand + " is accelerate at " + speed + " kmph. ");
        // BMW is accelerate at 200 kmph.
    }
}

class ObjectExample {
    public static void main(String[] args) {
        // create a new Object
        Car car1 = new Car();
        car1.accelerate();
        car1.brand = "Audi";
        car1.speed = 180;
        System.out.println(car1.brand + " is accelerate at " + car1.speed + " kmph. ");
        // Audi is accelerate at 180 kmph.
        car1.accelerate("BMW", 200);
        // // or
        // car1.brand = "BMW";
        // car1.speed = 200;
        // car1.accelerate(car1.brand, car1.speed);
    }
}
// output:-
// null is accelerate at 120 kmph.
// Audi is accelerate at 180 kmph.
// BMW is accelerate at 200 kmph.