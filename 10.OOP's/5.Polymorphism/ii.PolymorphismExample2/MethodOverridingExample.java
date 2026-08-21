/*
2. Run-Time Polymorphism (Method Overriding) :-

Method Overriding occurs when a subclass provides a specific implementation of a method 
already defined in its parent class. 
 
Rules for Method Overriding: 
1. The method must have the same name and parameters as in the parent class. 
2. The method in the child class must have the same or more accessible modifier. 
3. The method in the child class cannot override a method declared final or static. 
*/

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    @Override
    void start() { // Overriding the parent method
        System.out.println("Car is starting.");
    }
}

class MethodOverridingExample {
    public static void main(String[] args) {
        // creating an Car class
        Car car1 = new Car();// Polymorphism: parent reference, child object
        car1.start(); // Calls the overriden method in the child class
    }
}

/*
 * Output:-
 * Car is starting.
 */