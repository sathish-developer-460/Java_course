// //1. Method Overloading : By changing data type of arguments
// //MethodOverloading happens in single class only.
// class Adder {
//     // Method to add two integers
//     static int add(int a, int b) {
//         return a + b;
//     }

//     // Method to add two doubles (Two methods names are same)
//     static double add(double a, double b) {
//         return a + b;
//     }
// }

// public class MethodOverloading {
//     public static void main(String[] args) {
//         // Calling the add method with two integers
//         System.out.println(Adder.add(11, 11)); // Output: 22
//         // Calling the add method with two doubles
//         System.out.println(Adder.add(12.3, 12.6)); // output:24.9
//     }
// }

//  //2. Method OverRiding
// class Animal {
//     public void displayInfo() { // method
//         System.out.println("I am an animal");
//     }
// }

// class Dog extends Animal {
//     public void displayInfo() { // method
//         System.out.println("I am a dog."); // I am a dog.
//     }
// }

// class MethodOverRiding {
//     public static void main(String[] args) {
//         // childclass object = new class();
//         Dog d1 = new Dog();
//         // childclass object.method()
//         d1.displayInfo(); // (child call method will call)

//     }
// }

// //2. Method OverRiding
class Animal {
    public void displayInfo() { // method
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public void displayInfo() { // method
        super.displayInfo(); // it helps to call the parent class method
        System.out.println("I am a dog."); // I am a dog.
    }
}

class MethodOverRiding {
    public static void main(String[] args) {
        // childclass object = new class();
        Dog d1 = new Dog();
        // childclass object.method()
        d1.displayInfo(); // (child call method will call)

    }
}
// output
// I am an animal
// I am a dog.