/*
3. Abstract Modifier 
The abstract modifier is used for incomplete classes or methods. These classes or methods 
must be implemented in subclasses. 
 
Abstract Classes: 
• Cannot be instantiated. 
• Can have both abstract and concrete (non-abstract) methods. 
• Used when some behavior is common but certain details vary across subclasses. 
 */

/* Example1:- */

abstract class Vehicle{
  abstract void start(); //Abstract method
  void stop(){ //concrete method
    System.out.println("Vehicle Stopped.");
  }
}
class Car extends Vehicle{
  void start(){ //Implement abstract method
    System.out.println("Car started.");
  }
}
class AbstractExample{
  public static void main(String[] args){
    //creating an object of Vehicle class
    Car car1= new Car();
    car1.start(); 
    car1.stop();
  }
}
/*
Car started.
Vehicle Stopped.
*/

/* Example 2:- */
abstract class Animal {
    // Abstract method
    abstract void sound(); //no body so we should write abstract to method and class

    // Concrete method
    void eat() {
        //body
        System.out.println("This animal eats food."); // This animal eats food.
    }
}

class Dog extends Animal {
    // Implement the abstract method
    void sound() {
        System.out.println("Dog barks."); // Dog barks.
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Dog barks.
        myDog.eat(); // This animal eats food.
    }
}
/*
Output:-
Dog barks.
This animal eats food.
*/