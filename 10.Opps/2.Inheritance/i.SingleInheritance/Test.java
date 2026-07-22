//1. Single Inheritance example
class Parent {
    public void print_karo() { // print_karo is a method
        System.out.println("Java Life"); // Java Life
    }
}

class Child extends Parent {
    public void print_for() { // print_for is a method
        System.out.println("for"); // for
    }
}

// //Driver class
class Main {
    // Main function
    public static void main(String[] args) {
        // classname objectname = new constructor()
        Child g = new Child();
        g.print_karo();
        g.print_for();
    }

}