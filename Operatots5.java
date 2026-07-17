class Operatots5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        /*
         * Arthimetic Operators
         * : Multiplication
         * / : Division
         * % : Modulus
         * + : Addition
         * - : Subtraction
         */
        System.out.println("a + b=" + (a + b)); // 13
        System.out.println("a - b=" + (a - b)); // 7
        System.out.println("a * b=" + (a * b));// 30
        System.out.println("a / b=" + (a / b));// 3
        System.out.println("a % b=" + (a % b));// 1
        /*
         * Assignment Operator
         * += , Add and assign
         * -= , Subtract and assign,
         * = , Multiply and assign
         * /= , Divide and assign
         * %= , Modulus and assign.
         */
        int f = 1;
        System.out.println("f +=3: " + (f += 3)); // f= f+3 => f=4
        System.out.println("f -=2: " + (f -= 2)); // f= f-2 => f=2
        System.out.println("f *=4: " + (f *= 4)); // f= f*4 => f=8
        System.out.println("f /=3: " + (f /= 3)); // f= f/3 => f=2

        /*
         * Relational Operators
         * == : Equal to
         * != : Not equal to
         * > : Greater than
         * < : Less than
         * >= : Greater than or equal to
         * <= : Less than or equal to
         */
        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false
        System.out.println("a == c: " + (a == c)); // false
        System.out.println("a != c: " + (a != c)); // true

        /*
         * Logical Operators
         * && : Logical AND : returns true if both the conditions are true
         * || : Logical OR : returns true if any of the conditions is true
         * ! : Logical NOT : returns true when a condition is false and vice versa
         */
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false
        System.out.println("!y: " + (!y)); // true

        /*
         * Unary Operators
         * Unary Operators need only one operand.
         * ++ , Increments by 1.
         * Post- Increment: uses value first, then increments.
         * Pre- Increment: Increments first, then uses value.
         * 
         * -- , Decrements by 1.
         * Post- Decrement: uses value first, then decrements.
         * Pre- Decrement: Decrements first, then uses value.
         */
        int a = 10;
        int b = 10;
        // Postincrement means : first take the value after that increment the value
        // Preincrement means : first increment the value after that take the value

        System.out.println("Postincrement : " + (a++)); // 10
        System.out.println("Preincrement : " + (++a)); // 12
        System.out.println("Postdecrement : " + (b--)); // 10
        System.out.println("Predecrement : " + (--b)); // 8

        /*
         * Ternary Operator
         * condition ? if true : if false
         * ? : if condition is true
         * : : if condition is false
         */

        int n1 = 5, n2 = 10;
        int max;
        System.out.println("First number is: " + n1); // 5
        System.out.println("Second number is: " + n2); // 10
        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;
        // Print the largest number
        System.out.println("Max value is: " + max); // 10
    }

}
