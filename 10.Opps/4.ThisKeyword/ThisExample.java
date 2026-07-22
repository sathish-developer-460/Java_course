// // 1.this: to refer current class instance variable
// class Student {
//     int rollno;
//     String name;
//     float fee;

//     Student(int rollno, String name, float fee) {
//         // this.x = instance variable, x = constructor parameter
//         //this means current class
//         this.rollno = rollno;
//         this.name = name;
//         this.fee = fee;
//     }
//  void display() {
//         System.out.println(rollno + " " + name + " " + fee);
//         //111 ankit 5000.0
//         //112 sumit 6000.0
//     }
// }
// // Must be a separate top-level class, not nested inside Student
//     public class ThisExample {
//         // Here you can write Main or ThisExample(naming convention is our wish)
//       public static void main(String args[]) {
//         Student s1 = new Student(111, "ankit", 5000f);
//         Student s2 = new Student(112, "sumit", 6000f);
//         s1.display();
//         s2.display();
//     }
// }

// //2. this: to invoke current class method

// class A{
//     void m(){ //method1
//         System.out.println("hello m"); //hello m (Second this will execute)
//     }
//     void n(){//method2
//         System.out.println("hello n"); //hello n (First this will execute)
//         //m(); //same as this.m()
//         this.m();
//     }
// }
// public class ThisExample{
//     public static void main(String args[]){
//         A a=new A();
//         a.n();
//     }
// }

// 3.this(): to invoke current class constructor

class A{
    A() {
        System.out.println("hello a"); //hello a
    }
    A(int x){
        this();
        System.out.println(x);//10
    }
}
public class ThisExample{
    public static void main(String args[]){
        A a=new A(10);
    }
}

