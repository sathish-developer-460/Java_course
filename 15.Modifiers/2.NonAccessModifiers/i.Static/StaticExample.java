/*
 * Static member belongs to class not object.
 * Can be directly accessed through class no need of object creation.
 * Will be initialized only once.
 */

/*
 * //Example:-
 * i. if we want to access variable of Chaishop class then we create a new
 * object
 * (new ChaiShop()) then we access variables it is a normal flow regurally we
 * using it.
 * ii. here we have one method which is "static"
 * iii. by using the static method we can access variable of class directly
 * without creating a new object.
 */

// 1. Regular Method with creating new object
// class ChaiShop {
// String branchName = "Bahubali Adda";
// }

// class StaticExample {
// public static void main(String[] args) {
// // creating a new object
// ChaiShop branch1 = new ChaiShop();
// System.out.println(branch1.branchName); // Bahubali Adda

// }
// }

// 2. static Method (without creating a new object)

// class ChaiShop {
// static String branchName = "Bahubali Adda";
// // Will be initialized only once.
// int count = 0;
// }

// class StaticExample {
// public static void main(String[] args) {
// System.out.println(ChaiShop.branchName); // Bahubali Adda
// // here i am creating new two objects to increment the count
// ChaiShop branch1 = new ChaiShop(); // branch1={counter=0};
// ChaiShop branch2 = new ChaiShop();// branch2={counter=0};
// branch1.count++;
// branch2.count++;
// System.out.println("Count of Branch1: " + branch1.count);
// System.out.println("Count of Branch2: " + branch2.count);

// }
// }

// //3.
// /*
// Static: All objects share the same one variable. If any object changes it,
// everyone sees the new value. (Will be initialized only once.)
// Instance: Each object gets its own separate variable. Changing one object's
// copy doesn't touch any other object's copy.
// */
// class ChaiShop {
// static String branchName = "Bahubali Adda";
// // Will be initialized only once.
// static int count = 0;
// int btn = 0;
// }

// class StaticExample {
// public static void main(String[] args) {
// System.out.println(ChaiShop.branchName); // Bahubali Adda
// // // here i am creating new two objects to increment the count
// ChaiShop branch1 = new ChaiShop(); // branch1={counter=0};
// ChaiShop branch2 = new ChaiShop();// branch2={counter=0};
// System.out.println("Count of Branch1: " + branch1.count);// Count of Branch1:
// 0
// System.out.println("Count of Branch2: " + branch2.count);// Count of Branch2:
// 0
// ChaiShop.count++; // 0+1 =1
// System.out.println("Count of Branch1: " + branch1.count);// Count of Branch1:
// 1
// ChaiShop.count++; // 1+1 =2
// branch1.btn++; // 0+1 =1
// System.out.println("Count of Branch1: " + branch1.count);// Count of Branch1:
// 2
// System.out.println("Btn of Branch1: " + branch1.btn);// Btn of Branch1: 1
// branch2.btn++; // 0+1 = 1
// System.out.println("Count of Branch1: " + branch1.count);// Count of Branch1:
// 2
// // Count of Branch1: 2 (same memory location so, 1+1 = 2)

// System.out.println("Count of Branch2: " + branch2.count);// Count of Branch2:
// 2
// System.out.println("Btn of Branch1: " + branch1.btn);
// // Btn of Branch1: 1 (Each object gets its own separate variable)

// System.out.println("Btn of Branch2: " + branch2.btn);
// // Btn of Branch2: 1 (Each object gets its own separate variable)

// }
// }

// // 4. Static methods example
// // Static methods can not access non ststic members.

// class ChaiShop {
// static int a = 2;
// int b = 3; // non static variable

// // static method (void is the return type)
// static void fun() {
// // in static method we can access only static variables.
// // it can not access non-static variables
// System.out.println("static variable: " + a);// 2
// // System.out.println("Fun Method: " + b);
// // StaticExample.java:114: error:
// // non-static variable b cannot be referenced from a static context
// }
// }

// class StaticExample {
// public static void main(String[] args) {
// ChaiShop.fun();
// }
// }

// //5. example

// class MathUtils {
// static int square(int num) {
// return num * num;
// }
// }

// public class StaticExample {
// public static void main(String[] args) {
// System.out.println(MathUtils.square(5)); // 25

// }
// }

// //6. Inner classes can be static.

// class Outer {
// static class Nested {
// static void display() {
// System.out.println("Inside static nested class");
// }
// }
// }

// public class StaticExample {

// public static void main(String[] args) {
// Outer.Nested.display(); // Inside static nested class
// }
// }

// // 7. No inheritance with static members.
// // (First we need to understand few ways of object creation)

// class Parent {
//     int k = 1;
//     int m = 1;

//     // void fun() {
//     // System.out.println("Parent Method: " + 1);// Parent Method: 1
//     // }
// }

// class Child {
//     int k = 2;
//     int m = 2;

//     void fun() {
//         System.out.println("Child Class Method: " + 2); // Child Class Method: 2
//     }
// }

// class StaticExample {
//     public static void main(String[] args) {
//         // create a new object
//         Parent pp = new Parent();
//         System.out.println(pp.k);// 1
//         System.out.println(pp.m);// 1
//         pp.fun();// calling the Fun method of Parent Class
//         Child cc = new Child();
//         System.out.println("cc.k : " + cc.k);// 2
//         System.out.println("cc.m : " + cc.m);// 2
//         cc.fun();// calling the Fun method of Child Class

//     }
// }
// // //output
// // StaticExample.java:185: error: cannot find symbol
// // pp.fun();// calling the Fun method of Parent Class ^
// // symbol: method fun()
// // location: variable pp of type Parent
// // 1 error

// //// 7. No inheritance with static members.
// // (First we need to understand few ways of object creation)

// class Parent {
//     int k = 1;
//     int m = 1;

//     void fun() {
//         System.out.println("Parent Method: " + 1);// Parent Method: 1
//     }
// }

// class Child extends Parent {
//     int k = 2;
//     int m = 2;

//     void fun() {
//         System.out.println("Child Class Method: " + 2); // Child Class Method: 2
//     }
// }

// class StaticExample {
//     public static void main(String[] args) {
//         // create a new object
//         Parent pp = new Parent();
//         System.out.println(pp.k);// 1
//         System.out.println(pp.m);// 1
//         pp.fun();// calling the Fun method of Parent Class
//         Child cc = new Child();
//         System.out.println("cc.k : " + cc.k);// 2
//         System.out.println("cc.m : " + cc.m);// 2
//         cc.fun();// calling the Fun method of Child Class

//     }
// }

// //// 7. No inheritance with static members.
// // (First we need to understand few ways of object creation)

// class Parent {
//     int k = 1;
//     int m = 1;

//     void fun() {
//         System.out.println("Parent Method: " + 1);// Parent Method: 1
//     }
// }

// class Child extends Parent {
//     int k = 2;
//     int m = 2;

//     void fun() {
//         System.out.println("Child Class Method: " + 2); // Child Class Method: 2
//     }
// }

// class StaticExample {
//     public static void main(String[] args) {
//         // create a new object
//         Parent pp = new Parent();
//         System.out.println("Parent Class Of pp.k : " + pp.k);// Parent Class Of pp.k : 1
//         System.out.println("Parent Class Of pp.m : " + pp.m);// Parent Class Of pp.m : 1
//         pp.fun();// calling the Fun method of Parent Class
//         Child cc = new Child();
//         System.out.println("Child Class Of cc.k : " + cc.k);// Child Class Of cc.k : 2
//         System.out.println("Child Class Of cc.m : " + cc.m);// Child Class Of cc.m : 2
//         cc.fun();// calling the Fun method of Child Class
//         /*
//          * i. another way to create a new object for Inheritant classes
//          * Parent pc = new Child();
//          * 
//          * ii. left side reference right side object => here reference will tells that
//          * iii. refernce =>It will print Parent class variable only
//          * (Because of left side Parent Mentioned)
//          * coming to methods whatever method we mentioned in the right side Object like
//          * (Child) Child class methods will be execute Methods (if both Parent and Child
//          * must be have same methods & extends then only left side Child Methods will
//          * execute)
//          * 
//          * iv. Parent pc = new Child();
//          * v. Left -> variables (Variables Must be comes from Mentioned class (Parent)
//          * if Variables are not declared in mentioned class then it getting like
//          * variables are not declared)
//          * vi. Right -> Methods (if both Parent and Child must be have same methods and
//          * must be extends). if left side class (Child Class) methods are not declared
//          * then it takes the right side Class(Parent class Methods.)
//          */
//         Parent pc = new Child();
//         System.out.println("pc.k : " + pc.k);// pc.k : 1 (variable values comes from parent)
//         System.out.println("pc.m : " + pc.m);// pc.m : 1 (variable values comes from child)
//         pc.fun(); //// Child Class Method: 2 (Child Method will triggered)
//     }
// }

// // output
// // Parent Class Of pp.k : 1
// // Parent Class Of pp.m : 1
// // Parent Method: 1
// // Child Class Of cc.k : 2
// // Child Class Of cc.m : 2
// // Child Class Method: 2
// // pc.k : 1
// // pc.m : 1
// // Child Class Method: 2

//// 7. No inheritance with static members.
/*
 * i. Left side Refernce decides, which variables and static members to acces.
 * ii. If Rifght side object don't have same method(non-static) then, Left side
 * Reference only decides which member to access.
 * 
 * iii.Right side Object decides, If same method (non-static) is there in left
 * side refernce and right side object, then right side Object decides which
 * member to access.
 * 
 */
class Parent {

    static void display() {
        System.out.println("Parent Static Method");// Parent Static Method
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child Static Method"); // Child Static Method
    }
}

class StaticExample {
    public static void main(String[] args) {
        // create a new object
        Parent objectParent = new Child();
        Child objectChild = new Child();
        /*
         * Parent objectParent = new Child();
         * left side class is Parent Class it will execute display method of parent
         * class because of Parent class method(display) is declared with static keyword
         * 
         * static => left will decide the methods
         * if both (parent & child) methods are declared with static then child only
         * executed not parent
         */
        objectParent.display();
        objectChild.display();
    }
}

// output
// Parent Class Of pp.k : 1
// Parent Class Of pp.m : 1
// Parent Method: 1
// Child Class Of cc.k : 2
// Child Class Of cc.m : 2
// Child Class Method: 2
// pc.k : 1
// pc.m : 1
// Child Class Method: 2