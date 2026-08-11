class Parent {
    // creating a constructor
    Parent() {
        System.out.println("Parent Constructor Called");
    }
}

class Child extends Parent {
    // creating an object of child class
    Child() {
        // super(); // Implicitly calling the parent class constructor
        System.out.println("Child Constructor Called");
    }
}

public class ImplicitlyCalledSuperKeywordExample {
    public static void main(String[] args) {
        // creating an object of child class
        Child child = new Child();
    }
}

/*
 * output:
 * Parent Constructor Called
 * Child Constructor Called
 */