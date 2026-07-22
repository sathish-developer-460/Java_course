
//3.Concept of Hierarchical inheritance

class A {
    public void print_A() {
        System.out.println("Calss A"); // Class A
    }
}

class B extends A {
    public void print_B() {
        System.out.println("Calss B");// Class B
    }
}

class C extends A {
    public void print_C() {
        System.out.println("Calss C");// Class C
    }
}

class D extends A {
    public void print_D() {
        System.out.println("Class D");// Class D
    }
}
// create object for D then we can access D & A classes properties
// create object for C then we can access C & A classes properties
// create object for B then we can access B & A classes properties

// Driver Class
public class Test {
    public static void main(String[] args) {
        // class name object name = newkeyword Constructor()
        B obj_B = new B();
        obj_B.print_A();// accessing the methods of A class
        obj_B.print_B();// accessing the methods of B class

        C obj_C = new C();
        obj_C.print_A();
        obj_C.print_C();

        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();

    }
}