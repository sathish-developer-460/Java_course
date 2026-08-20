/*
# Interface in Java 
# What is an Interface? 
An interface in Java is a blueprint of a class that defines a set of abstract methods (methods 
without a body) and constants (final variables). It specifies what a class must do but not 
how it does it. A class that implements an interface provides the concrete implementation for 
its methods. 
Key Features of Interfaces: 
1. Abstract Methods: By default, all methods in an interface are public and abstract 
(before Java 8). 
2. Default Methods: From Java 8, interfaces can have methods with a default 
implementation using the default keyword. 
3. Static Methods: From Java 8, interfaces can have static methods. 
4. Multiple Inheritance: A class can implement multiple interfaces. 
5. Constants: All variables in an interface are public, static, and final by default. 
*/

interface Vehicle {
    void vehicleStart(); // Abstract method

    // static method
    static void service() {
        System.out.println("Vehicle is being serviced.");
    }
}

interface Car {
    void carStart(); // Abstract method

    // Default method
    default void method2() {
        System.out.println("Default Implementation.");
    }

    // Static method
    static void method3() {
        System.out.println("Static method in interface.");
    }
}

class Medan implements Car, Vehicle {
    int speed = 120;

    // constructor function
    Medan(int speed) {
        this.speed = speed;
    }

    @Override
    public void vehicleStart() {
        System.out.println("Vehicle Started.");
    }

    @Override
    public void carStart() {
        System.out.println("Car Started.");
    }

    public void medanStart() {
        System.out.println("Speed of Medan is: " + speed + " km/hr.");
    }

}

class InterfaceExample {
    public static void main(String[] args) {
        // creating an object of Medan class
        Medan medan1 = new Medan(180);
        medan1.vehicleStart();
        medan1.carStart();
        medan1.medanStart();
        // InterfaceName.methodName()
        Vehicle.service();// static method — call via interface name
        // object.methodName();
        medan1.method2();// default method — call via object
        Car.method3(); // static method — call via interface name
    }
}

/*
 * Output:-
 * Vehicle Started.
 * Car Started.
 * Speed of Medan is: 180 km/hr.
 * Vehicle is being serviced.
 * Default Implementation.
 * Static method in interface.
 */