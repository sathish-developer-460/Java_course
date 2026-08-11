/*
Example5: Parent Constructor Overloaded, Subclass Must Choose
*/
class Parent {
    // creating a parameterized constructor
    Parent(String message) {
        System.out.println("Parent Constructor Called: " + message);
    }
}

class Child extends Parent {
    // creating a default constructor
    Child() {
        super("Overloaded Parent Constructor");
        System.out.println("Child Constructor Called");
    }
}

public class ParentConstructorOverloadedExample {
    public static void main(String[] args) {
        // creating an object of child class
        Child child1 = new Child();

    }
}
/*
 * output:
 * Parent Constructor Called: Overloaded Parent Constructor
 * Child Constructor Called
 */
