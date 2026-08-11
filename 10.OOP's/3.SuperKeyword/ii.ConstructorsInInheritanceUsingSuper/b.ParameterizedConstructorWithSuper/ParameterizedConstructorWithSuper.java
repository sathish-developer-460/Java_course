class Parent {
    // creating a parameterized constructor
    Parent(String message) {
        System.out.println("Parent Constructor: " + message);
    }
}

class Child extends Parent {
    // creating a parameterized constructor
    Child(String message) {
        super("From Parent"); // calls the parent class constructor
        System.out.println("Child Constructor: " + message);
    }
}

public class ParameterizedConstructorWithSuper {
    public static void main(String[] args) {
        // creating an object of child class
        Child child1 = new Child("From Child");
    }
}

/*
 * output:
 * Parent Constructor: From Parent
 * Child Constructor: From Child
 */