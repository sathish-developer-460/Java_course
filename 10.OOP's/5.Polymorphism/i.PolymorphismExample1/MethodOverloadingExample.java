/*
 * 
 * # What is Polymorphism?
 * 
 * Polymorphism is a key feature of Object-Oriented Programming (OOP) that
 * allows a
 * single entity (method, operator, or object) to behave differently based on
 * the context. The
 * term "Polymorphism" is derived from the Greek words "poly" (many) and "morph"
 * (forms), meaning "many forms."
 * 
 * Types of Polymorphism in Java:-
 * 
 * 1. Compile-Time Polymorphism (Static Binding):
 * o Achieved through method overloading.
 * o The method to be executed is determined at compile time.
 * 2. Run-Time Polymorphism (Dynamic Binding):
 * o Achieved through method overriding.
 * o The method to be executed is determined at runtime.
 * 
 * 1. Compile-Time Polymorphism (Method Overloading)
 * Method Overloading occurs when multiple methods in the same class have the
 * same name but different parameters (type, number, or order).
 */

class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with different parameter types
    double add(double a, double b) {
        return a + b;
    }
}

class MethodOverloadingExample {
    public static void main(String[] args) {
        // creating an object of Calculator class
        Calculator calculator1 = new Calculator();
        System.out.println("Sum of 2 Integers: " + calculator1.add(5, 10));
        System.out.println("Sum of 3 Integers: " + calculator1.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calculator1.add(5.5, 10.5));

    }
}

/*
 * Output:-
 * Sum of 2 Integers: 15
 * Sum of 3 Integers: 30
 * Sum of 2 doubles: 16.0
 */