// //1. Default Constructor
// //Java Program to create and call a default constructor
// class Bike {
// // creating a default constructor
// Bike() {
// System.out.println("Bike is created"); // Bike is created
// }
// }

// public class Constructor {
// // main method
// public static void main(String args[]) {
// // calling a default constructor
// Bike b = new Bike();
// }
// }

// // 2. Parameterized Constructor

// class Student {
// int id;
// String name;

// // creating a parameterized constructor
// Student(int i, String n) {
// id = 1;
// name = n;
// }

// // method to display the values
// void display() {
// System.out.println(id + " " + name);
// // 1 Joseph
// // 1 Sonoo
// }
// }

// // Main class to create objects and class methods
// // public class Main {
// // here you can give naming convention Main or any other name(Constructor)
// public class Constructor {
// public static void main(String args[]) {
// // creating objects and passing values
// Student s1 = new Student(111, "Joseph");
// Student s2 = new Student(222, "Sonoo");
// // calling method to display the values of object
// s1.display();
// s2.display();
// }
// }

// //3.Java Program to overload constructors 
class Student {
    int id;
    String name;
    int age;

    // creating two arg constructor (Parameterized Constructor)
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // creating three arg constructor (Parameterized Constructor)
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // creating method to display values
    void display() {
        System.out.println(id + " " + name + " " + age);
        // 111 Sathish 0
        // 222 Harish 22
    }
}

// creating a Main class to create instance and call methods
public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Sathish");
        Student s2 = new Student(222, "Harish", 22);
        s1.display();
        s2.display();
    }
}