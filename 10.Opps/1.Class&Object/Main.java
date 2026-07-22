// //1.
// class Student {
//     // data member (also instance variable)
//     int id;
//     // data member (also instance variable)
//     String n;
// }

// public class Main {
//     public static void main(String args[]) {
//         // creating an object of
//         // Student
//         // Classname objectname = newkeyword constructor (constructor means same
//         // Classname)
//         Student s1 = new Student();
//         Student s2 = new Student();
//         Student s3 = new Student();
//         System.out.println(s1.id);// 0
//         System.out.println(s1.n);// null
//         System.out.println(s2.id);// 0
//         System.out.println(s2.n);// null
//         System.out.println(s3.id);// 0
//         System.out.println(s3.n);// null
//     }

// }

// 2. Class With Methods

class Student {

    int rollno;
    String name; // data members

    // Member function or method
    // insertRecord is the method name
    void insertRecord(int r, String n) {
        // method defination or function defination
        rollno = r; // 111 222
        name = n; // Sathish JavaIsEverything
    }

    // method2
    void displayInformation() {
        System.out.println(rollno + " " + name);
    }

}

public class Main {
    public static void main(String args[]) {
        // s1 and s2 both are objects
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(111, "Sathish"); // method call
        s2.insertRecord(222, "JavaIsEverything");
        s1.displayInformation(); // 111 Sathish
        // calling the method object.methodname()
        s2.displayInformation(); // 222 JavaIsEverything
    }
}