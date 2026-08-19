
// 4. Static methods example
// Static methods can not access non static members.

class ChaiShop {
    static int a = 2;
    int b = 3; // non static variable

    // static method (void is the return type)
    static void fun() {
        // in static method we can access only static variables.
        // it can not access non-static variables
        System.out.println("static variable: " + a);// 2
        // System.out.println("Fun Method: " + b);
        // StaticExample.java:114: error:
        // non-static variable b cannot be referenced from a static context
    }
}

class StaticExample4 {
    public static void main(String[] args) {
        ChaiShop.fun();
    }
}
