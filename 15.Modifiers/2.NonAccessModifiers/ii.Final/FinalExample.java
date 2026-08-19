/*
 * 2. Final Modifier
 * The final modifier is used to restrict modification. It can be applied to
 * variables, methods,
 * and classes.
 * 
 * Features of final:
 * 1. Final Variables: Values cannot be changed after initialization.
 * 2. Final Methods: Cannot be overridden in subclasses.
 * 3. Final Classes: Cannot be extended.
 * 
 * Final Variables:
 * • Must be initialized either at declaration or in the constructor.
 * • Acts as a constant.
 * 
 * Final Methods:
 * • Prevents method overriding in subclasses.
 * 
 * Final Classes:
 * • Prevents inheritance.
 */



/*Example1:-
 * Final Variables:
 * • Must be initialized either at declaration or in the constructor.
 * • Acts as a constant.
  */
class Vehicle {
    final int speed = 200;

    // method
    final void displaySpeed() {
        System.out.println("Speed: " + speed);
    }
}

class FinalExample {
    public static void main(String[] args) {
        // creating an Object of Vehicle class
        Vehicle vehicle1 = new Vehicle();
        // vehicle1.speed= 205; //Error: Cannot assign value to final variable
        vehicle1.displaySpeed();
    }
}

/* Example2:- 
 * Final Methods:
 * • Prevents method overriding in subclasses.
*/

class Vehicle {
    final int speed = 200;

    // method
    final void fuel() {
        System.out.println("Vehicle is being refueled.");
    }
}
class Car extends Vehicle{
    //method
    void fuel(){
        //Error: Cannot override final method
        System.out.println("Vehicle is being refueled.");
    }

}
class FinalExample {
    public static void main(String[] args) {
        // creating an Object of Vehicle class
        Vehicle vehicle1 = new Vehicle();
        Car car1= new Car();
        car1.fuel();
    }
}

/*
Output:-
Error: Cannot override final method
*/

/* Example 3 :- 
 * Final Classes:
 * • Prevents inheritance.
*/

final class Vehicle {
    final int speed = 200;

    // method
    final void fuel() {
        System.out.println("Vehicle is being refueled.");
    }
}
class Car extends Vehicle{
//Error: Cannot inherit from final class
}
class FinalExample {
    public static void main(String[] args) {
        // creating an Object of Vehicle class
        Vehicle vehicle1 = new Vehicle();
    }
}
/*
Output:-
Error: Cannot inherit from final class
*/