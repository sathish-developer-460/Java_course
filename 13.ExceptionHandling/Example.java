//1. without try catch blocks
// class Example {
//     public static void main(String[] args) {
//         int[] myNumbers = { 1, 2, 3 };
//         System.out.println(myNumbers[10]); // error
//         // Index 10 out of bounds for length 3 at Example.main(Example.java:4)
//     }
// }

// //2.Exception handing with try catch blocks
// class Example {
//     public static void main(String[] args) {
//         try {
//             int[] myNumber = { 1, 2, 3 };
//             System.out.print(myNumber[10]);
//         } catch (Exception e) {
//             System.out.println("Something went wrong."); // Something went wrong.
//         }
//     }
// }

// //3. Exception handling with try, catch, finally blocks

// class Example {
//     public static void main(String[] args) {
//         try {
//             int[] myNumbers = { 1, 2, 3 };
//             System.out.println(myNumbers[10]);
//         } catch (Exception e) {
//             System.out.println("Something went wrong."); // Something went wrong.
//         } finally {
//             // error unna lekunna it will be execute
//             System.out.println("The 'try catch' is finished."); // The 'try catch' is finished.
//         }
//     }
// }

//4. without error

class Example {
    public static void main(String[] args) {
        try {
            System.out.println("Try block executed."); // Try block executed.
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally { // it will execute default
            // error unna lekunna it will be execute
            System.out.println("The 'try catch' is finished."); // The 'try catch' is finished.
        }
    }
}