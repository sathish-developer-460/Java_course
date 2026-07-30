/*
 * #Polymorphism
 * Polymorphism is of 2 types.
 * 1. Compile time polymorphism (Method Overloading).
 * 2. Run time polymorphism (Method Overriding).
 */

// // 1. Compile time polymorphism (Method Overloading)

// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }
// }

// 2. Run time polymorphism (Method Overriding).

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method"); // Child class Method
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Output: Child class Method
    }
}