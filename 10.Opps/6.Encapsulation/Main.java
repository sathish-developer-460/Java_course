// //1.Private
// class A {
// private void display() { // display is the method declared as private
// System.out.println("GreeksforGeeks");
// }
// }

// class B {
// public static void main(String args[]) {
// A obj = new A();
// // Trying to access private method of another class
// obj.display();
// }
// }
// // output
// // error: display() has private access in A
// // obj.display();
// // Reason:- private class methods accesible with in the private class we can
// not access in another class.

// //2.Private Variable
// class Data {
// // private variable
// private String name;
// }

// public class Main {
// public static void main(String[] main) {
// // create an object of Data
// Data d = new Data();
// // access private variable and field from another class
// d.name = "JavaLife";
// }
// }
// // output:
// // error: name has private access in Data
// // d.name = "JavaLife";
// // we can not access private class variables in another class;

//3. Protected
class Animal {
    protected String name;

    protected void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    void bark() {
        makeSound();
        System.out.println(name + " barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.bark(); // Accessing protected members in subclass
    }
}
// //output
// Buddy makes a sound
// Buddy barks
