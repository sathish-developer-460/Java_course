/*
 * #abstract
 * i. if a class is abstract class we can not directly create it's object.
 * AbstractExample.java:19: error: A is abstract; cannot be instantiated
 * A c = new A();
 * ^
 * 1 error
 * ii. it should be extended by other class.
 * iii. Abstract class can contain both abstract methods and normal methods.
 * iv. Abstract methods are method without implementation(only declaration).
 */

// //Example1:-

// abstract class A {
// final int b;

// A() {
// b = 5;
// }
// }

// class AbstractExample {
// public static void main(String[] args) {
// A c = new A();

// System.out.println(c.b); // 5
// }
// }
// // output:-
// // AbstractExample.java:19: error: A is abstract; cannot be instantiated
// // A c = new A();
// // ^
// // 1 error

// //Example 2:- it should be extended by other class.

// abstract class A {
// int b = 5;
// }

// // D is the child class for parent (A)
// class D extends A {
// }

// class AbstractExample {
// public static void main(String[] args) {
// A c = new D();

// System.out.println(c.b);// 5
// }
// }

// //Example 3:- Abstract class can contain both abstract methods and normal
// methods.
// //Make sure Abstract Methods are override in their children classes.

// abstract class A {
// int b = 5;

// abstract void fun();// abstract Method

// // normal method
// void bun() {
// System.out.println(2); // 2
// };
// }

// class D extends A {
// @Override
// void fun() {
// System.out.println("Hello");// Hello
// }
// }

// class AbstractExample {
// public static void main(String[] args) {
// D c = new D();
// c.fun();
// c.bun();
// System.out.println(c.b);// 5
// }
// }
// // output
// // Hello
// // 2
// // 5

//Example 4:-
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
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