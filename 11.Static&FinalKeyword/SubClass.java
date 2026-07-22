// //1. Static
// class Counter {
// static int count = 0; // static variable

// static void increment() { // static method
// count++;
// }
// }

// public class StaticVariableExample {
// public static void main(String[] args) {
// // classname.static method
// Counter.increment(); // accessing the static methods & static variables
// // // without creating objects.
// System.out.println(Counter.count); // 1
// Counter.increment();
// // classname.static variable
// System.out.println(Counter.count); // 2
// }
// }

// //2. Final Keywords
// class Final_Ex {
// public final void print() {
// System.out.println("This method csnnot be overridden by any subclass");
// }
// }

// public class SubClass extends Final_Ex {
// // compiler error - cannot override final method
// public void print() {
// System.out.println("This will generate a compiler error");
// }
// }
// // output
// // SubClass.java:30: error: print() in SubClass cannot override print() in
// // Final_Ex
// // public void print() {
// // ^
// // overridden method is final
// // 1 error

// //3. 
public class SubClass {

    public static void main(String[] args) {
        final int MY_CONSTANT = 100;
        // MY_CONSTANT = 200; //This will cause a compilation error
        System.out.println(MY_CONSTANT); // 100
    }
}