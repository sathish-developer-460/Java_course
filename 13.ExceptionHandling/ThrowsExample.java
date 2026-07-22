//throws is used in a method declaration that a method might throw one or more exceptions. It doen't throw the exception itself.

// difference between thow and throws
//thow are used to write in method but thows are used to write in method declarations.

// something/ 0 it means infinity
public class ThrowsExample {
    // This method might throw an ArithmeticException
    public static void divideByZero() throws ArithmeticException {
        int result = 10 / 0; // This will throw ArithmeticException
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            // calling the method that might throw an exception
            divideByZero();
        } catch (ArithmeticException e) {
            // Hndling the exception here
            System.out.println("Error: " + e.getMessage()); // Error: / by zero
        }
    }
}