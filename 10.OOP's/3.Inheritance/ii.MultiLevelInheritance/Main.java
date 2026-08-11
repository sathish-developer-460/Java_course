
// 2. Multilevel Inheritance (Level by level) ex:- Grand Father->Father->Son
// First Parent Class
class Parent1 {
    void fun1() {
        System.out.println("1st Layer"); // 1st Layer
    }
}

// Child of parent1 class
class Parent2 extends Parent1 {
    // Parent2 is the child class of Parent1.
    void fun2() {
        System.out.println("2nd Layer"); // 2nd Layer
    }
}

// Child of parent2 Class
class Parent3 extends Parent2 {
    void fun3() {
        System.out.println("3rd Layer"); // 3rd Layer
    }
}

// Driver class
class Main {
    // Main function

    public static void main(String[] agrs) {
        Parent3 g = new Parent3();
        g.fun1();
        g.fun2();
        g.fun3();
    }
}