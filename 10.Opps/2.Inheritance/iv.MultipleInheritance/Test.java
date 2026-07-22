
// //4. Multiple Inheritance

// // //1st approach

// class A {
// public void execute() {
// System.out.println("Hi.. Executing From Class A");
// }
// }

// class B {
// public void execute() {
// System.out.println("Hi.. Executing From Class B");
// }
// }

// // It won't work

// /*
// * Test.java:124: error: '{' expected
// * class C extends A,B{
// * ^
// * 1 error
// */
// // we overcome this issue with using the interface
// class C extends A,B{

// }

// public class Main {
// public static void main(String[] args) {
// C obj = new C(); // creating object of class c
// obj.execute(); // execute() method is present in both class A and B
// }
// }

//2. here we need to use the interface method
interface A {
    public void execute(int num1);
}

interface B {
    public void execute(int num1);
}

class C implements A, B {
    public void execute(int num1) {
        System.out.println("Hello.. From Implementation Class!!" + num1);
        // Hello.. From Implementation Class!!16
    }
}

public class Test { // Test is the Main
    public static void main(String[] args) {
        C obj = new C();
        obj.execute(16);
    }
}