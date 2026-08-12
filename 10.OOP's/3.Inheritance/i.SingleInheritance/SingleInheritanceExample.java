/*
# What is Inheritance? 
Inheritance is an Object-Oriented Programming (OOP) concept where a child class (or 
subclass) derives properties (fields) and behaviors (methods) from a parent class (or 
superclass). It promotes code reusability, extensibility, and maintainability. 
 
# Key Features of Inheritance 
1. Code Reusability: Common functionality can be reused in derived classes. 
2. Extensibility: Child classes can extend the functionality of the parent class. 
3. Method Overriding: Child classes can override parent methods to provide specific 
implementations. 
4. Hierarchical Structure: Helps model "is-a" relationships (e.g., a Car is-a Vehicle). 
*/
/*
Types Of Inheritance In Java:-
1. Single Inheritance: A child class inherits from one parent class.
2. Multilevel Inheritance: A child class inherits from a parent class,which itself inherits from another parent class.
3. Hierarchical Inheritance: Multiple child classes inherit from a single parent class.

Note:-  Java does not support multiple inheritance with classes to avoid ambiguity. It is achieved 
through interfaces.
  
*/
/*
 Single Inheritance:-
i.  A child class inherits from a single parent class.
ii. example:  Car inherits from Vehicle. 
 */

//1. Single Inheritance example

class Vehicle {
    int speed;

    // method to display speed of vehicle
    void displaySpeed() {
        System.out.println("Speed of vehicle is: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String brand;

    // method to display brand of car
    void displayBrand() {
        System.out.println("Brand of car is: " + brand);
    }
}

class SingleInheritanceExample {
    public static void main(String[] args) {
        /*
         * creating an object of Car class and accessing methods from both parent and
         * child classes
         */
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.speed = 180;
        car1.displaySpeed(); // calling method from parent class
        car1.displayBrand(); // calling method from child class
    }
}

/*
 * Speed of vehicle is: 180 km/h
 * Brand of car is: Toyota
 */