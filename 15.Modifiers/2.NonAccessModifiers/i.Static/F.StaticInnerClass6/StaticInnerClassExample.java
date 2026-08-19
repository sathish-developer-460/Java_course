/* 6. Inner classes can be static. */

class Outer {
    static class Inner {
        // method
        static void display() {
            System.out.println("Static Inner Class is Called.");
        }
    }
}

class StaticInnerClassExample {
    public static void main(String[] args) {
        Outer.Inner.display(); // calling the inner static diaply method
    }
}
/*
 * Output:-
 * 
 * Static Inner Class is Called.
 */
