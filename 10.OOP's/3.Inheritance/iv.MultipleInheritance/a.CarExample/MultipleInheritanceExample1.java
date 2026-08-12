/*
Multiple Inheritance (via Interfaces in Java): 
A class inherits from multiple interfaces. 
Example: FlyingCar implements Vehicle and FlyingObject. 
*/
//interface1
interface Vehicle {
    // method
    void start();
}

// interface2
interface FlyingObject {
    // method
    void fly();
}

// Class implementing both interfaces
class FlyingCar implements Vehicle, FlyingObject {
    @Override
    public void start() {
        System.out.println("FlyingCar is Started.");
    }

    @Override
    public void fly() {
        System.out.println("FlyingCar is flying.");
    }
}

class MultipleInheritanceExample1 {
    public static void main(String[] args) {
        /*
         * creating an object of FlyingCar child class and accessing the methods of bot
         * parents FlyingObject and Vehicle classes
         */
        FlyingCar myFlyingCar = new FlyingCar();
        myFlyingCar.start(); // From Vehicle interface
        myFlyingCar.fly(); // From FlyingObject interface

    }
}

/*
 * Output:
 * FlyingCar is Started.
 * FlyingCar is flying.
 */