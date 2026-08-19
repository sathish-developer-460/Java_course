
// /* 7. No inheritance with static members. */

// class Parent {
//     int k = 1;
//     int m = 1;

//     // method
//     void display() {
//         System.out.println("Parent Class Method");
//     }
// }

// class Child {
//     int k = 2;
//     int m = 2;

//     // method
//     void display() {
//         System.out.println("Child class Method");
//     }
// }

// class NoInheritanceExample {
//     public static void main(String[] args) {
//         // creating an object of Parent class
//         Parent parent1 = new Parent();
//         System.out.println("Parent1.k: " + parent1.k);
//         System.out.println("Parent1.m: " + parent1.m);
//         parent1.display();
//         // Creating an object of Child class
//         Child child1 = new Child();
//         System.out.println("Child1.k: " + child1.k);
//         System.out.println("Child1.m: " + child1.m);
//         child1.display();
//     }
// }

// /*
//  * output
//  * 
//  * Parent1.k: 1
//  * Parent1.m: 1
//  * Parent Class Method
//  * Child1.k: 2
//  * Child1.m: 2
//  * Child class Method
//  * 
//  */

//// 7. No inheritance with static members.
// (First we need to understand few ways of object creation)

class Parent {
    int k = 1;
    int m = 1;

    void fun() {
        System.out.println("Parent Method: " + 1);// Parent Method: 1
    }
}

class Child extends Parent {
    int k = 2;
    int m = 2;

    void fun() {
        System.out.println("Child Class Method: " + 2); // Child Class Method: 2
    }
}

class NoInheritanceExample {
    public static void main(String[] args) {
        // create a new object
        Parent pp = new Parent();
        System.out.println(pp.k);// 1
        System.out.println(pp.m);// 1
        pp.fun();// calling the Fun method of Parent Class
        Child cc = new Child();
        System.out.println("cc.k : " + cc.k);// 2
        System.out.println("cc.m : " + cc.m);// 2
        cc.fun();// calling the Fun method of Child Class

    }
}
/*
 * Output:-
 * 1
 * 1
 * Parent Method: 1
 * cc.k : 2
 * cc.m : 2
 * Child Class Method: 2
 */