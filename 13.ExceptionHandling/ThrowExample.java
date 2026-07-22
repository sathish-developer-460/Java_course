// The throw statement allows you to create a custom error.
// the throw statement is used together with an exception type.
// There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException etc:
// thow is used inside a method to actually throw an exception.
// It's a way to explicitly signal that an exception has occurred

// class ThrowExample {
//     static void checkAge(int age) { // static void method
//         if (age < 18) {
//             throw new ArithmeticException("Access denied - You must be at least 18");
//             // Exception in thread "main" java.lang.ArithmeticException: Access denied - You
//             // must be at least 18 (It is a custom error)
//         } else {
//             System.out.println("Access granted - You are old enough!");
//         }
//     }

//     public static void main(String[] args) {
//         checkAge(17); // calling the method directly
//     }
// }

class ThrowExample {
    static void checkAge(int age) { // static void method
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18");
        } else {
            System.out.println("Access granted - You are old enough!");
            // Access granted - You are old enough!
        }
    }

    public static void main(String[] args) {
        checkAge(20); // calling the method directly
    }
}