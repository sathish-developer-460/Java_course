/*
 * #Final Keyword
 * 
 * i. final keyword makes a variable constant.
 * ii. You can not change or modify it.
 * iii. You should always initialize final variables or we should at least
 * initialized in constructor.
 * 
 */
// // Example 1
// class A {
// // if a variable declared with final keyword it should be intializd with
// value
// final int b = 2;

// }

// class FinalExample {
// public static void main(String[] args) {
// A c = new A();
// c.b = 5;// You can do modify bcz of b variable declared with final keyword
// System.out.println(c.b);// 2
// // can't becomes 5
// }
// }

// // Example 2

// class A {
// // if a variable declared with final keyword it should be intializd with
// value
// // atleast initialized in the constructor function
// final int b;

// A() {
// b = 5;
// }
// }

// class FinalExample {
// public static void main(String[] args) {
// A c = new A();
// System.out.println(c.b);// 5
// }
// }

//Example 3
// Final class can not be extended or inherited

final class Example {
    void display() {
        System.out.println("This is a final class.");
    }
}

// Comilation error: cannot inherit from final class "Example"
class SubClass extends Example {
}

// output:-
// FinalExample.java:56: error: cannot inherit from final Example
// class SubClass extends Example {
// ^
// 1 error