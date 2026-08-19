/*
 * Non-Access Modifiers in Java
 * Non-access modifiers in Java define additional properties of classes,
 * methods, or variables.
 * These modifiers control aspects like behavior, memory management, and
 * usability.
 * 
 * 1. Static Modifier
 * The static modifier in Java allows members (variables, methods, and blocks)
 * to belong to
 * the class rather than any specific object. These members are shared among all
 * instances of the
 * class.
 * Features of static:
 * 1. Shared Memory: Static members are stored in a common memory area, saving
 * space.
 * 2. Class-Level Access: Static members can be accessed using the class name
 * without creating
 * an object.
 * 3. Initialization Order:
 * o Static variables and blocks are initialized in the order they appear in the
 * class.
 * 
 * 
 * Static Variables:
 * • Shared among all objects of the class.
 * • Changes made to the variable are reflected across all objects.
 * 
 * 
 * Static Methods:
 * • Can be called using the class name.
 * • Cannot access non-static members directly (since they are tied to objects).
 * 
 */
// Example1
// class Car {
// static int totalCars = 0; // static variable
// String brand;

// // Constructor
// Car(String brand) {
// this.brand = brand;
// totalCars++; // Increment shared variable
// }
// }

// class StaticExample1 {
// public static void main(String[] args) {
// // creating an object of Car Class
// Car car1 = new Car("Audi");
// Car car2 = new Car("Toyota");
// System.out.println("BrandName: " + car1.brand);
// System.out.println("TotalCars: " + Car.totalCars);// Access without Object
// ;
// }
// }

/*
 * Output:-
 * BrandName: Audi
 * TotalCars: 2
 */

// //Example2

class Calculator {
    static int add(int a, int b) {// static method
        return a + b;
    }
}

class StaticExample1 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(6, 4));// accessing without a object
    }
}

/*
 * Output:-
 * 10
 */