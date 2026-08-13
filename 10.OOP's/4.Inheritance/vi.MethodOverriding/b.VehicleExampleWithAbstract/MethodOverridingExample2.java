/* Approach 1:- Parent method has A BODY (concrete) */

// //Create a Parent (Base) class
// class Vehicle{
//     String vehicleName;
//     //method
//     void startEngine(){
//     //body
//         System.out.println("Vehicle is Started");
//     }
//     //method
//     void makeSound(){
//         System.out.print("Beep Beep!");
//     }
// }
// class Car extends Vehicle{
//     //method 
//     @Override
//     void startEngine(){
//         System.out.println("Car is Started");
//     }
// }
// class Bike extends Vehicle{
//     //method
//     @Override
//     void startEngine(){
//         System.out.println("Bike is Started");
//     }
// }

// class MethodOverridingExample2{
//     public static void main(String[] args){
//         //creating an object of Car class
//         Car car1 =new Car();
//         //creating an object of Bike class
//         Bike bike1= new Bike();
//         car1.startEngine();//calling the method
//         car1.makeSound(); //// Inherited from Vehicle (not rewritten)

//         System.out.println(" ---- ");

//         bike1.startEngine();//calling the method 
//         bike1.makeSound();//// Inherited from Vehicle (not rewritten)

//     }
// }

// /*
// Output:-
// Car is Started
// Beep Beep! ---- 
// Bike is Started
// Beep Beep!
// */

/* Approach 2:- Parent method has NO BODY (abstract) */

//Create a Parent (Base) class
abstract class Vehicle{
    String vehicleName;
    /* This method has NO BODY so - it's abstract
    Every vehicle starts defferently (Car key, Bike kick, bicycle pedal, truc key)
    */
    abstract void startEngine();//NO BODY
    
    /*This method HAS a body so - it's concrete (normal)
    Every vehicle can makeSound(honk) the SAME way, so we write it ONCE here
    */
    void makeSound(){
        // void honk(){
        System.out.println(" Beep Beep! ");
    }
}
//Create Child class1
class Car extends Vehicle{

    @Override
    void startEngine(){
        System.out.println("Car starts with a key/button.");
    }
}
//Create Child class 2
class Bike extends Vehicle{
    
    @Override
    void startEngine(){
        System.out.println("Bike starts with a kick/self-start.");
    }

}
//Main class to test
class MethodOverridingExample2{
    public static void main(String[] args){
        //creating an object of Car class
        Car car1= new Car();
        //creating an object of Bike class 
        Bike bike1=new Bike();

        car1.startEngine();//calling the method (Car's own version)
        car1.makeSound(); //Method Inherited from Parent(Vehicle) class - (no rewritten)
        System.out.println(" ---- ");
        bike1.startEngine(); //calling the method (Bike's own version)
        bike1.makeSound();//Method Inherited from Parent(Vehicle) class - (no rewritten)
    }
}
/*
Output:-
Car starts with a key/button.
 Beep Beep! 
 ---- 
Bike starts with a kick/self-start.
 Beep Beep! 
*/

/*
# Explanation

abstract class Vehicle — this is our parent class. We made it abstract because we don't want anyone creating a plain "Vehicle" object (a vehicle has to be a specific type — Car, Bike, etc. — a generic "Vehicle" doesn't really exist on its own).

abstract void startEngine(); — no body here. Why? Because a Car starts differently than a Bike. There's no single "correct" way to write this that works for every vehicle. So we leave it blank and force every child to write their own version.

void honk() { ... } — this one HAS a body. Why? Because honking is basically the same for every vehicle — "Beep Beep!" — so instead of writing it again and again in Car, Bike, Truck, etc., we write it once in the parent, and every child automatically gets it for free.

class Car extends Vehicle — Car is a child. It MUST override startEngine() (Java forces this, or code won't compile), but it does NOT need to write honk() again — it simply uses Vehicle's version.

class Bike extends Vehicle — same idea. Bike writes its own startEngine(), but reuses honk() as-is.

In main() — when we call car1.startEngine(), Java runs the Car version. When we call car1.honk(), Java runs Vehicle's version, because Car never rewrote it.


# The one-line rule to remember:

If every child needs different behavior → make it abstract (no body), force everyone to write their own.
If most children can share the same behavior → make it concrete (with body), let children override it only if they specifically need to.
*/