/*
 * #Constructors in Inheritance.
 * 
 * Super() will get inserted in child class constructor by default.
 */
// //example 1
// //First Parent class Constructor will call second Child class Constructor will call.
// class Parent {
//     // Constructor
//     Parent() {
//         System.out.println("Parent Constructor Called"); // Parent Constructor Called
//     }
// }

// class Child extends Parent {
//     // Constructor
//     Child() {
//         // Super() // no need to add Super() call by default java will add it.
//         System.out.println("Child Constructor Called"); // Child Constructor Called
//     }
// }

// public class ConstructorsInInheritance {

//     public static void main(String[] args) {
//         // creating a new object (Child class object)
//         Child childObject = new Child();

//     }
// }

// //example 2 :- Parameterized Constructors
// //First Parent class Constructor will call second Child class Constructor will call.
// class Parent {
//     // Constructor
//     Parent(int a, String s) {
//         System.out.println("Parent Constructor Called : " + a); // Child Constructor Called : 4
//     }
// }

// class Child extends Parent {
//     // Constructor
//     Child(int b) {
//         // super() is used to access Parent class
//         super(4, "Sathya"); // super(4) means nothing but it is a Parent(4);
//         System.out.println("Child Constructor Called : " + b); // Child Constructor Called : 6
//     }
// }

// public class ConstructorsInInheritance {

//     public static void main(String[] args) {
//         // creating a new object (Child class object)
//         Child childObject = new Child(6);

//     }
// }

//example 3
//First Parent class Constructor will call second Child class Constructor will call.
class Parent {
    // Constructor
    Parent(int a) {
        System.out.println("Parent Constructor Called : " + a); // Parent Constructor Called : 6
    }
}

class Child extends Parent {
    // Constructor
    Child(int b) {
        // super() is used to access Parent class
        super(b); // super(4) means nothing but it is a Parent(4);
        System.out.println("Child Constructor Called : " + b); // Child Constructor Called : 6
    }
}

public class ConstructorsInInheritance {

    public static void main(String[] args) {
        // creating a new object (Child class object)
        Child childObject = new Child(6);

    }
}