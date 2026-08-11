/*
2. Super Keyword Call the parent class constructor.
*/

/*
#Constructors in Inheritance
super() will get inserted in child class constructor by 
default. 
*/
//Example1
class Parent {
    // constructor
    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    // constructor
    Child() {
        System.out.println("Child Constructor called");
    }
}

public class ConstructorsInheritanceWithoutSuperExample {
    public static void main(String[] args) {
        // creating an object of child class
        Child child1 = new Child();
        // calling the constructor of child class
    }
}
/*
 * output:
 * Parent constructor called
 * Child Constructor called
 */