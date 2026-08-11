/*
The super keyword is used to: 
1. Access parent class methods or fields. 
2. Call the parent class constructor.

*/

class Vehicle {
    int speed = 120;

    // method to start the vehicle
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    int speed = 180;

    // method to display speed of car and vehicle
    void displaySpeed() {
        System.out.println("Speed of car is: " + speed);
        System.out.println("Speed of vehicle is: " + super.speed); // Accessing the parent field using super keyword
    }

    // method to start the car
    @Override
    void start() {
        super.start();// calling the parent class method using super keyword
        System.out.println("Car started");
    }
}

class SuperKeywordExample {
    public static void main(String[] args) {
        // creating an object of Car class
        Car car1 = new Car();
        car1.displaySpeed(); // calling the method to display speed of car and vehicle
        car1.start();// calling the method to start the car and vehicle
    }
}
/*
 * output:
 * 
 * Speed of car is: 180
 * Speed of vehicle is: 120
 * Vehicle started
 * Car started
 */