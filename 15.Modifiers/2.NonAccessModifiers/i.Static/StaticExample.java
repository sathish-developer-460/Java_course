
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