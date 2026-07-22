//Run this function from the terminal:- 
//javac Test.java
//java D
// You will get the output: D

// //5. Hybrid Inheritance

class C {
    public void disp() { // disp is the method
        System.out.print("c");
    }
}

class A extends C { // Single Inheritance
    public void disp() {
        System.out.println("A");
    }
}

class B extends C {
    public void disp() {
        System.out.println("B");
    }
}

class D extends A {
    public void disp() {
        System.out.println("D"); // D
    }

    public static void main(String args[]) {
        D obj = new D();
        obj.disp();
    }
}

// Method Overloading : By changing no.of arguments