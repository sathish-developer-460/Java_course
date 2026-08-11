class Parent {
    // creating a default constructor
    Parent() {
        System.out.println("Parent Constructor called");
    }
}

class Child extends Parent {
    // creating a default Constructor
    Child(String message) {
        super(); // Explicitly calling Parent's default constructor
        System.out.println("Child Constructor Called: " + message);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        // creating an objects of child class
        Child child1 = new Child("From Child");
    }
}

/*
 * output:
 * Parent Constructor called
 * Child Constructor Called: From Child
 */